import os
f=open("practice.txt","w")
f.write("hello everyone\ni am learning file i/o\nusing java.")
f.close()
with open("practice.txt","r")as f:
    data=f.read()
newdata=data.replace("java","python")
print(newdata)
with open("practice.txt","w")as f:
    f.write(newdata)
os.remove("hello.txt")