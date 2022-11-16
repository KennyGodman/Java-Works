package chapter15.streams.files;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;

public class JavaNioSample {
    public static void main(String[] args) throws IOException {
        //java.nio classes Paths and Files
        //and interfaces Path and DirectorySteam

        Path path = Paths.get("Users\\GodMan\\Desktop\\newworks");
        System.out.println("is a directory -> " + Files.isDirectory(path));
        System.out.println("is a directory -> " + Files.isHidden(path));
        DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);

        for (Path path1 : directoryStream) {
            System.out.println("is directory -> " + Files.isDirectory(path1));
        }
    }
}