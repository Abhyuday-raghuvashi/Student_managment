# default database of student
student1={
    "Abhyuday Singh":"name",
    "Roll no":3,
    "subject":{
        "Physics":76,
        "Chemistry":55,
        "mathematics":87
    },
    "Result":"pass"
}
student2={
    "pavillion":"name",
    "Roll no":53,
    "subject":{
        "Physics":43,
        "chemistry":21,
        "mathematics":97
    },
    "Result":"fail"
}
s=input("dataset/Result")
if(s=="dataset"):
    student3={
        input("Enter the name"):"name",
        "Roll no":int(input("enter the roll no")),
        "subject":{
            "physics":int(input("physics marks")),
            "chemistry":int(input("chemistry marks")),
            "mathematics":int(input("mathematics marks"))
        },
        "Result":input("enter the result")
    }

if s=="Result":
    h=input("enter the name")
    t=input("enter the subject")
    if h in student1:
        print(student1["subject"][t])
    elif h in student2:
        print(student2["subject"][t])
