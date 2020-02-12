package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumDriver {
    private static SeleniumDriver seleniumDriver;
    private static WebDriver driver;
    public final static int TIMEOUT = 30;
    public final static int PAGE_LOAD_TIMEOUT = 50;

    private SeleniumDriver(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
    }
    public static WebDriver getDriver(){
        return driver;
    }
    public static void tearDown() {
        if (driver != null) {
            System.out.println("Running tearDown");
//            driver.close();
//            driver.quit();
        }
        seleniumDriver = null;
    }
    public static void setUpDriver() {
        if (seleniumDriver == null)
            seleniumDriver = new SeleniumDriver();

    }

}
