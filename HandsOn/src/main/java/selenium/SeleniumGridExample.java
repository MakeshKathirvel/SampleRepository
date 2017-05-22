package selenium;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by makeshk.kathirvel on 5/19/2017.
 */
public class SeleniumGridExample {
    WebDriver driver;
    String baseURL, nodeURL;

    @BeforeTest
    public void setUp() throws MalformedURLException{
        baseURL = "http://www.espncricinfo.com";
        nodeURL = "http://10.90.207.87:5566/wd/hub";
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setBrowserName("firefox");
        capabilities.setPlatform(Platform.VISTA);
        driver = new RemoteWebDriver(new URL(nodeURL), capabilities);
    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }

    @Test
    public void simpleTest(){
        driver.get(baseURL);
        Assert.assertEquals("", driver.getTitle());
    }
}
