import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HomePage extends BasePage {
    private static WebDriver driver;

    public HomePage() {
        driver= DriverSingleton.getDriverInstance();

    }
    // לחץ על כניסה לBuyme
    public void clickToHome() {
        String submitHome = "button[type=submit]";
        clickElement(By.cssSelector(submitHome));
    }
    //choose sum
    public void chooseShum() throws InterruptedException {
       String shum= "סכום";
       clickElement(By.linkText(shum));
       driver.findElement(By.linkText(shum));
       driver.findElements(By.className("active-result")).get(2).click();
        }
    public void chooseEizor(){
        String eizor="אזור";
        clickElement(By.linkText(eizor));
        driver.findElement(By.linkText(eizor));
        driver.findElements(By.className("active-result")).get(3).click();
    }
    public void chooseCategory(){
        String category= "קטגוריה";
        clickElement(By.linkText(category));
        driver.findElement(By.linkText(category));
        driver.findElements(By.className("active-result")).get(7).click();
    }
    public void clickFindMePresent() {
        String findPresent = "תמצאו לי מתנה";
        clickElement(By.linkText(findPresent));
    }
    }

