package Advanced.JavaIO;


import java.io.File;
import java.io.FileFilter;

public class TxtFilter implements FileFilter {

    @Override
    public boolean accept(File file) {
        if (file.getName().toLowerCase().endsWith(".txt")) {
            return true;
        } else {
            return false;
        }
    }
}
