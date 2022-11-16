package chapter15.streams.iostreams;

import dataStructure.List;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class PrintStreamSample {
    public static void main(String[] args) {
            String [] cars = {"Honda", "Toyota", "Nissan", "Peugeot"};
        try(FileOutputStream fos = new FileOutputStream("cars.txt");
                PrintStream printStream = new PrintStream(fos)){
            System.setOut(printStream);
            for(String car : cars){
                System.out.println(car);
            }

        }catch (IOException exception){
           exception.printStackTrace();

        }
    }
}
