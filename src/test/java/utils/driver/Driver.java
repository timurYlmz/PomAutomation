package utils.driver;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    public static WebDriver browser;

    public void init(){
        browser = DriverFactory.getDriver();
        browser.manage().window().maximize();
        browser.manage().deleteAllCookies();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void terminate(){browser.quit();}

}
