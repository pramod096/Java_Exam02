
import java.util.Scanner;

/**
 *
 * @author Pramod Reddy Gonegari
 */
public class Exam06 {

    public static void main(String args[]) {

        System.out.println("Pramod Reddy Gonegari");
        System.out.println("Answer for Question 6:");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the three Sides, Color & if Triangle is Filled");

        Triangle t = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(),
                sc.next(), sc.nextBoolean());

        System.out.println("The area of Triangle is: " + Math.round(t.area() * 100.00) / 100.00);
        System.out.println("The perimeter of Triangle is: " + t.perimeter());
        System.out.println("The Traingle is of color " + t.getColor());
        System.out.println("The Triangle is Filled: " + t.isIsFilled());
    }
}
