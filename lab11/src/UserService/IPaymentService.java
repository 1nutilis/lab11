package UserService;

public interface IPaymentService {
    boolean processPayment(int orderId, double amount);
}
