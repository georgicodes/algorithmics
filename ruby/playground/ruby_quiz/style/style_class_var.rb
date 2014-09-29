class Parent
  @@class_var = 'parent'

  def self.print_class_var
    puts @@class_var
  end
end

class Child < Parent
  @@class_var = 'child'
end

class What < Child
  @@class_var = "what"
end

Parent.print_class_var