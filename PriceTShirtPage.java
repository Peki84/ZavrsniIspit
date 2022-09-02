package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PriceTShirtPage extends BasePage{
    public PriceTShirtPage(WebDriver driver){
        super(driver);
    }
    By checkOutButtonbBy=By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a");
    By shippingPriceBy=By.id("total_shipping");
    By productPriceBy=By.id("total_product_price_2_7_741363");
    By expectedPriceBy=By.id("total_price");

    public PriceTShirtPage proceedToCheckout(){
        click(checkOutButtonbBy);
        return this;
    }
    public PriceTShirtPage verifyTotal(double actualPrice){
        double productPrice=Double.parseDouble(driver.findElement(productPriceBy).getText().substring(1));
        double shippingPrice=Double.parseDouble(driver.findElement(shippingPriceBy).getText().substring(1));
        double expectedPrice=productPrice+shippingPrice;
        Assert.assertEquals(expectedPrice, actualPrice,2);
        return this;
    }
    
}
