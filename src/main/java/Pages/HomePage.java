package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="react-burger-menu-btn")
    WebElement Menu ;
    @FindBy(id="logout_sidebar_link")
    WebElement LogoutBtn ;
    @FindBy(id="about_sidebar_link")
    WebElement AboutBtn ;
    @FindBy(xpath = "/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[2]/div")
    public WebElement CloseMenu ;
    @FindBy(xpath = "//select[@class='product_sort_container']")
    public WebElement FilterElement ;
    @FindBy(id="add-to-cart-sauce-labs-fleece-jacket")
   public WebElement AddToCartJacket ;
    @FindBy(id="add-to-cart-sauce-labs-backpack")
    public WebElement AddToCartBackpack ;
    @FindBy(id="add-to-cart-sauce-labs-bike-light")
    public WebElement AddToCartLight ;

    @FindBy(css = "a.shopping_cart_link")
    public WebElement CartElement ;
    @FindBy(id="remove-sauce-labs-backpack")
    WebElement RemoveItemBtn ;
    @FindBy(css="span.shopping_cart_badge")
    public WebElement NumberOfItems ;
    @FindBy(css = "span.title")
    public WebElement ProductsTitle ;


    public void ClickMenuBtn (){
        Menu.click();
    }
    public void Logout (){
        LogoutBtn.click();
    }
    public void OpenFilter (){
        FilterElement.click();

    }
    public void SelectFilter(){
        Select select = new Select(FilterElement);
        select.selectByValue("hilo");
    }
    public void ClickAddBtn (){
        AddToCartJacket.click();
        AddToCartBackpack.click();
        AddToCartLight.click();
    }
    public void OpenCart(){
        CartElement.click();
    }
    public void RemoveItem (){
        RemoveItemBtn.click();
    }
    public void AboutClick (){
        AboutBtn.click();
    }



}
