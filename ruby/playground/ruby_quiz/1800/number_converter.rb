# For each phone number read, output all possible word replacements from a dictionary. Your script should try to replace every digit of the provided phone number with a letter from a dictionary word; however, if no match can be made, a single digit can be left between two words. No two consecutive digits can remain unchanged, and the program should skip over a number (producing no output) if a match cannot be made.

# All punctuation and whitespace should be ignored in both phone num- bers and the dictionary file. The program should not be case sensitive, letting "a" == "A". Output should be capital letters, and digits should
# be separated at word boundaries with a single hyphen (-), one possible encoding per line.
class NumberConverter
  DIGIT_TO_CHAR_DICT = {2 => "ABC", 3 => "DEF", 4 => "GHI", 5 => "JKL", 6 => "MNO", 7 => "PQRS", 8 => "TUV", 9 => "WXYZ"}

  # approach
  # loop through each given phone number - strip out all spaces and punctuation
  #
end