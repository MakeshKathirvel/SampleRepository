package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by makeshk.kathirvel on 5/22/2017.
 */
public class ParameterByDataProvider {
    WebDriver driver;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.gecko.driver", "C://Makesh_Softwares//geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.google.com");
    }

    @Test(dataProvider = "SearchProvider")
    public void testMethod(String author, String searchkey) throws InterruptedException{
        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys(searchkey);
        System.out.println("Welcome->" + author + "Your Search Key is" + searchkey);
        Thread.sleep(3000);
        String testValue = searchbox.getAttribute("value");
        searchbox.clear();
        Assert.assertEquals(testValue,searchkey);
    }
    @AfterTest
    public void closeBrowser(){
        driver.close();
    }

    @DataProvider(name = "SearchProvider")
    public Object[][] getDataFromDataProvider(){
        return new Object[][]{
                {"Makesh","iPhone"},
                {"Guru", "Android"},
                {"Ashok", "BlackBerry"}
        };
    }
}
