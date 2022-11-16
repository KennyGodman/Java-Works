package chapter15.streams;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {
            DataInputStream dataInputStream = new DataInputStream(System.in);
//        BufferedReader reader = new BufferedReader(new InputStreamReader(dataInputStream));

            try {
//            System.out.println("I read:: " + reader.readLine());

                byte [] bytes = new byte[10];
                dataInputStream.readNBytes(bytes, 0, 8);
                System.out.println("byte array representation of input:: " + Arrays.toString(bytes));
                System.out.print("actual string rep:: ");
                for(byte b : bytes){
                    System.out.print((char)b);
                }
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }