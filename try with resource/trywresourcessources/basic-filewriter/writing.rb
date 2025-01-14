def writing_in_ruby 
    File.open('rdata', 'w') do |f|
        f.write(666)
        f.write("Hello")
    end
end

writing_in_ruby