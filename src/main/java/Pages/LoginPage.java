package Pages;

import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="user-name")
    WebElement UserNameTxtBox ;
    @FindBy(id ="password")
    WebElement PasswordTxtBox ;
    @FindBy(id = "login-button")
    WebElement LoginBtn ;

    public void EnterLoginData(String Username ,String Password){
        UserNameTxtBox.sendKeys(Username);
        PasswordTxtBox.sendKeys(Password);
        LoginBtn.click();
    }

}
