import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import static java.nio.file.AccessMode.*;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;


public class checkAcess{
    public static void main(String[] args) throws IOException {
        Path filePath=Paths.get("Yeshi.txt");
      //  Files.createFile(filePath);
        filePath.getFileSystem().provider().checkAccess(filePath);
        System.out.println("The file is existed");
        filePath.getFileSystem().provider().checkAccess(filePath, READ);
        System.out.println("The file is readable");
        filePath.getFileSystem().provider().checkAccess(filePath, WRITE);
        System.out.println("The file is writable");
        filePath.getFileSystem().provider().checkAccess(filePath, EXECUTE);
        System.out.println("The file excuted sucessfully");
        Files.writeString(filePath, "Hello, World!", StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.SYNC);
        // file attribute
      BasicFileAttributes attr =
    Files.readAttributes(
        filePath,
        BasicFileAttributes.class
    );
        System.out.println("Creation time: " + attr.creationTime());
        System.out.println("Last modified time: " + attr.lastModifiedTime());
        System.out.println("Last accessed time: " + attr.lastAccessTime());
        System.out.println("File size: " + attr.size());

    }
}