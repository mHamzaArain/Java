/** BufferedReader
 * ================
 * 1. This allows to write string as whole
 *      due to modified buffer space 
 * 
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class BufferedReader_Reader  {   
    public static void main(String[] args) throws IOException{
        // FileReader class is used as object that can be used as:
        // obj = new FileReader(PATH)
        BufferedReader bw = new BufferedReader(new FileReader(
            "/media/hamza/linux/Coding/Java/learning/fileHandling/BufferedReader_Reader/file.txt"));
        int i; // i=0
        boolean flag = true;
        while(flag) {
            i = bw.read();
            if (i != -1) // i = no char 
                System.out.print((char)i);
            else 
                flag = false;
        }
        bw.close();
    }
}