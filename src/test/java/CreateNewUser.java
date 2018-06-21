import Builders.CreateUserName;
import Builders.EnterPageAndConfig;
import Builders.FillNewUserForm;
import Locators.MyAccount;
import Locators.NewUserForm;
import Locators.StartingPage;
import io.ddavison.conductor.Locomotive;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateNewUser extends Locomotive {
    @Test
    public void createNewUser(){
        EnterPageAndConfig enterPageAndConfig = new EnterPageAndConfig();
        FillNewUserForm fillNewUserForm = new FillNewUserForm();
        String user = CreateUserName.createUserName();


        enterPageAndConfig.enterPage(StartingPage.MAINPAGE);
        this.driver = enterPageAndConfig.driver;

        waitForElement(StartingPage.SIGNINBTN);
        driver.findElement(StartingPage.SIGNINBTN).click();
        waitForElement(StartingPage.CREATEBTN);
        driver.findElement(StartingPage.EMAILFORM).sendKeys(user+"@test.com");
        driver.findElement(StartingPage.CREATEBTN).click();

        waitForElement(NewUserForm.FIRSTNAME);

        fillNewUserForm.fillNewUserForm(driver,"Test","Test","test123456","25","5","1993",
                                        "TestCompany", "TestAddress","TestAddress2","TestCity","32","12345",
                                        "21","TestAdditionalInfo","123456789","00123456789","test@test.com");

        driver.findElement(NewUserForm.REGBTN).click();

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
