package JavaWorks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreditCardValidationTest {
    private CreditCardValidation creditCardValidation;

    @BeforeEach
    public  void setUp(){
        creditCardValidation = new CreditCardValidation();
    }
    @Test
    public void testThatCreditCardExist(){
        assertNotNull(creditCardValidation);
    }
    @Test
    public void getPrefixOfCreditCardTest(){
        int number = creditCardValidation.getPrefix(234556,4);
        assertEquals(2345,number);
    }
    @Test
    public void testThatCreditCardHasSize(){
       int number = creditCardValidation.getSize(2346);
        assertEquals(4, number);
    }
    @Test
    public void testThatPrefixCanBeMatched(){
         boolean question = creditCardValidation.getPrefixMatched(234556, 2);
         assertTrue(question);
    }
    @Test
    public void testThatCreditCardCanSumOddPlaceOfDigits(){
        int number = creditCardValidation.sumOfOddPlace(235678923);
        assertEquals(26, number);
    }
   @Test
    public void testThatCreditCardCanGetDigits(){
        int number = creditCardValidation.getDigit(2345);
        assertEquals(14, number);
   }
   @Test
    public void  testThatCreditCardCanSumDoubleEvenPlaceDigits(){
        int number = creditCardValidation.sumOfDoubleEvenPlace(235678923);
        assertEquals(20, number);
   }
   @Test
    public void testThatCreditCanIsValid(){
        boolean validation = creditCardValidation.isValid(4192);
        assertTrue(validation);
   }
}

