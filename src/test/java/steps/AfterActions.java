package steps;

import io.cucumber.java.After;
import utils.SeleniumDriver;

public class AfterActions {
    @After
    public void after(){
        SeleniumDriver.tearDown();
    }
}
