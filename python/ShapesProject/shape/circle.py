# Circle Class

import math

class Circle:
    # Radius is passed in when constructor called else default is 5
    def __init__(self, radius=5):
        self.radius = radius
        self.circumference = (2 * (math.pi * self.radius))
        self.diameter = (radius * 2)
        self.area = (math.pi * (radius * radius))

    def getRadius(self):
        return self.radius

    def getDiameter(self):
        return self.diameter

    def getCircumference(self):
        return self.circumference

    def getArea(self):
        return self.area


if __name__ == '__main__':
    print()
    print("This is the Circle Class within the shape package.")
    print("##################################################")
    print("Authored by Malachi Liberda")
    print("E-Mail: liberdamj@gmail.com")
    print()
    print("Creation syntax:")
    print("circle.Circle(radius)")
    print("Available methods:")
    print("getRadius, getDiameter, getCircumference, getArea")
