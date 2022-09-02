package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninPage extends BasePage{
    public SigninPage(WebDriver driver){
        super(driver);

    }
    By signInButtonBy=By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a");
    By emailAddressBy=By.id("email_create");
    By clickButtonBy=By.id("SubmitCreate");
    By expectedTextBy=By.id("account-creation_form");

    public SigninPage basePage(){
        driver.get(baseURL);
        return this;
    }
    public SigninPage signIn(){
        click(signInButtonBy);
        return this;
    }
    public SigninPage createAccount(String mail){
        writeText(emailAddressBy, mail);
        click(clickButtonBy);
        return this;
    }
    
}
