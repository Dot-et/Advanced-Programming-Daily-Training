import java.nio.file.*;
public class PathExample{
    public static void main(String[] args) {
        Path path=Paths.get("course.txt");
        System.out.println(path);
        System.out.println(path.getFileName());
        System.out.println(path.getParent());
        System.out.println(path.getNameCount());
        System.out.println(path.getRoot());
        System.out.println(path.isAbsolute());
        System.out.println(path.toString());
        System.out.println(path.toAbsolutePath());
        System.out.println(path.normalize());
          }
}