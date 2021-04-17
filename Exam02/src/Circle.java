
/**
 *
 * @author S541903
 */
public class Circle{
    double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    /**
     * Returns a String in a specified format.
     * @return String
     */
    @Override
    public String toString() {
        return "Circle{" +
                "diameter = " + diameter +
                '}';
    }
}
