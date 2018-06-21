package Builders;

import Locators.MyAccount;
import org.openqa.selenium.WebDriver;

public class EditPersonalInfo {
    public void editPersonalInfo(WebDriver driver, String firstnameedit, String password){

        driver.findElement(MyAccount.FIRSTNAME).sendKeys(firstnameedit);
        driver.findElement(MyAccount.OLDPSW).sendKeys(password);
        driver.findElement(MyAccount.SAVE).click();

    }
}
