package fileStandardOpenOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.*;
import java.io.IOException;

public class CREATE_NEW {
    public static void main(String[] args) throws Throwable {
        Path path=Paths.get("Sudent.txt");
        try{
        Files.writeString(path,"New file content", CREATE_NEW);
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        
        
    }
    
}
