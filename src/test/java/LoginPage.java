import org.openqa.selenium.*;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {
    private static WebDriver driver;
    // Click on כניסה/הרשמה
    public void clickEntryOrRegestry() throws InterruptedException {
        String clickEnterOrRegistry = "span[class=seperator-link]";
        Thread.sleep(5000);//I put it only to check why this page is not opened
        clickElement(By.cssSelector(clickEnterOrRegistry));// click on כניסה/הרשמה
        ////////////////////////////////
        Thread.sleep(400);//I put it only to check why this page is not opened

        String clickRegistration = "span[class=text-btn]";
        clickElement(By.cssSelector(clickRegistration)); // click on הרשמה

    }
    //Click on first name field
    public void focusOnFirstNAme(){
        String firstNameClick= "input[id=ember1280]";
        clickElement(By.cssSelector(firstNameClick));
    }
    public void fillFirstName() throws InterruptedException {
        String firstName = "input[id=ember1280]";
        WebElement firstNameElement = getWebElement(By.cssSelector(firstName));
        sendKeysToElement(By.cssSelector(firstName), "Ana");
        String nameToAssert = "Ana";
        Assert.assertEquals(firstNameElement.getAttribute("value"),Constance.FIRST_MAME);

    }
    // fill mail
    public void fillUserEmail() {
        String userMail = "input[data-parsley-type=email]";
      //  WebElement userEmail= getWebElement(By.cssSelector(userMail));
        sendKeysToElement(By.cssSelector(userMail), "ana.nisanzon@gmail.com");
      //  String mailToAssert= "ana.nisanzon@gmail.com";
      //  Assert.assertEquals(userEmail.getText(),mailToAssert);
    }
    // fill password
    public void fillUserPassword() {
        String userPassword = "input[id=valPass]";
        sendKeysToElement(By.cssSelector(userPassword), "Shiur011");
      //  Assert.assertEquals(userPassword,"Shiur011");
    }
    //fill assure password
    public void fillAssurePassword() {
        String userAssurePassword = "input[id=ember1243]";
        sendKeysToElement(By.cssSelector(userAssurePassword), "Shiur011");
      //  Assert.assertEquals(userAssurePassword,"Shiur011");
    }
    //submit registration to BuyMe
    public void clickSubmit() {
        String submitRegistration = "button[type=submit]";
        submit(By.cssSelector(submitRegistration));// click on כניסה/הרשמה
    }
    //לחץ על כניסה
    public void clickEntry() throws InterruptedException {
        String entry= "span[class=text-btn]";
        Thread.sleep(600);//I put it only to check why this page is not opened
        clickElement(By.cssSelector(entry));
    }

    //click on לכניסה.
    //להוסיף תנאי שרק אם המשתמש כבר קיים , רק אז לחץ על -לכניסה.


    }