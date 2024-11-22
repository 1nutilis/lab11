package UserService;

public class PaymentService implements IPaymentService {
    @Override
    public boolean processPayment(int orderId, double amount) {
        System.out.println("Payment processed for order " + orderId + " with amount " + amount);
        return true;
    }
}
