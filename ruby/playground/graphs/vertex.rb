class Vertex

  attr_accessor :id, :connected_to, :status, :distance, :predecessor

  def initialize(id)
    @id = id
    @connected_to = {}
    @status = :unvisited
    @distance = 0
    @predecessor = nil
  end

  def add_neighbour(nbr_vertex, weight=0)
    @connected_to[nbr_vertex] = weight
  end

  def get_connections
    return @connected_to.keys()
  end

  def to_s
    ap self
    return ""
  end
end
