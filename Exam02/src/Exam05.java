
/**
 *
 * @author Pramod Reddy Gonegari
 */
public class Exam05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Pramod Reddy Gonegari");
        System.out.println("Answer for Question 5:");

        Person p = new Person("Pramod", "Horizons", "6602150760", "pramodreddy096@gmail.com");
        Student s = new Student(4.0, "Sruthi", "Horizons", "2199161880", "sruthikolluri2@gmail.com");
        Employee e = new Employee("CSIS", 120000.00, "03/29/2021", "Raj", "Horizons", "5672152790", "rajvelpur5140@gmail.com");
        Faculty f = new Faculty(8.0, 2, "IIC", 100000.00, "01/03/2021", "Vinay", "Village O", "9951789263", "paspulavinay@gmail.com");
        Staff st = new Staff("Supervisor", "CITE", 140000.00, "04/11/2021", "Vivek", "Parkway", "9848935425", "tadiparthivivek@gmail.com");

        System.out.println(p.toString());
        System.out.println(s.toString());
        System.out.println(e.toString());
        System.out.println(f.toString());
        System.out.println(st.toString());
    }

}
