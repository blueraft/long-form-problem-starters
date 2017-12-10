package model;

abstract public class FOHEmployee {

    protected Dish dish;

    public FOHEmployee(Dish dish) {
        this.dish = dish;
    }

    public void greet() {
        System.out.println("\"Hello and welcome to Busy's, the home of the trendy turkey club sandwich.\"");
    }

    public void describeDish() {
        System.out.println(dish.getDescription());
    }

    public void deliverFood(Order order) {
        order.setIsServed();
        System.out.print(getPrefix() + "Delivered food: ");
        order.print();
    }

    public abstract String getPrefix();
}
