package chapter15.streams.files;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {
    public static void main(String[] args) {
        // open clients.txt, output data to the file then close clients.txt
         try (Formatter output = new Formatter("clients.txt")) {
             Scanner scanner = new Scanner(System.in);
            System.out.printf("%s%n%s%n? ","Enter account number, first name, last name and balance","Enter end-of-file indicator to end input.");
             while (scanner.hasNext()) { // loop until end-of-file indicator
                try {
                    //output new record to file: assumes valid input
                    output.format("%d %s %s %.2f%n", scanner.nextInt(),
                            scanner.next(), scanner.next(), scanner.nextDouble());
                }catch (NoSuchElementException exception) {
                    System.err.println("Invalid input. Please try again.");
                    scanner.nextLine(); // discard input so user can try again
                }
                    System.out.print("? ");
                     }
                  }
              catch (SecurityException | FileNotFoundException | FormatterClosedException exception) {
                  exception.getStackTrace();
                  }
              }
         }


