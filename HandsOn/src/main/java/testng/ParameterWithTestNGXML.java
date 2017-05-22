package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by makeshk.kathirvel on 5/22/2017.
 */
public class ParameterWithTestNGXML {
   @Test
   @Parameters({"author","searchkey"})
    public void testParameterWithXML(@Optional String author, String searchkey) throws InterruptedException{
       System.setProperty("webdriver.gecko.driver", "C://Makesh_Softwares//geckodriver.exe");
       WebDriver driver = new FirefoxDriver();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.get("http://www.google.com");
       WebElement searchbox = driver.findElement(By.name("q"));
       searchbox.sendKeys(searchkey);
       System.out.println("Welcome->" + author + "Your Search Key is" + searchkey);
       Thread.sleep(3000);
       System.out.println("Value in Google Search box ="+searchbox.getAttribute("value")+":::value given by input"+searchkey);
       Assert.assertEquals(searchbox.getAttribute("value"),searchkey);
       driver.close();
   }
}
