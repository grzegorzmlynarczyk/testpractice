package Builders;

import Locators.StartingPage;
import org.openqa.selenium.WebDriver;

public class SignIn {
    public void signIn(WebDriver driver, String user, String password){

        driver.findElement(StartingPage.EXEMAILFORM).sendKeys(user);
        driver.findElement(StartingPage.PSW).sendKeys(password);
        driver.findElement(StartingPage.SIGNINBTNGRN).click();

    }
}
