package Builders;

import Locators.NewUserForm;
import io.ddavison.conductor.Locomotive;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;

public class FillNewUserForm {
    public void fillNewUserForm(WebDriver driver, String firstname, String lastname, String password, String day,
                                       String month, String year, String company, String address, String address2,
                                       String city, String state, String postal, String country, String additional,
                                       String homephone, String mobliephone, String assign){

        driver.findElement(NewUserForm.FIRSTNAME).sendKeys(firstname);
        driver.findElement(NewUserForm.LASTNAME).sendKeys(lastname);
        driver.findElement(NewUserForm.PSW).sendKeys(password);

        new Select(driver.findElement(NewUserForm.DATEDAY)).selectByValue(day);
        new Select(driver.findElement(NewUserForm.DATEMONTH)).selectByValue(month);
        new Select(driver.findElement(NewUserForm.DATEYEAR)).selectByValue(year);

        driver.findElement(NewUserForm.COMPANY).sendKeys(company);
        driver.findElement(NewUserForm.ADDRESS).sendKeys(address);
        driver.findElement(NewUserForm.ADDRESS2).sendKeys(address2);
        driver.findElement(NewUserForm.CITY).sendKeys(city);

        new Select(driver.findElement(NewUserForm.STATE)).selectByValue(state);

        driver.findElement(NewUserForm.POSTAL).sendKeys(postal);

        new Select(driver.findElement(NewUserForm.COUNTRY)).selectByValue(country);

        driver.findElement(NewUserForm.ADDINFO).sendKeys(additional);
        driver.findElement(NewUserForm.HPHONE).sendKeys(homephone);
        driver.findElement(NewUserForm.MPHONE).sendKeys(mobliephone);
        driver.findElement(NewUserForm.ASSING).sendKeys(assign);
    }
}
