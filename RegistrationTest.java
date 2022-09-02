package tests;

import org.junit.Test;

import pages.RegistrationPage;
import pages.SigninPage;

public class RegistrationTest extends BaseTest{
    RegistrationPage registrationPage; 
    SigninPage signinPage;
    
    String password="pppp1984";
    String nameFirst="Petar";
    String lastName="Pajic";
    String addressName="Beverly Hills";
    String cityName="L.A.";
    String zipC="90210";
    String mobilePhone="123456789";
    String addresName1="Beverly Hills1";
    String actual="YOUR PERSONAL INFORMATION";
    String mail="ppppp@gmail.com";
    @Test
    public void registration(){
        RegistrationPage registrationPage=new RegistrationPage(driver);
        SigninPage signinPage=new SigninPage(driver);
        signinPage.basePage();
        signinPage.signIn();
        signinPage.createAccount(mail);
        registrationPage.signIn();
        registrationPage.assertTextEqual(actual);
        registrationPage.createFirstName(nameFirst);
        registrationPage.createLastName(lastName);
        registrationPage.createPassword(password);
        registrationPage.dropButtonDay();
        registrationPage.dropDay();
        registrationPage.dropButtonMonths();
        registrationPage.dropMonth();
        registrationPage.dropButtonMonths();
        registrationPage.dropYear();
        registrationPage.address(addressName);
        registrationPage.city(cityName);
        registrationPage.stateButtonName();
        registrationPage.stateNameBu();
        registrationPage.zipCode(zipC);
        registrationPage.countryButton();
        registrationPage.countryName();
        registrationPage.addressN1(addresName1);
        registrationPage.registerButton();
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }


    }
    
    
}
