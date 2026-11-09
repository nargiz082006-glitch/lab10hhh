public class Main {
    public static void main(String[] args) {
        System.out.println("=== СИСТЕМА ЗАКАЗА КОФЕ (ДЕМОНСТРАЦИЯ) ===\n");

        OrderCalculator calculator = new OrderCalculator();
        OrderProcessor processor = new OrderProcessor();

        // Сценарий 1: Обычный кофе без добавок
        Coffee coffee1 = new SimpleCoffee();
        calculator.printOrderDetails(coffee1);
        processor.checkout(coffee1);

        // Сценарий 2: Кофе с молоком и сахаром (комбинация декораторов)
        Coffee coffee2 = new SimpleCoffee();
        coffee2 = new Milk(coffee2);
        coffee2 = new Sugar(coffee2);
        calculator.printOrderDetails(coffee2);
        processor.checkout(coffee2);

        // Сценарий 3: Сложный заказ — кофе со всеми добавками (Молоко + Сахар + Сироп)
        Coffee coffee3 = new SimpleCoffee();
        coffee3 = new Milk(coffee3);
        coffee3 = new Sugar(coffee3);
        coffee3 = new Syrup(coffee3);
        calculator.printOrderDetails(coffee3);
        processor.checkout(coffee3);
    }
}
