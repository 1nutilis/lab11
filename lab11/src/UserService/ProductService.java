package UserService;

import java.util.List;

public class ProductService implements IProductService {
    @Override
    public List<String> getProducts() {
        return List.of("Product1", "Product2");
    }

    @Override
    public void addProduct(String product) {
        System.out.println("Product added: " + product);
    }
}
