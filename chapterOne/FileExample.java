import java.nio.file.*;
public class FileExample{
    public static void main(String[] args){
      Path path=Paths.get("course.txt") ;
      System.out.println(path); 
    }
}