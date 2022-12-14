package pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;
    public String baseURL = "http://automationpractice.com/index.php";
    
    
    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void waitVisibility(By elementBy){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }
    public void click(By elementBy){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
        driver.findElement(elementBy).click();
    }
    public void writeText(By elementBy,String text){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
        driver.findElement(elementBy).clear();
        driver.findElement(elementBy).sendKeys(text);
    }
    public String readText(By elementBy){
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }
    public int countItems(By elementBy){
        waitVisibility(elementBy);
        return driver.findElements(elementBy).size();
    }
    public void assertTextEquals(String expectedText,String actualText){
        assertTextEquals(expectedText, actualText);
    }

    public void assertIntegerEquals(int expectedNumber,int actualNumber){
        Assert.assertEquals(expectedNumber, actualNumber);
    }
    public void assertDoubleEquals(double expectedNumber,double actualNumber){
        Assert.assertEquals(expectedNumber, actualNumber,2);
    }
}

