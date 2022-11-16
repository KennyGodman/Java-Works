package ClassWork.com;


import java.util.Arrays;

public class Create {
    public static void main(String[] args) {
        Create create = new Create();
        String[] array1 = {"Phone", "Laptop", "Glasses"};
        String[] array2 = {"Loud", "Food", "Dope"};
        System.out.println(create.equals(array1,array2));
    }
    public static boolean equals(String[] array1, String[] array2) {
        if (array1.length != array2.length)
            return false;

        for (int i = 0; i < array1.length; ++i) {
            if ((array1[i] == array2[i])) {
                return true;
            }
        }

        return false;
    }
}
