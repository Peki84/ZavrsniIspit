package tests;

import org.junit.Test;

import pages.PopularPage;


public class PopularTest extends BaseTest {
    public PopularPage popularPage;
    
    
    int numberOI=7;

    @Test
    public void numberOfPopularItems(){
       PopularPage popularPage=new PopularPage(driver);
        
        popularPage.basePage();
        popularPage.numberOfProducts(numberOI);

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        
        
    }
    
}
