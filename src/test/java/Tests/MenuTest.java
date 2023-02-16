package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class MenuTest extends TestBase{
    @Test(priority = 1)
    public void Login_With_Valid_Data () {
        HomePage HomeObject = new HomePage(driver);
        LoginPage LoginObject = new LoginPage(driver);
        LoginObject.EnterLoginData("standard_user", "secret_sauce");
        softAssert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
    }

        @Test(priority = 2)
        public void TestMenu () throws InterruptedException {
        HomePage HomeObject = new HomePage(driver);
        HomeObject.ClickMenuBtn();
        HomeObject.AboutClick();
        Thread.sleep(1000);
        driver.navigate().back();
        HomeObject.Logout();
        Thread.sleep(2000);

}
}
