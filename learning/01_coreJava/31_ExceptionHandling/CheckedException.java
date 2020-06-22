import java.io.*;

public class CheckedException {
    
    // // This function compiled successfully but throws at run-time
    // public static void main(String[] args) throws IOException, IllegalThreadStateException
    // {
    //     throw new IOException();
    // }
    
    public static void main(String[] args) {
        try {
            throw new IOException();
        }
        catch(IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    } 
}