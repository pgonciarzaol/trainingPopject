package steps;

import io.cucumber.java.Before;
import utils.SeleniumDriver;

public class BeforeActions {
    @Before
    public static void setUp(){
        System.out.println("Running Biforek");
        SeleniumDriver.setUpDriver();
        SeleniumDriver.getDriver().get("https://www.gazeta.pl/");
    }
}
