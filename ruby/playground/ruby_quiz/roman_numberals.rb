class RomanNumerals
  # I = 1
  # V = 5
  # X = 10
  # L = 50
  # C = 100
  # D = 500
  # M = 1000
  def convert_to_roman(number)
    roman_numerals = {:I => "I",
                      :V => "V",
                      :X => "X",
                      :L => "L",
                      :C => "C",
                      :D => "D",
                      :M => "M"}
    res = ""
    while number > 0
      puts "#{number}"
      case
        when number >= 1000 && number % 1000 >= 0
          res += roman_numerals[:M]
          number = number - 1000
        when number >= 500 && number % 500 >= 0
          res += roman_numerals[:D]
          number = number - 500
        when number >= 100 && number % 100 >= 0
          res += roman_numerals[:C]
          number = number - 100
        when number >= 50 && number % 50 >= 0
          res += roman_numerals[:L]
          number = number - 50
        when number >= 10 && number % 10 >= 0
          res += roman_numerals[:X]
          number = number - 10
        when number >= 9 && number % 9 >= 0
          res += roman_numerals[:I] + roman_numerals[:X]
          number = number - 9
        when number >= 5 && number % 5 >= 0
          res += roman_numerals[:V]
          number = number - 5
        when number >= 4 && number % 4 >= 0
          res += roman_numerals[:I] + roman_numerals[:V]
          number = number - 4
        else
          number.times {
            res += roman_numerals[:I]
            number = number - 1
          }
        end
      end
    res
  end
end