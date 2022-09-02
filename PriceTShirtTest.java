package tests;

import org.junit.Test;

import pages.AddToCartPage;
import pages.PriceTShirtPage;
import pages.SigninPage;

public class PriceTShirtTest extends BaseTest {
    public AddToCartPage addToCartPage;
    public SigninPage signinPage;
    public PriceTShirtPage priceTShirtPage;

    
    double totalPrice=29.00;

    @Test
 public void verifyTotalPrice(){
    AddToCartPage addToCartPage=new AddToCartPage(driver);
    SigninPage signinPage=new SigninPage(driver);
    PriceTShirtPage priceTShirtPage=new PriceTShirtPage(driver);
    signinPage.basePage();
    addToCartPage.addToCart();
    priceTShirtPage.proceedToCheckout();
    priceTShirtPage.verifyTotal(totalPrice);
    try{
        Thread.sleep(5000);
    }
    catch(InterruptedException e){
        e.printStackTrace();
    }
    
 }

    
}
