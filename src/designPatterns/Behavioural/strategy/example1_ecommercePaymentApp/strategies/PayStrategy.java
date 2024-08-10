package designPatterns.Behavioural.strategy.example1_ecommercePaymentApp.strategies;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
