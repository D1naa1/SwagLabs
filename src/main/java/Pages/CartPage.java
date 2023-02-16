package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageBase{
    public CartPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="checkout")
    public WebElement CheckOutBtn ;
    @FindBy(id="continue-shopping")
    public WebElement BackToShopping ;
    @FindBy(id="remove-sauce-labs-bike-light")
    public WebElement RemoveItemInCart ;
    public void ClickContinueShopping (){
        BackToShopping.click();
    }
    public void RemoveItemAtCartScreen(){
        RemoveItemInCart.click();
    }
    public void ClickCheckout (){
        CheckOutBtn.click();
    }
}
