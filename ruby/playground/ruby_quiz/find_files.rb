def find_files(current_dir, to_find)
  Dir.entries(current_dir) do |item|
    puts "Got #{item}"
    puts File.file?(item)
    if File.file?(item) && item == to_find
      puts "found item!"
      return
    end
  end
  puts "end"
end

find_files("find_test", "me.txt")