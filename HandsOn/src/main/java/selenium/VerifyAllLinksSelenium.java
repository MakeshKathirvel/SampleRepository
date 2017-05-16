package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by makeshk.kathirvel on 5/8/2017.
 */
public class VerifyAllLinksSelenium {
    public static void main(String args[]){
        System.setProperty("webdriver.gecko.driver", "C://Makesh_Softwares//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://free.snapmyscreen.com/index.jhtml?partner=^BPR^yyyyyy^TTAB02");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> URLList = driver.findElements(By.tagName("a"));
        String[] URLListStrings = new String[URLList.size()];
        int i=0;

        for(WebElement element :URLList){
            URLListStrings[i] = element.getText();
            i++;
        }
        for(String S : URLListStrings){
            driver.findElement(By.linkText(S)).click();
            System.out.println("\"" + S +"is working" );

        }
    }
}
