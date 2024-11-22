package UserService;

import java.util.List;

public class OrderService implements IOrderService {
    private final INotificationService notificationService;

    public OrderService(IProductService productService, IPaymentService paymentService, INotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public void createOrder(int userId, List<String> productIds) {
        System.out.println("Order created for user " + userId + " with products: " + productIds);
        notificationService.sendNotification(userId, "Order created.");
    }

    @Override
    public String getOrderStatus(int orderId) {
        return "Order Status: In Progress";
    }
}
