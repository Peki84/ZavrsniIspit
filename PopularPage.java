package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopularPage extends BasePage{
    public PopularPage(WebDriver driver){
        super(driver);
    }
    public PopularPage basePage(){
        driver.get(baseURL);
        return this;
    }
    By numberOfProductsBy=By.xpath("//ul[@id='homefeatured']/li");

    public PopularPage numberOfProducts(int expectedNumberOfProducts){
        int actualNumberOfProducts=countItems(numberOfProductsBy);
        assertIntegerEquals(expectedNumberOfProducts, actualNumberOfProducts);
        return this;
    }
    


    
    
}
