import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

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
        driver.findElement(By.cssSelector(braha)).clear();// לנקות את הברכה המובנית  בתיבת הטקסט
        sendKeysToElement(By.cssSelector(braha),"תזכו לגדלו לתורה לחופה ולמעשים טובים ");
    }
    public void attachImage(){
        driver.findElement(By.name("fileUpload")).sendKeys("C:\\Users\\user\\Desktop\\Echiel.jpg");
    }
    public void whenToSend(){
        String when= "label[class=send-now]";
        //-------------לכתוב assert שאם כבר מסומן "מיד אחרי התשלום"
    }
    public void pickEmailOrSMS(){
        String pickEmail= "//span[.='במייל']";
        clickElement(By.xpath(pickEmail));
    }
    public void enterEmailAddressOrPhone(){
        String enterEmail = "input[data-parsley-type=email]";
        sendKeysToElement(By.cssSelector(enterEmail), "ana.nisanzon@gmail.com");
    }
    public void pressShmira(){
        String shmira = "button[type=submit]";
        clickElement(By.cssSelector(shmira));
    }
    public void assertServerAndReciverName(){
        String mekabelName = "//input[@class='ember-view ember-text-field']";
        WebElement mekabel = getWebElement(By.xpath(mekabelName));
        Assert.assertEquals(mekabel.getAttribute("value"),Constance.MEKABEL_NAME);

        //String senderName=
    }
}
