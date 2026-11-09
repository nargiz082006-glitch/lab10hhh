public class OrderProcessor {
    public void checkout(Coffee coffee) {
        System.out.println("[Касса]: Оформление заказа...");
        System.out.println("-> Напиток принят в обработку. Сумма к оплате: " + coffee.getCost() + " тг.");
        System.out.println("--------------------------------------------------");
    }
}
