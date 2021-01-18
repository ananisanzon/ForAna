import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MainTest {
    private static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        driver = DriverSingleton.getDriverInstance();//איתחול דרייבר
        driver.get("https://www.buyme.co.il"); //האתר עולה
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //המתנה עד שייטען

    }

    @Test
    public void test01_login() throws InterruptedException {
        LoginPage loginPage1 = new LoginPage();
        loginPage1.clickEntryOrRegestry(); //  לחץ על כניסה/הרשמה
    }
    @Test
    public void test02_regerestry() throws InterruptedException {
        LoginPage loginpage1= new LoginPage();
        loginpage1.focusOnFirstNAme();   //click on first name field.
        loginpage1.fillFirstName();      //fill first name
        loginpage1.fillUserEmail();      // fill mail
        loginpage1.fillUserPassword();   // fill password
        loginpage1.fillAssurePassword(); // וודא שהת.ז. נכונה
        loginpage1.clickSubmit();        //לחץ על הרשמה ל BuyMe
        loginpage1.clickEntry();         //לחץ על כניסה
    }
    @Test
    public void test03_homePage() throws InterruptedException {
        HomePage homePage= new HomePage();
        homePage.clickToHome();        // לחץ על כניסה לBuyme
        homePage.chooseShum();         //בחר טווח של סכום המתנה
        homePage.chooseEizor();        // באיזה איזור
        homePage.chooseCategory();     // בחר קטגוריה של המתנה
        homePage.clickFindMePresent(); // לחץ על מצא לי מתנה
    }
    @Test
    public void test04_PickBusiness() throws InterruptedException {
        PickBusiness pickBusiness=new PickBusiness();
      //  pickBusiness.AssertWebsiteUrl();       //וודא שהנתיב תקין
        pickBusiness.pickBuisness();             // בחר את החברה שמספקת את המתנה
        pickBusiness.presentWhithPrice();         // בחר מתנה עם מחיר
        }
    @Test
    public void test05_SendAndRecive() throws InterruptedException {
        SendAndRecive sendAndRecive= new SendAndRecive();
        sendAndRecive.radioButtonToSomeoneElse();     //בחר למישהו אחר
        sendAndRecive.whomToSend();                   //הכנס שם הנמען
        sendAndRecive.assertSenderName();             //וודא שהשם של הנמען תקין
        sendAndRecive.pickEvent();                    //בחר לאיזה אירוע המתנה
        sendAndRecive.writeBlessing();                //הכנס ברכה
        sendAndRecive.attachImage();                  //צרף קובץ
        sendAndRecive.whenToSend();                  //לחץ מיד אחרי התשלום
        sendAndRecive.pickEmailOrSMS();              //סמן איך לשלוח במייל או בסמס
        sendAndRecive.enterEmailAddressOrPhone();    //הכנס מייל או מספר נייד
        sendAndRecive.pressShmira();                 //לחץ שמירה
    }
    @AfterClass
    public static void afterClass() { driver.quit(); }
}

