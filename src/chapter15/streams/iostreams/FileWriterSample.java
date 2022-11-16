package chapter15.streams.iostreams;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterSample {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("Users\\GodMan\\Desktop\\newworktest.txt")){
            fileWriter.write("Just do it!!");
        }catch(IOException exception){
         exception.printStackTrace();

        }
    }
}
