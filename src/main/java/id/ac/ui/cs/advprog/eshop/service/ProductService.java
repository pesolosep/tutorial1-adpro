package id.ac.ui.cs.advprog.eshop.service;
import java.util.List;
import id.ac.ui.cs.advprog.eshop.model.Product;
public interface ProductService {
    public Product create(Product product);
    public List<Product> findAll();
    public void delete(String productId); // Add this line
    public Product findById(String productId);
    public Product edit(String productId, Product product);
}
