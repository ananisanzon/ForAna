import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PickBusiness extends HomePage {
    private static WebDriver driver;

    public  PickBusiness(){
        driver=DriverSingleton.getDriverInstance();
    }
    //click on plus of present
    public void pickBuisness(){
        String present= "Dream baby gift- מתנה ליולדת";
        clickElement(By.linkText(present));
    }

    //click present whith spesific price
    public void presentWhithPrice(){
        List<WebElement> specificchoise = driver.findElements(By.className("card-img"));
        specificchoise.get(1).click();

    }
    }
//1. לבדוק למה assert עושה שטויות.
//2. בפו' אחרונה ללחוץ על "בחירה" ולא על המוצר עצמו.

