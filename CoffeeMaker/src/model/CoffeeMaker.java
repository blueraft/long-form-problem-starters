package model;

import com.sun.tools.corba.se.idl.constExpr.Not;
import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;
import exceptions.NotEnoughBeansException;
import exceptions.StaleCoffeeException;
import exceptions.TooManyBeansException;
import exceptions.WaterException;

/**
 * A coffee maker used to train baristas.
 *
 * Class invariant: cups remaining >= 0, time since last brew >= 0
 */

public class CoffeeMaker {

    private int timeSinceLastBrew;
    private int beans;
    private double water;
    private int cups;

    //EFFECTS: sets time since last brew, cups remaining to 0
    public CoffeeMaker(){
        timeSinceLastBrew = 0;
        cups = 0;
    }

    // getters
    public int getTimeSinceLastBrew() {
        return timeSinceLastBrew;
    }

    public int getCupsRemaining() {
        return cups;
    }

    // EFFECTS: return true if there are coffee cups remaining
    public boolean areCupsRemaining() {
        return (cups > 0);
    }


    public void setTimeSinceLastBrew(int time) throws Exception{
        if (time < 0){
            throw new Exception("Time should be non negative");
        }
        this.timeSinceLastBrew = time;

    }


    public void brew(double beans, double water) throws NotEnoughBeansException, TooManyBeansException,
            WaterException{
        if (beans < 2.40) {
            throw new NotEnoughBeansException(beans);
        }
        if (beans > 2.60) {
            throw new TooManyBeansException(beans);
        }
        if (water <= 14.75) {
            throw new WaterException(water);
        }
        cups = 20;
        timeSinceLastBrew = 0;
    }


    public void pourCoffee() throws StaleCoffeeException, Exception {
        if (cups <= 0){
            throw new Exception("No more cups left!");
        }
        if (timeSinceLastBrew > 60 ) {
            throw new StaleCoffeeException(timeSinceLastBrew);
        }
        cups -= 1;
    }


}

