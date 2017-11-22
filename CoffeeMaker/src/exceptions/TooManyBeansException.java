package exceptions;

public class TooManyBeansException extends BeansAmountException {

    public TooManyBeansException(double beans){
        super(beans,String.format("%s is higher than expected amount of beans", beans));
    }

}