# Authored by Malachi Liberda
# E-mail: liberdamj@gmail.com

from shape import circle, rectangle, triangle

def BuildShapes():

    #  Circle is created(radius of 5)
    circleDefault = circle.Circle()
    # Circle with Radius of 10 is created
    circleOne = circle.Circle(10)
    # Print out values of Circles
    printCircle(circleDefault)
    printCircle(circleOne)

    #  Rectangle is created(width and height of 2)
    rectangleDefault = rectangle.Rectangle()
    # Rectangle with width and height of 5 and 7 is created
    rectangleOne = rectangle.Rectangle(5, 7)
    # Print out values of Rectangles
    printRectangle(rectangleDefault)
    printRectangle(rectangleOne)

    # Triangle is created(sides all of 3 value)
    triangleDefault = triangle.Triangle()
    # Triangle is created with sides of 5, 6, and 7
    triangleOne = triangle.Triangle(5, 6, 7)
    # Print out values of Triangles
    printTriangle(triangleDefault)
    printTriangle(triangleOne)


# Print Rectangle Attributes Function
def printRectangle(rectangle):
    print()
    print("RECTANGLE")
    print("#############################################")
    print("Width:", rectangle.getWidth())
    print("Height:", rectangle.getHeight())
    print("Area:", rectangle.getArea())
    print("Perimeter:", rectangle.getPerimeter())
    print("Is a Square:", rectangle.isSquare())

# Print Triangle Attributes Function
def printTriangle(triangle):
    print()
    print("TRIANGLE")
    print("#############################################")
    print("SideOne:", triangle.getSideOne())
    print("SideTwo:", triangle.getSideTwo())
    print("SideThree:", triangle.getSideThree())
    print("Perimeter:", triangle.getPerimeter())
    print("Area:", triangle.getArea())

# Print Circle Attributes Function
def printCircle(circle):
    print()
    print("CIRCLE")
    print("#############################################")
    print("Radius:", circle.getRadius())
    print("Diameter:", circle.getDiameter())
    print("Circumference:", circle.getCircumference())
    print("Area:", circle.getArea())

if __name__ == '__main__':
    BuildShapes()
