package Advanced.JavaIO;

import java.io.*;

public class FileStreams {
    public static void main(String[] args) {
        File file = new File("IO_Files/test.txt");
        readTextFile(file);
        writeIntoTextFile(file, "Hello World");
    }

    public static void readTextFile(File file) {
        try (FileInputStream fileInputStream = new FileInputStream(file);
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream)) {
            int letter;
            while ((letter = bufferedInputStream.read()) != -1) {
                System.out.print((char) letter);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeIntoTextFile(File file, String text) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)) {
            char[] textAsCharArray = text.toCharArray();
            for (int i = 0; i < textAsCharArray.length; i++) {
                bufferedOutputStream.write(textAsCharArray[i]);
            }
            bufferedOutputStream.flush();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
