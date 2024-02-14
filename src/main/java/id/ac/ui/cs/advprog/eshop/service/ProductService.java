package id.ac.ui.cs.advprog.eshop.service;
import java.util.List;
import id.ac.ui.cs.advprog.eshop.model.Product;
public interface ProductService {
    Product create(Product product);
    List<Product> findAll();
    Product delete(String productId); // Add this line
    Product findById(String productId);
    Product edit(String productId, Product product);
}
