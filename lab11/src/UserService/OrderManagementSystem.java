package UserService;

import java.util.List;

public class OrderManagementSystem {
    public static void main(String[] args) {
        IProductService productService = new ProductService();
        IPaymentService paymentService = new PaymentService();
        INotificationService notificationService = new NotificationService();

        IOrderService orderService = new OrderService(productService, paymentService, notificationService);

        productService.addProduct("Laptop");
        productService.addProduct("Smartphone");

        List<String> products = productService.getProducts();
        System.out.println("Available products: " + products);

        IUserService userService = new UserService();
        userService.register("bobie", "secure_password");
        userService.login("somsin", "secure_password");

        orderService.createOrder(1, List.of("Laptop", "Smartphone"));

        String status = orderService.getOrderStatus(1);
        System.out.println(status);
    }
}
