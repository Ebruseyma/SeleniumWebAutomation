package java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends basePage{

    SearchBox searchBox;

    By cartCountLocator = new By.ByCssSelector("o-header__userInfo--count");
    By cartContainerLocator = new By.ByCssSelector("o-header__userInfo--text");
    public HomePage(WebDriver driver){
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox(){
        return this.searchBox;
    }

    public boolean isProductCountUp() {
        return getCartCount() > 0;
    }

    public void goToCart() {
        click(cartContainerLocator);

    }

    private int getCartCount(){
        String count = find(cartCountLocator).getText();
        return Integer.parseInt(count);
    }
}
