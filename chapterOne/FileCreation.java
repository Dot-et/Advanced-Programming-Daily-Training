import java.io.IOException;
import java.nio.file.*;
public class FileCreation {
    public static void main(String[] args) throws IOException {
        Path path=Paths.get("course.txt");
        try{
            Files.createFile(path);

            System.out.println("File created");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        Path path1=Paths.get("student.txt");
        try{
            Files.createFile(path1);

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
         Path paths=Paths.get("student/Records/Courses");
        try{
           
            Files.createDirectories(paths);
            System.out.println("Directory created");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        // coping and moving files
        //copy
//Files.copy(path,path1);
       // System.out.println("File copied");
        // move
       // Files.move(path1, paths);
       // System.out.println("File moved");
        // get root directory
        Iterable<Path> dirs=FileSystems.getDefault().getRootDirectories();
        for(Path name :dirs){
            System.out.println("Name: "+name);
        }
        Path temp = Files.createTempDirectory("student_");

System.out.println(temp);
    // Permission
    System.out.println("Readable: "+Files.isReadable(path));
    System.out.println("Writable: "+Files.isWritable(path1));
    }
    
}
