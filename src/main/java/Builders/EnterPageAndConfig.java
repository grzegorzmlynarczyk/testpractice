package Builders;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.concurrent.TimeUnit;

public class EnterPageAndConfig extends Locomotive {
    public void enterPage(String page){

        //setting up the browser
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();

        ////////////////////////////////////////////////////////////////////////////////////
        options.addArguments("--disable-extensions");
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        options.addArguments("--bwsi");
        options.setExperimentalOption("useAutomationExtension",false);
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);

        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        ///////////////////////////////////////////////////////////////////////////////////

        System.out.println("Starting test at: "+page);

        driver.get(page);
    }
}
