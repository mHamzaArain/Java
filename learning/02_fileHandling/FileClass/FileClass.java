/**
 * File Class
 * ===========
 * 1. Abstract representation of file & directory
 *    pathnames.
 * 2. Every file has metadata that has info:
 *      * name, size, permissions, etc.
 */

import java.io.File;
import java.io.IOException;

class FileClass {
    //This code must be either try/catch/fianlly block OR by use of throws to handle exception.
    public static void main(String[] args) throws IOException {
        File f1 = new File("/media/hamza/linux/Coding/Java/learning/fileHandling/FileClass/preMadeFile.txt");
        File f2 = new File("/media/hamza/linux/Coding/Java/learning/fileHandling/FileClass/postMadeFile.txt");
        f2.createNewFile();

        // Existance check at runtime.
        System.out.println(f1.exists()); // True; Checkk existance
        System.out.println(f1.canWrite()); // True: File permissions
        System.out.println(f1.length()); // 9; file size in byte
        System.out.println(f1.getName()); // preMadeFile.txt; file name
        System.out.println(f1.getAbsolutePath()); // Get abs path
        System.out.println(f1.toPath()); // Get abs path
        System.out.println(f1.isHidden()); // false; Check hidden or not
        
        f2.delete(); // delete file
    }
}