package java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends basePage{

    By productNameLocator= new By.ByCssSelector("m-basket__productInfoName");
    By removeProductCart = By.id("removeCartItemBtn0");
    public CartPage(WebDriver driver){
        super(driver);
    }

    public boolean checkIfProductAdded() {
        return getProducts().size()>0;
    }
    public boolean checkIfProductAddedTwo() {
        return getProducts().size()>1;
    }
    public boolean removeProductCart() {
        return getProducts().size()==0;
    }

    private List<WebElement> getProducts(){
        return findAll(productNameLocator);
    }
}
