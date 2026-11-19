import javax.swing.*;
import java.io.File;
public class FileInspector {
    static void main(){
        String fileName = " ";
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;



        File workDir = new File(System.getProperty("user.dir"));

        try {
            JFileChooser chooser = new JFileChooser(System.getProperty("user.dir"));
        }catch(Exception e){}
    }
}

