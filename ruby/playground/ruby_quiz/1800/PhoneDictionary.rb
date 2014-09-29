#
class PhoneDictionary
  # read in words from dict
  # read in each letter and convert to digit
  # use-ruby => 873.7829
  # 873 = use,
  def self.import_from_file(file_name)
    # TODO: throw exception if file not readable etc
    words = Sets.new
    file = File.open(file_name, "r")
    file.read_line do |line|
      words
    end
    file.close
  end

  def self.file_exists?(file_name)
    return false unless file_name
    return false if File.exist?(file_name)
    return true
  end

  def self.file_useable?(file_name)
    return false unless self.file_exists?(file_name)
    return false unless File.readable?(file_name)
    return false unless File.writable?(file_name)
    return true
  end

end