package java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends basePage{

    By shippingOptionLocator = By.id("productListTitle");
    By productNameLocator = new By.ByCssSelector("m-productCard__detail");
    By displayMoreLocator =By.id("moreContentButton");
    public ProductsPage(WebDriver driver){
        super(driver);
    }

    public boolean isOnProductPage() {
        click(displayMoreLocator);
        return isDisplayed(shippingOptionLocator);

    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();
    }

    private List<WebElement> getAllProducts(){
        return findAll(productNameLocator);
    }
}
