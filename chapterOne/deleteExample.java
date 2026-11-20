import java.io.IOException;
import java.nio.file.*;
public class deleteExample {
    public static void main(String[] args) throws Throwable {
        Path filePath=Paths.get("Sara.txt");
        try{
            Files.createFile(filePath);
            System.out.println(" File created sucessfully");
            //Files.delete(filePath);
            System.out.println("File deleted");
        }catch(NoSuchFileException E){
            System.out.println(E.getMessage());
        }
        
    }
}
