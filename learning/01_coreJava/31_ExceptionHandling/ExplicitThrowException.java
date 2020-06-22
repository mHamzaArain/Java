/**
 * 1. We want to set a diff. msg.
 * 2. Java can't recognize exceptional situation 
 *      of business logic.
 */

public class ExplicitThrowException {
    public static void main(String[] args) {
        try {
            int balance = 5000;
            int withDrawalAmount = 3000;
    
            if (balance < withDrawalAmount)
                throw new ArithmeticException("Insufficient balance");
    
            balance = balance-withDrawalAmount;
            System.out.println("Transaction successfully completed");    
        }
        catch (ArithmeticException e) {
            System.out.println("Exception: "+ e.getMessage());
        }
        System.out.println("Program continue..");
    }    
}