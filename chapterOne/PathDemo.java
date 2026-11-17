import java.nio.file.*;
public class PathDemo {
    public static void main(String[] args) {
     Path path=   Paths.get("C:\\Java\\student\\course.txt");
        System.out.println("File: " + path.getFileName());
        System.out.println("Parent: "+ path.getParent());
        System.out.println("Root: "+ path.getRoot());
        System.out.println("count: "+path.getNameCount());
        System.out.println(Files.exists(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isExecutable(path));
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isDirectory(path));
        System.out.println(Files.isRegularFile(path));
        
    }
    
}
