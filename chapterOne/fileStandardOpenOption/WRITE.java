package fileStandardOpenOption;
import  static java.nio.file.StandardOpenOption.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
                                                                                                                                 
public class WRITE {
    public static void main(String[] args) throws IOException {
        try{
            Path path=Paths.get("Message.txt");
            //Files.createFile(path);
            Files.writeString(path,"Hello Yeshi",WRITE);
            System.out.println("File written sucessfully ");
            Files.writeString(path,"How are you?",WRITE);
        // Apend 
        Files.writeString(path,"\n Now l am a third year Software Engineering Student at DBU",WRITE,APPEND);
        Files.writeString(path,"New Information",TRUNCATE_EXISTING);
        try (var writer = Files.newBufferedWriter(
        path,
       CREATE,
        WRITE,
        DELETE_ON_CLOSE
     )) {

    writer.write("Temporary information");

}

            
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
