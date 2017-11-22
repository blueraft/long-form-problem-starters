package exceptions;

public class BeansAmountException extends Exception {
    private double beans;

    public BeansAmountException(double beans){
        super(String.format("%s is not the right amount of beans", beans));
    }

    public double getBeans(){return beans;}

    protected BeansAmountException(double beans, String message){
        super(message);
    }

}

