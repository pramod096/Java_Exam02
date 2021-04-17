
/**
 *
 * @author Pramod Reddy Gonegari
 */
public enum AeroPlane {
    FIRST_CLASS(999.99), BUSINESS(749.99), ECONOMY(499.99);

    private double price;

    private AeroPlane(double price) {
        this.price = price;
    }

}
