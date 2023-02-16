package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {
    public String Username ;
    public String Password ;
    public WebDriverWait wait ;
    public WebDriver driver ;
    int Duration = 30 ;

    public PageBase(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }
}