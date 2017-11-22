package exceptions;

public class WaterException extends Exception {

    private int waterCups;

    public WaterException(int waterCups){
        super(String.format("%s too much water!!", waterCups));
    }
}
