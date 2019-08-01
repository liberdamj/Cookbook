# Triangle Class

class Triangle:
    # 3 sides are passed in with default values of 3
    def __init__(self, sideOne=3, sideTwo=3, sideThree=3):
        self.sideOne = sideOne
        self.sideTwo = sideTwo
        self.sideThree = sideThree
        self.perimeter = (self.sideOne + self.sideTwo + self.sideThree)
        self.semiPerimeter = (self.perimeter / 2)
        self.area = ((self.semiPerimeter*(self.semiPerimeter-self.sideOne)*(self.semiPerimeter-self.sideTwo)*(self.semiPerimeter-self.sideThree)) ** 0.5)

    def getSideOne(self):
        return self.sideOne

    def getSideTwo(self):
        return self.sideTwo

    def getSideThree(self):
        return self.sideThree

    def getPerimeter(self):
        return self.perimeter

    def getArea(self):
        return self.area

if __name__ == '__main__':
    print()
    print("This is the Triangle Class within the shape package.")
    print("##################################################")
    print("Authored by Malachi Liberda")
    print("E-Mail: liberdamj@gmail.com")
    print()
    print("Creation syntax:")
    print("triangle.Triangle(sideOne, sideTwo, sideThree)")
    print("Available methods:")
    print("getSideOne, getSideTwo, getSideThree, getPerimeter, getArea")
