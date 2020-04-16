
'''
Like we used comparator fn in C++ for sort() as III argument
in Python it is key keyword field

'''
class I:
    def __init__(self):
        pass
    def __init__(self,name="",marks=""):
        self.name = name
        self.marks = marks
    def display(self):
        print(self.name,self.marks)

print("How many objects?")
num = int(input())

ls = []

for i in range(num):
    name = input("Name...  ")
    marks = float(input("Marks...  "))
    ls.append(I(name,marks))

for item in ls:
    item.display()

ls.sort(key = lambda x : x.name)

for item in ls:
    item.display()
