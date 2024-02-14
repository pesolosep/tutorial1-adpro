package id.ac.ui.cs.advprog.eshop.controller;


import org.springframework.ui.Model;
import id.ac.ui.cs.advprog.eshop.service.ProductService;
import id.ac.ui.cs.advprog.eshop.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class ProductControllerTest {
    @Mock
    ProductService productService;
    @Mock
    Model model;
    @InjectMocks
    ProductController productController;
    @BeforeEach
    void setUp(){
    }

    @Test
    void testCreateProductPage(){
        String expectedViewName = "createProduct";
        String actualViewName = productController.createProductPage(model);
        assertEquals(expectedViewName, actualViewName);
    }

    @Test
    void testCreateProductPost(){
        Product product = new Product();
        String expectedViewName = "redirect:list";
        String actualViewName = productController.createProductPost(product, model);
        assertEquals(expectedViewName, actualViewName);
    }

    @Test
    void testEditProductPage(){
        String expectedViewName = "CreateProduct";
        String actualViewName = productController.createProductPage(model);
        assertEquals(expectedViewName, actualViewName);

        expectedViewName = "EditProduct";
        actualViewName = productController.editProductPage("1", model);
        assertEquals(expectedViewName,actualViewName);
    }

    @Test
    void testEditProductPost() {
        String expectedViewName = "CreateProduct";
        String actualViewName = productController.createProductPage(model);
        assertEquals(expectedViewName, actualViewName);

        expectedViewName = "redirect:/product/list";
        Product product = new Product();
        actualViewName = productController.editProductPost("1", product);
        assertEquals(expectedViewName, actualViewName);
    }

    @Test
    void testProductListPage() {
        String expectedViewName = "ProductList";
        String actualViewName = productController.productListPage(model);
        assertEquals(expectedViewName, actualViewName);
    }

    @Test
    void testDeleteProduct() {
        String expectedViewName = "CreateProduct";
        String actualViewName = productController.createProductPage(model);
        assertEquals(expectedViewName, actualViewName);

        expectedViewName = "redirect:/product/list";
        actualViewName = productController.deleteProduct("1");
        assertEquals(expectedViewName,actualViewName);
    }




}