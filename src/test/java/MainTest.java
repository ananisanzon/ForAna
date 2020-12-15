import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
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
        LoginPage loginPage = new LoginPage();
        loginPage.pressElement(); //  click on כניסה/הרשמה
    }
    @Test
    public void test02_regerestry() throws InterruptedException {
        LoginPage loginPage1= new LoginPage();
        loginPage1.pressTextField();//click on first name field.
        loginPage1.fillFirstName();  //fill first name
        loginPage1.fillUserEmail();// fill mail
        loginPage1.fillUserPassword(); // fill password
        loginPage1.fillAssurePassword();
        loginPage1.clickSubmit(); //לחץ על הרשמה ל BuyMe
    }


    //@AfterClass
    //public static void afterClass() {
    //    driver.quit();
    //}
}
