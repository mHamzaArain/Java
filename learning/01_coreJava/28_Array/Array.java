import java.util.Scanner;

class Array {
    public static void main(String[] args) {
        int _1D[] = new int[5];
        String _2D[][] = new String[3][3];  //row, column
        Scanner sc = new Scanner(System.in);
        
        // // 1D _1Day
        System.out.print("Enter 5 numbers: ");

        // Input in _1Day
        for (int i=0; i< _1D.length; i++) 
          {  _1D[i] = sc.nextInt(); }

        // Print 1D _1Day
        for (int i=0; i<_1D.length; i++) 
           { System.out.println("_1D["+ i +"] = " + _1D[i]); }
    
        // 2D _1Day
        System.out.print("Enter 9 times: ");
        
        // Input in _1Day
        for (int i=0; i< _2D.length; i++) {
            for (int j=0; j < _2D[i].length; j++){
                _2D[i][j] = sc.next();
            }
        }
    
        // Print 2D _1Day
        for (String data[]: _2D) {
            for (String scoop: data) {
                System.out.print(scoop+ " ");
            }
        }
    }
}    
