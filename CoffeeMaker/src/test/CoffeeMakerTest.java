package test;

import exceptions.NotEnoughBeansException;
import exceptions.TooManyBeansException;
import exceptions.WaterException;
import model.CoffeeMaker;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.fail;


public class CoffeeMakerTest {

    private CoffeeMaker cmaker = new CoffeeMaker();

    @Before
    public void initialize(){
        CoffeeMaker cmaker = new CoffeeMaker();
    }

    @Test
    public void testBrew(){
        // Testing whether brew works under normal conditions
        try {
            cmaker.brew(2.5,15);
        } catch (NotEnoughBeansException e) {
            fail("Not enough beans");
        } catch (TooManyBeansException e) {
            fail("Too many beans");
        } catch (WaterException e) {
            fail("Not enough water");
        }
    }

    @Test
    public void testTimeSetter() {
        // Testing whether brew works under normal conditions
        try {
            cmaker.setTimeSinceLastBrew(14);
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void pourCoffee() {
        // Testing whether brew works under normal conditions
        try {
            cmaker.brew(2.5,15);
            cmaker.setTimeSinceLastBrew(15);
            cmaker.pourCoffee();
        } catch (Exception e) {
            fail();
        }
    }




}
