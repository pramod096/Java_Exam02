
/**
 *
 * @author Pramod Reddy Gonegari
 */
public class ExamQ8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Pramod Reddy Gonegari");
        System.out.println("Answer for Question 8:");

        ColdenHall ch = new ColdenHall("Colden Hall", 150, 230.00, 120.78, 99.68);

        System.out.println("Area of Building is " + ch.buildingArea() + " square meters");
        System.out.println("Volume of building is " + ch.buildingVolume() + " cubic meters");
    }

}
