package id.ac.ui.cs.advprog.eshop.repository;
import  id.ac.ui.cs.advprog.eshop.model.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class ProductRepository {
    private List<Product> productData = new ArrayList<>();
    private long nextId = 1; // Start IDs from 1
    public Product create(Product product){
        product.setProductId(String.valueOf(nextId++));
        productData.add(product);
        return product;
    }
    public Iterator<Product> findAll(){
        return productData.iterator();
    }
    public void delete(String productId) {
        Product product = this.findById(productId);
        productData.remove(product);
    }

    public Product findById(String productId){
        Product foundProduct = null;
        for(Product product:productData){
            if(productId.equals(product.getProductId())){
                foundProduct = product;

                break;
            }
        }
        return foundProduct;
    }

    public Product edit(String productId, Product updatedproduct){
        updatedproduct.setProductId(productId);
        Product product = this.findById(productId);
        int index = productData.indexOf(product);
        productData.set(index, updatedproduct);
        return product;
    }
}
