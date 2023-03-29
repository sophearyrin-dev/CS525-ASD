package with.templatemethod;

public abstract class PaymentProcessor {
    void processPayment(double amount, String currency){

    }

    abstract void validatePayment();
    abstract void performPayment();
    abstract void notifyCustomer();
}
