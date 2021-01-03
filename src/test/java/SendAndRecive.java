import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SendAndRecive extends HomePage{
    private static WebDriver driver;

    public  SendAndRecive() {
        driver = DriverSingleton.getDriverInstance();
    }
    //בחר רדיו באטון למישהו אחר
    public void radioButtonToSomeoneElse(){
         String toSomeoneElse= "למישהו אחר";
         clickElement(By.linkText(toSomeoneElse));
         //String toSomeoneElse="ember7080";
         //clickElement(By.id(toSomeoneElse));
    }
    public void whomToSend(){
        String whom = "מי הזוכה המאושר? יש להשלים את שם המקבל/ת";
        sendKeysToElement(By.linkText(whom), "Feiga");
    }
}
