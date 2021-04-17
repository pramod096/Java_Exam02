
import java.util.Scanner;

/**
 *
 * @author Pramod Reddy Gonegari
 */
public class ExamQ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Pramod Reddy Gonegari");
        System.out.println("Answer for Question 2:");
        
        Scanner sc = new Scanner(System.in);

        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];

        System.out.print("Enter list1: ");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter list2: ");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m2[i][j] = sc.nextInt();
            }
        }

        boolean eq = ExamQ2.equals(m1, m2);

        if (eq) {
            System.out.println("The two arrays are strictly identical");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }

    }

    /**
     * Method to identify if two integers arrays are strictly identical or not.
     * @param m1
     * @param m2
     * @return Boolean
     */
    public static boolean equals(int[][] m1, int[][] m2) {

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

}
