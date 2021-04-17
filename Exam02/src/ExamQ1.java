
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pramod Reddy Gonegari
 */
public class ExamQ1 {

   
    public static void main(String[] args) {
        
        System.out.println("Pramod Reddy Gonegari");
        System.out.println("Answer for Question 1:");
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.print("Enter ten integers: ");
        for (int i = 1; i <= 10; i++) {
            list.add(sc.nextInt());
        }

        ExamQ1.removeDuplicate(list);

        System.out.print("The distinct integers are ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

    }

    /**
     * Method to remove duplicate elements from an ArrayList.
     *
     * @param list
     */
    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                }
            }
        }
    }

}
