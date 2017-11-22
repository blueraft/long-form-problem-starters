package exceptions;

public class NotEnoughBeansException extends BeansAmountException {

    public NotEnoughBeansException(double beans){
        super(beans,String.format("%s is lower than expected amount of beans", beans));
    }

}