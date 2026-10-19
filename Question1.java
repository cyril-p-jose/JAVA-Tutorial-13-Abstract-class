// Abstract Class
abstract class Shape {
    abstract void numberOfSides();
    abstract void sumOfAngles();
}

// Rectangle Class
class Rectangle extends Shape {
    private int sides = 4;

    @Override
    void numberOfSides() {
        System.out.println("Number of sides in Rectangle: " + sides);
    }

    @Override
    void sumOfAngles() {
        int sum = (sides - 2) * 180;
        System.out.println("Sum of angles of Rectangle: " + sum + " degrees");
    }
}

// Triangle Class
class Triangle extends Shape {
    private int sides = 3;

    @Override
    void numberOfSides() {
        System.out.println("Number of sides in Triangle: " + sides);
    }

    @Override
    void sumOfAngles() {
        int sum = (sides - 2) * 180;
        System.out.println("Sum of angles of Triangle: " + sum + " degrees");
    }
}

// Hexagon Class
class Hexagon extends Shape {
    private int sides = 6;

    @Override
    void numberOfSides() {
        System.out.println("Number of sides in Hexagon: " + sides);
    }

    @Override
    void sumOfAngles() {
        int sum = (sides - 2) * 180;
        System.out.println("Sum of angles of Hexagon: " + sum + " degrees");
    }
}

// Main Class
public class Question1 {
    public static void main(String[] args) {
        Shape rect = new Rectangle();
        Shape tri = new Triangle();
        Shape hex = new Hexagon();

        rect.numberOfSides();
        rect.sumOfAngles();
        System.out.println();

        tri.numberOfSides();
        tri.sumOfAngles();
        System.out.println();

        hex.numberOfSides();
        hex.sumOfAngles();
    }
}
