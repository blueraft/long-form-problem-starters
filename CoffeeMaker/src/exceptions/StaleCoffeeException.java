package exceptions;

public class StaleCoffeeException extends Exception {

    private int timeSinceLastBrew;

    public StaleCoffeeException(int timeSinceLastBrew){
        super(String.format("%s coffee has been sitting for too long", timeSinceLastBrew));
    }
}
