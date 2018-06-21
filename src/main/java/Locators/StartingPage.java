package Locators;

import org.openqa.selenium.By;

public class StartingPage {

    public static final String MAINPAGE = "http://automationpractice.com/index.php";

    public static final By SIGNINBTN    = By.className("login");
    public static final By CONTACTUSBTN = By.id("contact-link");
    public static final By WOMENBTN     = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a");
    public static final By DRESSESBTN   = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a");
    public static final By TSHIRTSBTN   = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a");
    public static final By SEARCHIN     = By.id("search_query_top");
    public static final By CARTBTN      = By.className("shopping_cart");

    public static final By CREATEBTN    = By.id("SubmitCreate");
    public static final By EMAILFORM    = By.id("email_create");
    public static final By SIGNINBTNGRN = By.id("SubmitLogin");
    public static final By EXEMAILFORM  = By.id("email");
    public static final By PSW          = By.id("passwd");
    public static final By FRGTPSW      = By.linkText("Forgot your password?");
}
