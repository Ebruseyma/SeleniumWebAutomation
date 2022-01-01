package java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends basePage {

    By searchBoxLocator = By.id("default-input");
    By submitButtonLocator = new By.ByCssSelector("o-header__search--btn");
    public SearchBox(WebDriver driver){
        super(driver);
    }
    public void search(String text) {
        type(searchBoxLocator, text);
        click(submitButtonLocator);
    }
}
