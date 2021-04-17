
/**
 *
 * @author Pramod Reddy Gonegari
 */
public class Faculty extends Employee {

    private double officeHours;
    private int subjects;

    public Faculty(double officeHours, int subjects, String office, double salary, String dateHired, String name, String address, String phoneNumber, String email) {
        super(office, salary, dateHired, name, address, phoneNumber, email);
        this.officeHours = officeHours;
        this.subjects = subjects;
    }
    
    @Override
    public String toString(){
        return "Class Name: " + getClass().getName() + ", Person Name: " + getName();
    }

}
