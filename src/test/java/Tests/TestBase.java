package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public WebDriver driver ;
    SoftAssert softAssert = new SoftAssert();
    @BeforeClass
    public void BrowserStart (){
        driver= new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(120 , TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }


    @AfterClass
    public void CloseBrowser (){
        driver.quit();
    }
}
