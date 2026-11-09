public class Syrup extends CoffeeDecorator {
    public Syrup(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", карамельный сироп";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 150.0;
    }
}
