package main;

import exceptions.NotEnoughBeansException;
import exceptions.StaleCoffeeException;
import exceptions.TooManyBeansException;
import exceptions.WaterException;
import model.CoffeeMaker;

public class Main {

    public static void main(String[] args) {
        CoffeeMaker c = new CoffeeMaker();
        try {
            c.brew(2.3,15);
        } catch (NotEnoughBeansException e) {
            System.out.println("Too few beans, try adding more than 2.4 and less than 2.6");
        } catch (TooManyBeansException e) {
            System.out.println("Too many beans, try adding more than 2.4 and less than 2.6");
        } catch (WaterException e) {
            System.out.println("Too little water, try adding than 14.7 cups of water");
        }
        try {
            c.pourCoffee();
        } catch (StaleCoffeeException e) {
            System.out.println("Coffee too stale");
            ;
        } catch (Exception e) {
            System.out.println("No more cups left");
            ;
        }
    }


}