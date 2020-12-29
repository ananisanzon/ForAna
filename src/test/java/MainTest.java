import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MainTest {
    private static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        driver = DriverSingleton.getDriverInstance();
        driver.get("https://www.buyme.co.il");
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
    }

    @Test
    public void test01_login() throws InterruptedException {
        LoginPage loginPage1 = new LoginPage();
        loginPage1.clickEntryOrRegestry(); //  click on כניסה/הרשמה
    }
    @Test
    public void test02_regerestry() throws InterruptedException {
        LoginPage loginpage1= new LoginPage();
        loginpage1.focusOnFirstNAme();//click on first name field.
        loginpage1.fillFirstName();  //fill first name
        loginpage1.fillUserEmail();// fill mail
        loginpage1.fillUserPassword(); // fill password
        loginpage1.fillAssurePassword();
        loginpage1.clickSubmit(); //לחץ על הרשמה ל BuyMe
        loginpage1.clickEntry(); //לחץ על כניסה
    }
    @Test
    public void test03_homePage() throws InterruptedException {
        HomePage homePage= new HomePage();
        homePage.clickToHome();
        homePage.chooseShum();
        homePage.chooseEizor();
        homePage.chooseCategory();
        homePage.clickFindMePresent();
    }
    @Test
    public void test04_PickBusiness() throws InterruptedException {
        PickBusiness pickBusiness=new PickBusiness();
        pickBusiness.AssertWebsiteUrl();
        pickBusiness.PickBuisness();
        pickBusiness.choosePresentWhithPrice();
        }
    }

    //@AfterClass
    //public static void afterClass() {
    //    driver.quit();
    //}

