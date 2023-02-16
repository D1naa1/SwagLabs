package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends PageBase{
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div[2]/div[7]")
    public WebElement Total ;
    @FindBy(id="finish")
    WebElement FinishBtn ;
    @FindBy(xpath = "//*[text()='THANK YOU FOR YOUR ORDER']")
    public WebElement FinishOrder ;
    @FindBy(id="back-to-products")
    WebElement BackToProducts ;
    public void ClickFinishBtn (){
        FinishBtn.click();
    }
    public void ClickBackToHomeBtn (){
        BackToProducts.click();
    }
}
