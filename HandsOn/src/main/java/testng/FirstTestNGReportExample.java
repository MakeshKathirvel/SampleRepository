package testng;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by makeshk.kathirvel on 5/19/2017.
 */
public class FirstTestNGReportExample {
    public String baseURL = "http://www.espncricinfo.com";
    public WebDriver driver;

    @Test
    public void verifyHomePageTitle(){
        System.setProperty("webdriver.gecko.driver", "C://Makesh_Softwares//geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get(baseURL);
        String ExpectedTitle = "";
        String ActualTitle = driver.getTitle();
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        driver.close();
    }

}
