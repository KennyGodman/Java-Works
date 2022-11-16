package chapter5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
// calculating a fairtax
public class FairTaxCalculatorTest {
    private FairTaxCalculator fairTaxCalculator;
    @BeforeEach
    public void setUp(){
        fairTaxCalculator = new FairTaxCalculator();
    }
    @Test
    public void testThatFairTaxExist(){
        assertNotNull(fairTaxCalculator);
    }
    @Test
    public void testThatFairTaxCanBeCalculated(){
        //given
        Product product = new Product("milo", 100.00);
        //when
        double tax = fairTaxCalculator.calculateTax(product.getPrice());
        //assert
        assertEquals(23.00, tax);
    }
    @Test
    public void testThatProductsTotalPriceCanBeCalculated(){
        //given
        fairTaxCalculator.setTotalPrice(50.00);
        //when
       double totalPrice = fairTaxCalculator.calculateTotalPrice(30.00);
       //assert
        assertEquals(80.00, totalPrice);

    }

}
