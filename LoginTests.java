package tests;

import org.junit.Test;

import pages.LoginPage;
import pages.RegistrationPage;
import pages.SigninPage;

public class LoginTests extends BaseTest{
    public LoginPage loginPage;
    public RegistrationPage registrationPage;
    public SigninPage signinPage;
    String eMail="ppppp@gmail.com";
    String ePassword="pppp194";
    String eMailEmpty="";
    String wrongPassword="wrong";
    String expectedError="An email address required";
    String expectedError2="Authentication failed.";

    @Test
    public void verifySuccessfulLogin(){
        LoginPage loginPage=new LoginPage(driver);
        SigninPage signinPage=new SigninPage(driver);
        signinPage.basePage();
        signinPage.signIn();
        loginPage.login(eMail, ePassword);
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    @Test
    public void verifyUnsuccessfulLogin(){
        LoginPage loginPage=new LoginPage(driver);
        SigninPage signinPage=new SigninPage(driver);
        signinPage.basePage();
        signinPage.signIn();
        loginPage.login(eMail, wrongPassword);
        loginPage.emptyEmail(expectedError2);
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    @Test
    public void emptyEmailLogin(){
        LoginPage loginPage=new LoginPage(driver);
        SigninPage signinPage=new SigninPage(driver);
        signinPage.basePage();
        signinPage.signIn();
        loginPage.login(eMailEmpty, ePassword);
        loginPage.emptyEmail(expectedError);
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }

    
}
