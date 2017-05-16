package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by makeshk.kathirvel on 4/25/2017.
 */
public class BrowserLaunch {
    public static void main(String args[]){
        String actualTitle = "";
        String expectedTitle = "Google";
        System.setProperty("webdriver.gecko.driver", "C://Makesh_Softwares//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        actualTitle = driver.getTitle();
       // System.out.println(actualTitle);
        WebElement searchbox = driver.findElement(By.id("lst-ib"));
        WebElement searchbutton = driver.findElement(By.className("sbico-c"));
        Boolean IssearchboxAvailable = searchbox.isDisplayed();
        Boolean Issearchbuttonavailable = searchbutton.isDisplayed();

        if(IssearchboxAvailable){
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        searchbox.sendKeys("Bahubali2");

        }
        else
            System.out.println("No Searchbox Element Found");
        if(Issearchbuttonavailable)
            searchbutton.click();
       /* if(actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }
        driver.quit();
        System.exit(0);*/
    }
}
