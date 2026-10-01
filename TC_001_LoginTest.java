package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import Testbase.Baseclass;

public class TC_001_LoginTest extends Baseclass {

    @Test
    public void clickLoginButton() {

        

        LoginPage loginPage = new LoginPage(driver);

        

        loginPage.clickactn();

        loginPage.Mailid("Nikhil@gmail.com");
        
        loginPage.password("Nikhil07");
        
        loginPage.loginbutton();
        
        
    }
}
