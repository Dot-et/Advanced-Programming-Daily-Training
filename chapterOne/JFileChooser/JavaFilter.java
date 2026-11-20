package JFileChooser;import java.io.File;
import javax.swing.filechooser.FileFilter;

public class JavaFilter extends FileFilter {

    @Override
    public boolean accept(File f) {

        if (f.isDirectory()) {
            return true;
        }

        return f.getName().toLowerCase().endsWith(".java");
    }

    @Override
    public String getDescription() {
        return "Java Files (*.java)";
    }
}