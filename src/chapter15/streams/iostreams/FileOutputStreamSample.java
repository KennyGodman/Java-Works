package chapter15.streams.iostreams;

import java.io.*;

public class FileOutputStreamSample {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("test.txt");
        PrintWriter writer = new PrintWriter(fos)) {
          writer.println("We are Africans !!!!");
          writer.close();
       }catch (IOException exception){
            System.out.println(exception.getLocalizedMessage());
        }
    }
}
