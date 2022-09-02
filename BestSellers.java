package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BestSellers extends BasePage {
    public BestSellers(WebDriver driver){
        super(driver);
    }
    By actualItemsBy=By.xpath("//*[@id='blockbestsellers']/li");
    By sellerButtonbBy=By.xpath("//*[@id='home-page-tabs']/li[2]/a");

public BestSellers basePage(){
    driver.get(baseURL);
    return this;
}
public BestSellers numberOfAllItems(int expectedNumber){
    int actualNumberOI=countItems(actualItemsBy);
    assertIntegerEquals(expectedNumber, actualNumberOI);
    return this;
}
public  BestSellers clickSellers(){
    click(sellerButtonbBy);
    return this;
}

}


    

