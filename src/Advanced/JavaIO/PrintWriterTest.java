package Advanced.JavaIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterTest {
    public static void main(String[] args) {
        File file = new File("IO_Files/file1.txt");
        writeToFileUsingPrintWriter(file, "Hallo World");
    }

    public static void writeToFileUsingPrintWriter(File f, String text) {
        try (PrintWriter printWriter = new PrintWriter(f)) {
            printWriter.println(text);
            printWriter.flush();
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
