import Builders.CreateUserName;
import Builders.EnterPageAndConfig;
import Builders.FillNewUserForm;
import Builders.SignIn;
import Locators.MyAccount;
import Locators.StartingPage;
import io.ddavison.conductor.Locomotive;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInTest extends Locomotive {
    @Test
    public void signInTest() {
        EnterPageAndConfig enterPageAndConfig = new EnterPageAndConfig();
        SignIn signIn = new SignIn();

        enterPageAndConfig.enterPage(StartingPage.MAINPAGE);
        this.driver = enterPageAndConfig.driver;

        waitForElement(StartingPage.SIGNINBTN);
        driver.findElement(StartingPage.SIGNINBTN).click();
        waitForElement(StartingPage.CREATEBTN);

        signIn.signIn(driver,"Test2106@test2106.com","test123456");

        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(MyAccount.ORDERHIS));
        WebElement element = driver.findElement(MyAccount.ORDERHIS);

        if (element.isDisplayed()){
            assert true;
        }else {
            assert false;
        }
    }
}
