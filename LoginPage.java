package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasePage.java.Basepage;

public class LoginPage extends Basepage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//a[contains(@class,'navbar-btn')]")
    WebElement Loginbtn;

    @FindBy(xpath="//input[@id='input-email']")
    WebElement EmailID;
    
    @FindBy(xpath="//input[@id='input-password']")
    WebElement password;
    
    @FindBy(xpath="//button[@class='btn btn-primary btn-lg hidden-xs']")
    WebElement logbtn;

    public void clickactn() {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(Loginbtn)).click();
    }

    public void Mailid(String email) {
        EmailID.sendKeys(email);
    }
    public void password(String email) {
        password.sendKeys(email);
    }
    public void loginbutton() {
         logbtn.click();
    }
    
    
}