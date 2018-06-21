import Builders.EditPersonalInfo;
import Builders.EnterPageAndConfig;
import Builders.SignIn;
import Locators.MyAccount;
import Locators.StartingPage;
import io.ddavison.conductor.Locomotive;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChangePersonalInformation extends Locomotive {
    @Test
    public void changePersonalInformation(){
        String user = "Test2106@test2106.com";
        String password = "test123456";

        EnterPageAndConfig enterPageAndConfig = new EnterPageAndConfig();
        EditPersonalInfo editPersonalInfo = new EditPersonalInfo();
        SignIn signIn = new SignIn();

        enterPageAndConfig.enterPage(StartingPage.MAINPAGE);
        this.driver = enterPageAndConfig.driver;

        waitForElement(StartingPage.SIGNINBTN);
        driver.findElement(StartingPage.SIGNINBTN).click();
        waitForElement(StartingPage.CREATEBTN);

        signIn.signIn(driver,user,password);

        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(MyAccount.MYPERSON));
        driver.findElement(MyAccount.MYPERSON).click();

        waitForElement(MyAccount.FIRSTNAME);

        editPersonalInfo.editPersonalInfo(driver,"edit",password);

        WebElement element = driver.findElement(MyAccount.SUCCESS);

        if(element.isDisplayed()){
            assert true;
        }else{
            assert false;
        }

    }
}
