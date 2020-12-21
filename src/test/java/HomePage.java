import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HomePage extends BasePage {
    private static WebDriver driver;
    // לחץ על כניסה לBuyme
    public void clickToHome() {
        String submitHome = "button[type=submit]";
        clickElement(By.cssSelector(submitHome));
    }
    //choose sum
    public void chooseShum()  {
        String shum= "סכום";
        clickElement(By.linkText(shum));
      driver.findElements(By.className("chosen-single")).get(2).click();

   // driver.findElements(By.xpath("<span>100-199 ש\"ח</span>")).get(1).click();
        //Select shumInShekels= new Select(driver.findElement(By.linkText(shum)));
        //shumInShekels.selectByVisibleText("<span>200-299 ש\"ח</span>");
      //  String shumInShekels= "<span>200-299 ש\"ח</span>";
      // driver.findElement(By.xpath(shum)).get(2).;
       // Select selectShum=new Select(driver.findElement(By.linkText(shum)));
       // selectShum.selectByVisibleText(1);

        }
    }

