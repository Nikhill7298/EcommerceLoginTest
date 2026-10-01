package Testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Baseclass {

    protected WebDriver driver;

    @BeforeMethod
    @Parameters({"os", "browser"})
    public void setup(String os, String br) {

        

        switch (br.toLowerCase()) {

        case "chrome":driver = new ChromeDriver();break;
        case  "firefox":driver = new FirefoxDriver();break;
        case "edge":driver = new EdgeDriver();break;
        default:System.out.println("Invalid browser...");break;
        }

        driver.manage().window().maximize();
        driver.get("https://www.opencart.com/");
    }
}

