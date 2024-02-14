package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.Iterator;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class ProductRepositoryTest {
    @InjectMocks
    ProductRepository productRepository;
    @BeforeEach
    void setUp(){

    }

    @Test
    void testCreateAndFind(){
        Product product = new Product();
        product.setProductId("idgamingkepanjanganlol");
        product.setProductName("allin02");
        product.setProductQuantity(100);

        productRepository.create(product);

        Iterator<Product> productIterator = productRepository.findAll();
        assertTrue(productIterator.hasNext());

        Product savedProduct = productIterator.next();

        assertEquals(product.getProductId(), savedProduct.getProductId());
        assertEquals(product.getProductName(), savedProduct.getProductName());
        assertEquals(product.getProductQuantity(), savedProduct.getProductQuantity());
    }

    @Test
    void testFindAllIfEmpty(){
        Iterator<Product> productIterator = productRepository.findAll();
        assertFalse(productIterator.hasNext());
    }

    @Test
    void testFindAllIfMoreThanOneProduct() {
        Product product1 = new Product();
        product1.setProductId("yeah");
        product1.setProductName("yambo");
        product1.setProductQuantity(160);
        productRepository.create(product1);

        Product product2 = new Product();
        product2.setProductId("no");
        product2.setProductName("sambo");
        product2.setProductQuantity(50);
        productRepository.create(product2);
    }

    @Test
    void testFindByIdProduct() {
        Product product = new Product();
        product.setProductName("Test");
        product.setProductQuantity(100);
        productRepository.create(product);

        Product findedProduct = productRepository.findById(product.getProductId());
        assertEquals(product.getProductId(), findedProduct.getProductId());
        assertEquals(product.getProductName(), findedProduct.getProductName());
        assertEquals(product.getProductQuantity(), findedProduct.getProductQuantity());
    }

    @Test
    void testFindByIdProductIfDoesNotExist() {
        Product product1 = new Product();
        product1.setProductName("Product 1");
        product1.setProductQuantity(100);
        productRepository.create(product1);

        Product product2 = new Product();
        product2.setProductName("Product 2");
        product2.setProductQuantity(200);
        productRepository.create(product2);

        String randomId = UUID.randomUUID().toString();

        Product findedProduct = productRepository.findById(randomId);
        assertNull(findedProduct);
    }
}
