require_relative 'vertex'
require 'awesome_print'
#require 'gratr/import'

class Graph

  attr_accessor :vert_list, :num_verticies

  def initialize
    @vert_list = {}
    @num_verticies = 0
  end

  def add_vertex(id)
    return nil unless !@vert_list.has_key?(id)

    @num_verticies += 1

    new_vertex = Vertex.new(id)
    @vert_list[id] = new_vertex
    return new_vertex
  end

  def get_vertex(id)
    return nil unless @vert_list.has_key?(id)

    @vert_list[id]
  end

  def add_edge(from, to, weight=0)
    if !get_vertex(from)
      add_vertex(from)
    end

    if !get_vertex(to)
      add_vertex(to)
    end

    @vert_list[from].add_neighbour(@vert_list[to], weight)
  end

end

# BFS
# Given a graph G and a starting vertex s, a breadth first search proceeds by
# exploring edges in the graph to find all the vertices in G for which there is a path from s.
# O (E + V) Time
# O(V) Space
def bfs(g, s)
  return unless g
  return unless s

  q = Queue.new

  q << s
  s.status = :visiting
  s.distance = 0
  s.predecessor = nil

  until q.empty?
    curr = q.pop
    puts "Visiting #{curr.id}"

    curr.get_connections.each do |nbr|
      if (nbr.status == :unvisited)
        puts "Visiting neighbour #{nbr.id}"

        nbr.status = :visiting
        nbr.distance = curr.distance += 1
        nbr.predecessor = curr
        q << nbr
      end
    end
    curr.status = :visited

    puts "===="
  end
end

def traverse(y)
  x = y
  while (x.predecessor) do
    puts x.id
    x = x.predecessor
  end
  puts x.id

end

g = Graph.new
s = g.add_vertex(1)
g.add_edge(1, 2)
g.add_edge(1, 5)

g.add_vertex(2)
g.add_edge(2, 3)
g.add_edge(2, 4)

g.add_vertex(5)
g.add_edge(5, 6)
g.add_edge(5, 7)

ap g.vert_list

bfs(g, s)

# now we have a BFS tree so we can traverse back up to root from given vertex
traverse(g.get_vertex(4))
