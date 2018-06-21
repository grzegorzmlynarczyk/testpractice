package Locators;

import org.openqa.selenium.By;

public class MyAccount {
    public static final By ORDERHIS  = By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span");
    public static final By MYPERSON  = By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a/span");

    //personalinformationtab
    public static final By FIRSTNAME = By.id("firstname");
    public static final By OLDPSW    = By.id("old_passwd");
    public static final By SAVE      = By.xpath("//*[@id=\"center_column\"]/div/form/fieldset/div[11]/button");

    //afteredit
    public static final By SUCCESS   = By.xpath("//*[@id=\"center_column\"]/div/p");
}
