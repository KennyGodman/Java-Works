package JavaWorks;

import java.util.ArrayList;
import java.util.Scanner;

public class Phonebook {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            ArrayList<String> contactName = new ArrayList<String>();
            ArrayList<String> contactAddress = new ArrayList<String>();
            ArrayList<String> contactNumber = new ArrayList<String>();
            ArrayList<String> contactEmail = new ArrayList<String>();

            String exit = "";

            while(exit.isEmpty()){
                System.out.println("ENTER CONTACT NAME: ");
                String name = input.nextLine();
                contactName.add(name);

                System.out.println("ENTER CONTACT ADDRESS");
                String address = input.nextLine();
                contactAddress.add(address);

                System.out.println("ENTER CONTACT NUMBER");
                String number = input.nextLine();
                contactNumber.add(number);

                System.out.println("ENTER CONTACT EMAIL");
                String email = input.nextLine();
                contactEmail.add(email);

                System.out.println("PRESS q TO QUIT");
                exit = input.nextLine();
            }

            System.out.println("NAME: " + contactName + "\n" +
                    "ADDRESS: " + contactAddress + "\n" +
                    "NUMBER: " + contactNumber + "\n" +
                    "EMAIL: " + contactEmail
            );

        }


    }
