package ClassWork;

public class ReverseString {

        public static void main(String[] args) {
                String input = "I am Godman";

                // convert String to character array
                // by using toCharArray
                char[] reversing = input.toCharArray();

                for (int i = reversing.length - 1; i >= 0; i--)
                    System.out.print(reversing[i]);
            }
        }


