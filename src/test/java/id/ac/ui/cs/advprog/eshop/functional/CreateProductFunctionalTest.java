//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package id.ac.ui.cs.advprog.eshop.functional;

import org.junit.jupiter.api.Assertions;
import io.github.bonigarcia.seljup.SeleniumJupiter;
import org.openqa.selenium.WebElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.server.LocalServerPort;
import java.util.List;

@SpringBootTest(
        webEnvironment = WebEnvironment.RANDOM_PORT
)
@ExtendWith({SeleniumJupiter.class})
class CreateProductFunctionalTest {
    @LocalServerPort
    private int serverPort;
    @Value("${app.baseUrl:http://localhost}")
    private String testBaseUrl;
    private String baseUrl;

    CreateProductFunctionalTest() {

    }

    @BeforeEach
    void setupTest() {
        this.baseUrl = String.format("%s:%d", this.testBaseUrl, this.serverPort);
    }


    @Test
    void createProduct_isCorrect(ChromeDriver driver) throws Exception {
        driver.get(this.baseUrl + "/product/create");

        driver.executeScript("arguments[0].value = 'Ayam';", driver.findElement(By.id("nameInput")));
        driver.executeScript("arguments[0].value = 100;", driver.findElement(By.id("quantityInput")));
        driver.executeScript("arguments[0].click();", driver.findElement(By.cssSelector("button[type='submit']")));

        //getting the first row of the product's table
        WebElement row = driver.findElement(By.xpath("//table[@class='table table-striped table-responsive-md']/tbody/tr[1]"));


        String productName = row.findElement(By.xpath("./td[1]")).getText();
        String productQuantity = row.findElement(By.xpath("./td[2]")).getText();

        Assertions.assertEquals("Ayam", productName);
        Assertions.assertEquals("100", productQuantity);
    }
}