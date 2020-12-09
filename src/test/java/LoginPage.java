import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    // Click on כניסה/הרשמה
    public void pressElement() throws InterruptedException {
        String clickEnterOrRegistry = "span[class=seperator-link]";
        Thread.sleep(5000);//I put it only to check why this page is not opened
        clickElement(By.cssSelector(clickEnterOrRegistry));// click on כניסה/הרשמה
        ////////////////////////////////
        Thread.sleep(400);//I put it only to check why this page is not opened

        String clickRegistration = "span[class=text-btn]";
        clickElement(By.cssSelector(clickRegistration)); // click on הרשמה

    }
    public void fillFirstName(){
        String firstName= "input[id=ember1237]";
        sendKeysToElement(By.cssSelector(firstName), "Ana");
    }
    // fill mail
    public void fillUserEmail() {
        String userMail = "input[data-parsley-type=email]";
        sendKeysToElement(By.cssSelector(userMail), "ana.nisanzon@gmail.com");
    }
    // fill password
    public void fillUserPassword() {
        String userPassword = "input[id=valPass]";
        sendKeysToElement(By.cssSelector(userPassword), "Shiur011");
    }
    //fill assure password
    public void fillAssurePassword() {
        String userAssurePassword = "input[id=ember1243]";
        sendKeysToElement(By.cssSelector(userAssurePassword), "Shiur011");
    }
    //submit registration to BuyMe
    public void clickSubmit() {
        String submitRegistration = "button[type=submit]";
        clickElement(By.cssSelector(submitRegistration));  // click on כניסה/הרשמה
    }
    }