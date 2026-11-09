public class OrderCalculator {
    public void printOrderDetails(Coffee coffee) {
        System.out.println("Заказ: " + coffee.getDescription());
        System.out.println("Итоговая стоимость: " + coffee.getCost() + " тенге.");
    }
}
