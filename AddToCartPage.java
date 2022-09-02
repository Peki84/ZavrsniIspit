package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class AddToCartPage extends BasePage{
    public AddToCartPage (WebDriver driver){
        super(driver);
    }
    By homeImageBy=By.xpath("//ul[@id='homefeatured']/li[1]/div");
    By webImagBy=By.xpath("//ul[@id='homefeatured']/li[1]/div");
    By addToCartBy=By.xpath("//ul[@id='homefeatured']/li[1]/div//a[@title='Add to cart']");
    Actions action=new Actions(driver);
    public AddToCartPage basePage(){
        driver.get(baseURL);
        return this;
    }
    public AddToCartPage webElement(){
        driver.findElement(homeImageBy);
        return this;
    }
    public AddToCartPage webImage(){
        action.moveToElement(webImagBy).build().perform();
        return this;
    }
    
    
    public AddToCartPage addToCart(){
        click(addToCartBy);
        return this;
    }
    
}
