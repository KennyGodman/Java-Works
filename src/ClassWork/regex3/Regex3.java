package ClassWork.regex3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Regex3 {
    public static void main(String[] args) {
        validateEmail();
    }

    public static void validateEmail(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter your Password: ");
            String email = scanner.next();
            System.out.println(isValidPassWord(email));
        }
        catch (InvalidEmailException e){
            System.out.println(e.getMessage());
            validateEmail();
        }
    }

    public static boolean isValidEmail(String email){
        boolean isValid = email.matches("[a-z].[a-z]+@semicolon.africa");
        if(isValid) return true;
        else throw new InvalidEmailException("Invalid Email");
    }

    public static boolean isValidEmail2(String email){
        Pattern pattern = Pattern.compile("[a-z].[a-z]+@semicolon.africa");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean isValidPassWord(String password){
        Pattern pattern = Pattern.compile(  "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,23}");
//        Pattern pattern = Pattern.compile(  "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
