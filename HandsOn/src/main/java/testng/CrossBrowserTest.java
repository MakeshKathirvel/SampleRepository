package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by makeshk.kathirvel on 5/22/2017.
 */
public class CrossBrowserTest {
    WebDriver driver;
    @BeforeTest
    @Parameters("browser")
    public void setUp(String browser) throws Exception{
        if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "C://Makesh_Softwares//geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "C://Makesh_Softwares//chromedriver.exe");
            driver = new ChromeDriver();
        }
        else {
            throw new Exception("Browser is not correct");
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testCrossBrowser() throws InterruptedException{
        driver.get("http://www.espncricinfo.com");
    }

    @AfterTest
    public void closeBrowser(){
        driver.close();
    }

}
