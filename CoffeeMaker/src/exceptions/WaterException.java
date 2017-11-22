package exceptions;

public class WaterException extends Exception {

    private int waterCups;

    public WaterException(double waterCups){
        super(String.format("%s too much water!!", waterCups));
    }
}
