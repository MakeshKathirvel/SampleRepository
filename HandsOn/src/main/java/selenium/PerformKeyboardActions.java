package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by makeshk.kathirvel on 5/19/2017.
 */
public class PerformKeyboardActions {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C://Makesh_Softwares//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");

        WebElement txtUsername = driver.findElement(By.id("email"));

       // driver.findElement(By.linkText("INDIAN PREMIER LEAGUE")).click();
        /*By IPLLinkText = By.linkText("INDIAN PREMIER LEAGUE");
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.presenceOfElementLocated(IPLLinkText));
        WebElement element = driver.findElement(IPLLinkText);*/
        Actions builder = new Actions(driver);
        Action seriesOfActions = builder.moveToElement(txtUsername).click().keyDown(txtUsername,Keys.SHIFT).sendKeys(txtUsername,"hello").keyUp(txtUsername,Keys.SHIFT).doubleClick(txtUsername).contextClick().build();
        seriesOfActions.perform();
//        Action rightClickIPL = builder.contextClick().build();
//
//        rightClickIPL.perform();


    }
}
