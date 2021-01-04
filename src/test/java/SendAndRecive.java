import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendAndRecive extends HomePage{
    private static WebDriver driver;

    public  SendAndRecive() {
      driver = DriverSingleton.getDriverInstance();
    }
    //a
    public void radioButtonToSomeoneElse(){
        WebElement toSomeoneElse = driver.findElement(By.xpath("//span[.='למישהו אחר']"));
      // --------------------------
      // לכתוב assert שאם כבר מסומן "למישהו אחר" אז המשך הלאה.
    }
    public void whomToSend(){
        String whom = "//input[@class='ember-view ember-text-field']";
        sendKeysToElement(By.xpath(whom), "Feiga");
    }
    public void assertSenderName(){
        //--------------------------------------------
        //לכתוב assert ששם השולח הוא אנה.
        System.out.println("to complete the assert");
    }
    public void pickEvent(){
        String event= "לאיזה אירוע?";
        clickElement(By.linkText(event));
        driver.findElement(By.linkText(event));
        driver.findElements(By.className("active-result")).get(3).click();
    }
    public void writeBlessing(){
        String braha= "textarea[rows='4']";
        sendKeysToElement(By.cssSelector(braha),"תזכו לגדלו לתורה לחופה ולמעשים טובים ");
    }
}
