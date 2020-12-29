import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PickBusiness extends HomePage {
    private static WebDriver driver;

    public  PickBusiness(){
        driver=DriverSingleton.getDriverInstance();
    }
    //assert url
    public void AssertWebsiteUrl(){
        String myUrl= driver.getCurrentUrl();
        Assert.assertEquals(myUrl,Constance.OPENED_URL);
    }
    //click on plus of present
    public void PickBuisness(){
        String present= "Dream baby gift- מתנה ליולדת";
        clickElement(By.linkText(present));
    }
    //click present whith spesific price
    public void choosePresentWhithPrice(){
        String presentWithPrice="בייבי TOWER";
        clickElement(By.linkText(presentWithPrice));
      //  String presentWhithPrise="//img[@https://buyme.co.il/files/packages/private/packageImage6934938.jpg?1573927505]";
       // clickElement(By.xpath(presentWhithPrise));

    }
    }

