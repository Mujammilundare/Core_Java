def writing_in_python():
    with open("pdata", "w") as f:
        f.write(str(666))
        f.write("Hello")

writing_in_python()