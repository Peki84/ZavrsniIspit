package tests;

import org.junit.Test;

import pages.SigninPage;

public class SignInTest extends BaseTest {
    public SigninPage signinPage;
    String mailE="ppppp@gmail.com";
    @Test
    public void successfulSignIn(){
        SigninPage signinPage=new SigninPage(driver);
        signinPage.basePage();
        signinPage.signIn();

    }
    
}
