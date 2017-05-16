package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by makeshk.kathirvel on 5/8/2017.
 */
public class VerifyImageLink {
    public static void main(String args[]){
        String ActualTitle = "Live cricket scores, commentary, match coverage | Cricket news, statistics | ESPN Cricinfo";
        System.setProperty("webdriver.gecko.driver", "C://Makesh_Softwares//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://www.espncricinfo.com");
        driver.findElement(By.linkText("INDIAN PREMIER LEAGUE")).click();
        driver.findElement(By.cssSelector("#ci_logo>a>img")).click();
        if(driver.getTitle().equals(ActualTitle))
            System.out.println("Image Click is Verified");
        else
        System.out.println("Failed");
        driver.close();
    }
}
