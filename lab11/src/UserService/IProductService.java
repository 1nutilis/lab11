package UserService;

import java.util.List;

public interface IProductService {
    List<String> getProducts();
    void addProduct(String product);
}
