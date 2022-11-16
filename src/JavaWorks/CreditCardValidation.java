package JavaWorks;

public class CreditCardValidation {

    public int getPrefix(int number, int k) {
        String numberAsString = String.valueOf(number);
        String result = "";
        if (k <= numberAsString.length()) {
            for (int i = 0; i < k; i++) {
                result += numberAsString.charAt(i);
            }
            return Integer.parseInt(result);
        }
        return number;
    }

    // private String convertToString(int number){
    //   return String.valueOf(number);
    //}

    public int getSize(int number) {
        String numberAsString = String.valueOf(number);
        return numberAsString.length();

    }

    public boolean getPrefixMatched(int number, int k) {
        String numberAsString = String.valueOf(number);
        if (String.valueOf(k).equals(String.valueOf(numberAsString.charAt(0 )))) {
            return true;
        }
        return false;
    }

    public int sumOfOddPlace(int number) {
        String numberAsString = String.valueOf(number);
        int oddSum = 0;
        for (int i = numberAsString.length() - 1; i >= 0; i -= 2) {
            oddSum = oddSum + Integer.parseInt(String.valueOf(numberAsString.charAt(i)));
        }
        return oddSum;
    }

    public int getDigit(int number) {
        String numberAsString = String.valueOf(number);
        int sumOfDigit = 0;
        if (numberAsString.length() == 1) {
            return number;
        }
        for (int i = 0; i < numberAsString.length(); i++) {
            sumOfDigit = sumOfDigit + Integer.parseInt(String.valueOf(numberAsString.charAt(i)));
        }
        return sumOfDigit;
    }

    public int sumOfDoubleEvenPlace(int number) {
        String numberAsString = String.valueOf(number);
        int evenSum = 0;
        for (int i = numberAsString.length() - 2; i >= 0; i -= 2) {
            int num = Integer.parseInt(String.valueOf(numberAsString.charAt(i))) * 2;
            evenSum = evenSum + getDigit(num);
        }
        return evenSum;
    }

    public boolean isValid(int number) {
        String numberAsString = String.valueOf(number);
      //  if( sumOfOddPlace(number) + String.valueOf(sumOfDoubleEvenPlace(number));
        return (sumOfOddPlace(number )+sumOfDoubleEvenPlace(number)) % 10 == 0;
    }

}




