public class Sugar extends CoffeeDecorator {
    public Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", сахар";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 50.0;
    }
}
