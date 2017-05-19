package selenium;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by makeshk.kathirvel on 5/3/2017.
 */
public class PIPAdminPublisherTest {
    private static final String PIPADMIN_LOGIN = "http://10.90.130.160/login";
    private static final String PIPADMIN_HOMEPAGE = "http://10.90.130.160/home";
    private static final String PIPADMIN_PUBLISHER_LIST_PAGE = "http://10.90.130.160/partner/list";
    public static void main(String args[]){
        System.setProperty("webdriver.gecko.driver", "C://Makesh_Softwares//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(PIPADMIN_LOGIN);
        WebElement Username = driver.findElement(By.id("username"));
        Username.sendKeys("makeshk.kathirvel");
        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys((""));
        driver.findElement(By.className("form-actions")).submit();
        System.out.println("We have entered into PIP Admin HomePage");
        driver.findElement(By.linkText("View Publishers")).click();
        System.out.println("We have entered into PIP Admin Publisher List Page");
        driver.findElement(By.linkText("ATU3")).click();
       //selecting option from dropdown box
        Select OfferTemplateDropDownBox = new Select(driver.findElement(By.id("offerType")));
        OfferTemplateDropDownBox.selectByVisibleText("Background");
        driver.findElement(By.id("createNewOffer")).click();



    }
}
