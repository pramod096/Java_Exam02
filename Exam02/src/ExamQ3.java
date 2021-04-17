
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Pramod Reddy Gonegari
 */
public class ExamQ3{
    public static void main(String[] args) {
        
        System.out.println("Pramod Reddy Gonegari");
        System.out.println("Answer for Question 3:");
        
        ArrayList<Object> obj = new ArrayList<Object>();
        obj.add(new Loan("LIC64", 100000.00, 11.5));
        obj.add(new Date());
        obj.add("Exam 02 Question 03");
        obj.add(new Circle(6.0));
        
        for(Object x : obj){
            System.out.println(x.toString());
        }
    }
}
