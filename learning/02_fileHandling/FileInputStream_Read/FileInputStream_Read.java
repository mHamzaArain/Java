/** FileInputStream
 * =================
 * 1. REading data form file means extracting data stored inthe file
 *      (without deleting it from the file).
 * 2. FileInputStream is meant for reading streans of 
 *      raw bytes.
 * 3. A FileInputStream obtain input bytes from a 
 *      file in a file system.
 */

import java.io.FileInputStream;
import java.io.IOException;

class FileInputStream_Read {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/media/hamza/linux/Coding/" + 
        "Java/learning/fileHandling/FileInputStream_Read/file.txt");

        int i; // i=0
        boolean flag = true;
        while(flag) {
            i = fis.read();
            if (i != -1)
                System.out.print((char)i);
            else 
                flag = false;
        }
        fis.close();
    }
}