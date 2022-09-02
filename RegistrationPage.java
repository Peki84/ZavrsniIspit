package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    By signInButtonBy = By.className("login");
    By emailAddressBy = By.xpath("//*[@id='email_create']");
    By createAccountBy = By.xpath("//*[@id='SubmitCreate']");
    By expectedTextBy = By.className("account_creation");
    By radioButtonBy = By.id("id_gender1");
    By firstNameBy = By.id("customer_firstname");
    By lastNameBy = By.id("customer_lastname");
    By passwordBy = By.id("passwd");
    By dropButtonBy = By.className("selector");
    By dropDayBy = By.xpath("//*[@id='days']/option[22]");
    By dropButtonMonthsBy = By.id("uniform-months");
    By dropMonthBy = By.xpath("//*[@id='months']/option[2]");
    By dropButtonYearsBy = By.id("uniform-years");
    By dropYearBy = By.xpath("//*[@id='years']/option[19]");
    By addressBy = By.id("address1");
    By citBy = By.id("city");
    By stateNameBy = By.id("uniform-id_state");
    By nameStateBy=By.xpath("//*[@id='id_state']/option[6]");
    By postCodeBy = By.id("postcode");
    By countryNameBy = By.id("uniform-id_country");
    By nameCountryBy=By.xpath("//*[@id='id_country']/option[2]");
    By phoneNumberBy =By.id("phone_mobile");
    By address1By =By.id("alias");
    By buttonRegBy=By.id("submitAccount");

    public RegistrationPage basePage(){
        driver.get(baseURL);
        return this;
    }
    public RegistrationPage signIn(){
        click(signInButtonBy);
        return this;
    }
    public RegistrationPage createEMail(String EMail){
        writeText(emailAddressBy, EMail);
        click(createAccountBy);
        return this;
    }
    public RegistrationPage assertTextEqual(String actualText){
        String expectedText=readText(expectedTextBy);
        Assert.assertEquals(actualText, expectedText);
        return this;
    }
    public RegistrationPage title(){
        click(radioButtonBy);
        return this;
    }
    public RegistrationPage createFirstName(String First){
        writeText(firstNameBy, First);
        return this;
    }
    public RegistrationPage createLastName(String Last){
        writeText(lastNameBy, Last);
        return this;
    }
    public RegistrationPage createPassword(String Password){
        writeText(passwordBy, Password);
        return this;
    }
    public RegistrationPage dropButtonDay(){
        click(dropButtonBy);
        return this;
    }
    public RegistrationPage dropDay(){
        click(dropDayBy);
        return this;
    }
    public RegistrationPage dropButtonMonths(){
        click(dropButtonMonthsBy);
        return this;
    }
    public RegistrationPage dropMonth(){
        click(dropMonthBy);
        return this;
    }
    public RegistrationPage dropButtonYears(){
        click(dropButtonYearsBy);
        return this;
    }
    public RegistrationPage dropYear(){
        click(dropYearBy);
        return this;
    }
    public RegistrationPage address(String addres){
        writeText(addressBy, addres);
        return this;
    }
    public RegistrationPage city(String cName){
        writeText(citBy, cName);
        return this;
    }
    public RegistrationPage stateButtonName(){
        click(stateNameBy);
        return this;
    }
    public RegistrationPage stateNameBu(){
        click(nameStateBy);
        return this;
    }public RegistrationPage zipCode(String code){
        writeText(postCodeBy, code);
        return this;
    }
    public RegistrationPage countryButton(){
        click(countryNameBy);
        return this;
    }
    public RegistrationPage countryName(){
        click(nameCountryBy);
        return this;
    }
    public RegistrationPage phoneNumber(String num){
        writeText(phoneNumberBy, num);
        return this;
    }
    public RegistrationPage addressN1(String addr){
        writeText(address1By, addr);
        return this;
    }
    public RegistrationPage registerButton(){
        click(buttonRegBy);
        return this;
    }

    

}
