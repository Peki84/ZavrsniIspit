package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver){
        super(driver);
    }
    public LoginPage basePage(){
        driver.get(baseURL);
        return this;
    }
    By eMailNameBy=By.id("email");
    By ePasswordBy=By.id("passwd");
    By submitButtonBy=By.id("SubmitLogin");
    By errorText=By.xpath("//div[@class='alert alert-danger' and not(@id)]");

    public LoginPage login(String email,String password){
        writeText(eMailNameBy, email);
        writeText(ePasswordBy, password);
        click(submitButtonBy);
        return this;
    }
    public LoginPage emptyEmail(String expectedText){
        String actualText=readText(errorText);
        assertEquals(expectedText, actualText);
        return this;

    }
    public LoginPage unsuccessfulLogin(String email,String password){
        writeText(eMailNameBy, email);
        writeText(ePasswordBy, password);
        click(submitButtonBy);
        return this;
    }
    
}
