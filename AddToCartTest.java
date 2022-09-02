package tests;

import org.junit.Test;


import pages.AddToCartPage;

public class AddToCartTest  extends BaseTest{
    public AddToCartPage addToCartPage;
    

    @Test
    public void addItemToCart(){
        
        AddToCartPage addToCartPage=new AddToCartPage(driver);
        addToCartPage.basePage();
        addToCartPage.webElement();
        addToCartPage.webImage();
        addToCartPage.addToCart();
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
}
