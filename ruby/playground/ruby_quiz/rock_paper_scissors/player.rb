class Player
  @@players = [ ]
  def self.inherited( player )
    @@players << player
  end
  def self.each_pair
    (0...(@@players.size - 1)).each do |i|
      ((i + 1)...@@players.size).each do |j|
        yield @@players[i], @@players[j]
      end
    end
  end
  def initialize( opponent_name )
    @opponent_name = opponent_name
  end
  def choose
    raise NoMethodError, "Player subclasses must override choose()."
  end
  def result( your_choice, opponents_choice, win_lose_or_draw )
# do nothing-subclasses can override as needed
  end
end
