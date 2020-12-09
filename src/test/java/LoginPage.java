import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    // Click on כניסה/הרשמה
    public void pressElement() {
        String clickEnterOrRegistry = "span[class=seperator-link]";
        clickElement(By.cssSelector(clickEnterOrRegistry));  // click on כניסה/הרשמה

        String clickRegistration = "span[class=text-btn]";
        clickElement(By.cssSelector(clickRegistration)); // click on הרשמה
    }
    public void fillFirstName(){
        String firstName= "input[id=ember1296]";
        sendKeysToElement(By.cssSelector(firstName), "Ana");
    }
    // fill mail
    public void fillUserEmail() {
        String userMail = "input[data-parsley-type=email]";
        sendKeysToElement(By.cssSelector(userMail), "ana.nisanzon@gmail.com");
    }
    // fill password
    public void fillUserPassword() {
        String userPassword = "input[required type=password]";
        sendKeysToElement(By.cssSelector(userPassword), "Shiur011");
    }
    //fill assure password
    public void fillAssurePassword() {
        String userAssurePassword = "input[id=1578]";
        sendKeysToElement(By.cssSelector(userAssurePassword), "Shiur011");
    }
    //submit registration to BuyMe
    public void submit() {
        String submitRegistration = "button[class=ui-btn orange large]";
        clickElement(By.cssSelector(submitRegistration));  // click on כניסה/הרשמה
    }
    }