package Tests;

import Pages.*;
import org.testng.annotations.Test;

import static java.lang.Thread.*;

public class CartTest extends TestBase{
    @Test(priority = 1)
    public void Login_With_Valid_Data() {
        HomePage HomeObject = new HomePage(driver);
        LoginPage LoginObject = new LoginPage(driver);
        LoginObject.EnterLoginData("standard_user", "secret_sauce");
        softAssert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");


    }

    @Test(priority = 2)
    public void FilterItems () throws InterruptedException {
        HomePage HomeObject = new HomePage(driver);
        HomeObject.OpenFilter();
        HomeObject.SelectFilter();
        sleep(2000);

    }
    @Test(priority = 3)
    public void AddItemsToCart () throws InterruptedException {
        HomePage HomeObject = new HomePage(driver);
        CartPage cartObject = new CartPage(driver);
        HomeObject.ClickAddBtn();
        HomeObject.OpenCart();
        String ActualResult = cartObject.CheckOutBtn.getText();
        softAssert.assertEquals(ActualResult,"CHECKOUT");
        softAssert.assertAll();
        Thread.sleep(2000);


    }
    @Test(priority = 4)
    public void ContinueShopping () throws InterruptedException {
        HomePage HomeObject = new HomePage(driver);
        CartPage cartObject = new CartPage(driver);
        cartObject.ClickContinueShopping();
        HomeObject.RemoveItem();
        softAssert.assertEquals(HomeObject.NumberOfItems.getText(),"2");
        softAssert.assertAll();
        Thread.sleep(2000);

    }
    @Test(priority = 5)
    public void PlaceOrder () throws InterruptedException {
        HomePage HomeObject = new HomePage(driver);
        CartPage cartObject = new CartPage(driver);
        AddMissingInfo MissingInfo = new AddMissingInfo(driver);
        HomeObject.OpenCart();
        cartObject.RemoveItemAtCartScreen();
        cartObject.ClickCheckout();
        softAssert.assertEquals(MissingInfo.MissingInFoHeader.getText(),"CHECKOUT: YOUR INFORMATION");
        System.out.println(MissingInfo.MissingInFoHeader.getText());
        softAssert.assertAll();
        Thread.sleep(2000);
    }
    @Test(priority = 6)
    public void AddMyData () throws InterruptedException {
        CheckOutPage CheckOut = new CheckOutPage(driver);
        AddMissingInfo MissingInfo = new AddMissingInfo(driver);
        MissingInfo.AddMissingData("Dina","Ahmed","12345");
        MissingInfo.ClickContinueBtn();
       Thread.sleep(2000);
       softAssert.assertEquals(CheckOut.Total.getText(),"Total: $53.99");
       CheckOut.ClickFinishBtn();
       softAssert.assertEquals(CheckOut.FinishOrder.getText(),"THANK YOU FOR YOUR ORDER");
       softAssert.assertAll();
       Thread.sleep(2000);


    }
    @Test(priority = 7)
public void BacktoHome () throws InterruptedException {
        CheckOutPage CheckOut = new CheckOutPage(driver);
        HomePage HomeObject = new HomePage(driver);
        CheckOut.ClickBackToHomeBtn();
        softAssert.assertEquals(HomeObject.ProductsTitle.getText(),"PRODUCTS");
        softAssert.assertAll();
        Thread.sleep(1000);

    }
}
