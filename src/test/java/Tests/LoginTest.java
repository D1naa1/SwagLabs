package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends TestBase{

    @Test(priority = 1)
    public void Login_With_Valid_Data (){
        HomePage HomeObject = new HomePage(driver);
        LoginPage LoginObject = new LoginPage(driver);
        LoginObject.EnterLoginData("standard_user","secret_sauce");
        softAssert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html");
        HomeObject.ClickMenuBtn();
        HomeObject.Logout();
        Assert.assertEquals(driver.getCurrentUrl() , "https://www.saucedemo.com/");
        softAssert.assertAll();

    }
    @Test(priority = 2)
    public void Login_With_InValid_Data (){
        LoginPage LoginObject = new LoginPage(driver);
        LoginObject.EnterLoginData("standard_user","1234567");
        softAssert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html");

    }
}
