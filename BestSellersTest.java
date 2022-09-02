package tests;

import org.junit.Test;

import pages.BestSellers;

public class BestSellersTest  extends BaseTest {
    public BestSellers bestSellers;

    int expectedNoOnSellers=7;

    @Test
    public void numberOfBestSellers(){
        BestSellers bestSellers=new BestSellers(driver);
        bestSellers.basePage();
        bestSellers.clickSellers();
        bestSellers.numberOfAllItems(expectedNoOnSellers);
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }


    
}
