/** FileOutputStream
 * ==================
 * 1. To write/append data in  file.
 */

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_Write {
    public static void main(String[] args) throws IOException {
        // Make file if it's not made.
        // 2nd arg: bool -> append to that file if exits(True)
        FileOutputStream fos = new FileOutputStream("file.txt", true);
        String str = "Arain\n";

        char[] chArr = str.toCharArray();
        for (char c: chArr) {
            fos.write(c);
        }
        fos.close(); 
    }
}