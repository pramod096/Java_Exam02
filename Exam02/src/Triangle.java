
/**
 *
 * @author Pramod Reddy Gonegari
 */
public class Triangle extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;
    private String color;
    private boolean isFilled;

    public Triangle(double side1, double side2, double side3, String color, boolean isFilled) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
        this.isFilled = isFilled;
    }
    
      public String getColor() {
        return color;
    }

    public boolean isIsFilled() {
        return isFilled;
    }

    @Override
    public double area() {
        double p = perimeter();
        
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}
