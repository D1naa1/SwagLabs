package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddMissingInfo extends PageBase{

    public AddMissingInfo(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[text()='Checkout: Your Information']")
    public WebElement MissingInFoHeader ;
    @FindBy(id="first-name")
    WebElement FirstName ;
    @FindBy(id="last-name")
    WebElement LastName ;
    @FindBy(id="postal-code")
    WebElement PostalCode ;
    @FindBy (id="continue")
    WebElement ContinueBtn ;

    public void AddMissingData (String MyName ,String MyLastName ,String Postalno){
        FirstName.sendKeys(MyName);
        LastName.sendKeys(MyLastName);
        PostalCode.sendKeys(Postalno);

    }
    public void ClickContinueBtn (){
        ContinueBtn.click();
    }
}
