/**
 * Annonyms Class(Annonyms Inner Class)
 * ===================================== 
 * 1. They are always inner class & defined inside another class.
 * 2. This class has no name thus pointed pointed ref variable.
 * 3. Syntax:
 *         <ObjectType> <varName> = new <ObjectType>() {}; 
 */

class Money {
    private String currency;
    public void setCurrency(){ 
        String currency = "DOLLER";
    }
}

class Pakistan {   
    private String currency;
    
    // Annonyms class
    Money currencyType = new Money() {
        public void setCurrency(String curr) {
            String currency = curr;
        } 
    };  
}

public class AnnonymsClass {
    public static void main(String[] args) {
        // Calling annonyms class
        Pakistan pkr = new Pakistan();
        pkr.currencyType.setCurrency();
    }   
}