package test;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class baseTest {
    WebDriver driver;
    @BeforeAll
    public static void main(String[] args){
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.beymen.com/");
        driver.manage().window().maximize();
    }
    //@AfterAll
    //public void tearDown(){
      //  driver.quit();
    //}

}
