public class AbstractClass {
    public static void main(String[] args) {
        GeometricFigure figure1 = new Rectangle();
        figure1.draw();

        figure1 = new Circle();
        figure1.draw();
    }
}

// ABSTRACT CLASS
// cannot be instantiated
abstract class GeometricFigure {
    public abstract void draw();
}

class Rectangle extends GeometricFigure {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Circle extends GeometricFigure {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}