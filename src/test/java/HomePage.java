import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    public void chooseShum() throws InterruptedException {
       String shum= "סכום";
      clickElement(By.linkText(shum));

     //  WebElement combo= driver.findElement(By.linkText(shum));
      // Select sumChoose= new Select(combo);
       //sumChoose.selectByIndex(1);
       driver.findElements(By.linkText("active-result")).get(2).click();
        }
    public void chooseEizor(){
        String eizor="אזור";
        clickElement(By.linkText(eizor));
        driver.findElement(By.xpath("<span>אזור</span>")).click();
    }
    public void chooseCategory(){
        String category= "קטגוריה";
        clickElement(By.linkText(category));
        driver.findElement(By.xpath("<span>קטגוריה</span>")).click();
    }
    }

