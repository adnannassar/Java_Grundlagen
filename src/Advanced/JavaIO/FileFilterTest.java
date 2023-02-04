package Advanced.JavaIO;

import java.io.File;
import java.io.FileFilter;

public class FileFilterTest {
    public static void main(String[] args) {
        File file = new File("IO_Files");
        TxtFilter txtFilter = new TxtFilter();
        File[] textFiles = file.listFiles(txtFilter);
        for (int i = 0; i < textFiles.length; i++) {
            System.out.println(textFiles[i].getName());
        }


        System.out.println("\n");

        File[] pdfFiles = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                if (file.getName().toLowerCase().endsWith(".pdf")) {
                    return true;
                } else {
                    return false;
                }
            }
        });

        for (int i = 0; i < pdfFiles.length; i++) {
            System.out.println(pdfFiles[i].getName());
        }
    }
}
