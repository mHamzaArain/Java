/** BufferedWriter
 * ================
 * 1. This allows to write string as whole
 *      due to modified buffer space 
 * 
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class BufferedWriter_Writer  {   
    public static void main(String[] args) throws IOException{
        // FileWriter class is used as object that can be used as:
        // obj = new FileWriter()
        BufferedWriter bw = new BufferedWriter(new FileWriter(
        "/media/hamza/linux/Coding/Java/learning/fileHandling/BufferedWriter/file.txt",
        true)); // append = true
        bw.write("Computer is up machine");
        bw.close();
    }
}