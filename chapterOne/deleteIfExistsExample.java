import java.nio.file.*;
import java.io.IOException;
public class deleteIfExistsExample {
    public static void main(String[] args) {
        Path filePath=Paths.get("Yodit.txt");
        try{
            Files.createFile(filePath);
         boolean deleted=   Files.deleteIfExists(filePath);
         if(deleted){
            System.out.println("File deleted ");
         }
         else{
            System.out.println(" File does not  exist");
         }
            
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}
