package UserService;

import java.util.List;

public interface IOrderService {
    void createOrder(int userId, List<String> productIds);
    String getOrderStatus(int orderId);
}
