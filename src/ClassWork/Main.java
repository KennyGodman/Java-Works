package ClassWork;

public class Main {
    // Method to reverse a string in Java using `StringBuilder`
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String str = "I am Godman";

        // Note that string is immutable in Java
        str = reverse(str);

        System.out.println("The reversed string is " + str);

    }
}


//public class Test {

  //  public static void main(String args[]) {
    //    StringBuffer sbf = new StringBuffer("I am Godman");
      //  System.out.println("String buffer = " + sbf);

        // Here it reverses the string buffer
//        sbf.reverse();
  //      System.out.println("String buffer after reversing = " + sbf);
    //}
//}