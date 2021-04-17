
/**
 *
 * @author Pramod Reddy Gonegari
 */
public class Loan{
    String loanID;
    double loanAmount;
    double interestRate;
    
    Loan(){

    }

    public Loan(String loanID, double loanAmount, double interestRate) {
        this.loanID = loanID;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
    }

    /**
     * Returns a String in a specified format.
     * @return 
     */
    @Override
    public String toString() {
        return "Loan{" +
                "LoanID = " + loanID +
                ", loanAmont = " + loanAmount +
                ", interestRate = " + interestRate +
                '}';
    }
}