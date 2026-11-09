public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Обычный кофе";
    }

    @Override
    public double getCost() {
        return 500.0; // Базовая цена
    }
}
