# Rectangle Class

class Rectangle:
    # Width and Height are passed in with default values of 2
    def __init__(self, width=2, height=2):
        self.width = width
        self.height = height
        self.area = (self.width * self.height)
        self.perimeter = ((self.width * 2) + (self.height * 2))

    def getWidth(self):
        return self.width

    def getHeight(self):
        return self.height

    def getArea(self):
        return self.area

    def getPerimeter(self):
        return self.perimeter

    def isSquare(self):
        if(self.width == self.height):
            return True
        else:
            return False

if __name__ == '__main__':
    print()
    print("This is the Rectangle Class within the shape package.")
    print("##################################################")
    print("Authored by Malachi Liberda")
    print("E-Mail: liberdamj@gmail.com")
    print()
    print("Creation syntax:")
    print("rectangle.Rectangle(width, height)")
    print("Available methods:")
    print("getWidth, getHeight, getArea, getPerimeter, isSquare")
