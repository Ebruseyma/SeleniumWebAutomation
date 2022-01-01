package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.CartPage;
import java.HomePage;
import java.ProductDetailPage;
import java.ProductsPage;

public class testProduct extends test.baseTest {


    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;
    @Test
    @Order(1)
    public void searchProduct(){
        homePage = new HomePage(driver);
        productsPage=new ProductsPage(driver);
        homePage.searchBox().search("Pantolon");
        Assertions.assertTrue(productsPage.isOnProductPage(),"Not on products page");
    }
    @Test
    @Order(2)
    public void selectProduct(){
        productDetailPage=new ProductDetailPage(driver);
        productsPage.selectProduct(1);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),"Not on product detail page");
    }
    @Test
    @Order(3)
    public void addProductToCart(){
        productDetailPage.addToCart();
        Assertions.assertTrue(homePage.isProductCountUp(),"Product count did not increase");
    }
    @Test
    @Order(4)
    public void goToCart(){
        cartPage = new CartPage(driver);
        homePage.goToCart();
        Assertions.assertTrue(cartPage.checkIfProductAdded(),"Product was not added to cart");
        Assertions.assertTrue(cartPage.checkIfProductAddedTwo(),"Added two product");
        Assertions.assertTrue(cartPage.removeProductCart(),"Remove product  to cart");

    }
}
