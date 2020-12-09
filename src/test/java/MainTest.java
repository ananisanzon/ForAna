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
        loginPage.fillFirstName();  //fill first name
        loginPage.fillUserEmail();// fill mail
        loginPage.fillUserPassword(); // fill password
        loginPage.fillAssurePassword();
        loginPage.clickSubmit(); //לחץ על הרשמה ל BuyMe
    }

    //@AfterClass
    //public static void afterClass() {
    //    driver.quit();
    //}
}
