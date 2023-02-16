package Tests;

import Pages.CartPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends TestBase {
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
       Thread.sleep(2000);

    }
    @Test(priority = 3)
    public void AddItemsToCart (){
        HomePage HomeObject = new HomePage(driver);
        CartPage cartObject = new CartPage(driver);
        HomeObject.ClickAddBtn();
        HomeObject.OpenCart();
        String ActualResult = cartObject.CheckOutBtn.getText();
        softAssert.assertEquals(ActualResult,"CHECKOUT");
        softAssert.assertAll();

    }
    @Test(priority = 4)
    public void ContinueShopping (){
        HomePage HomeObject = new HomePage(driver);
        CartPage cartObject = new CartPage(driver);
        cartObject.ClickContinueShopping();
        HomeObject.RemoveItem();
        softAssert.assertEquals(HomeObject.NumberOfItems.getText(),"2");
        softAssert.assertAll();
    }


}