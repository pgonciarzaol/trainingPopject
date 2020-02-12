package sites.actions;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sites.locators.HomePageLocators;
import utils.SeleniumDriver;

import java.time.Duration;


public class HomePageActions {
    HomePageLocators homePageLocators = null;
    public HomePageActions(){
        this.homePageLocators = new HomePageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(),homePageLocators);
    }
    public void checkIfGazetaLogoIsVisible(){
        WebElement gazetaLogo = new WebDriverWait(SeleniumDriver.getDriver(),Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageLocators.gazetaLogoImg));
        System.out.println("found logo visible");
    }

    public void clickAcceptCookieButton(){
        WebElement acceptCookiesButton = new WebDriverWait(SeleniumDriver.getDriver(),Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(homePageLocators.acceptCookieButton));
        acceptCookiesButton.click();
    }

    public void validateSiteHeaderElements() {

        Assert.assertTrue(homePageLocators.newsLink.isDisplayed());
        Assert.assertTrue(homePageLocators.sportLink.isDisplayed());
        Assert.assertTrue(homePageLocators.nextLink.isDisplayed());
        Assert.assertTrue(homePageLocators.womanLink.isDisplayed());
        Assert.assertTrue(homePageLocators.emailLink.isDisplayed());
        Assert.assertTrue(homePageLocators.forumLink.isDisplayed());
        Assert.assertTrue(homePageLocators.workLink.isDisplayed());
        Assert.assertTrue(homePageLocators.offersLink.isDisplayed());
        Assert.assertTrue(homePageLocators.wyborczaLink.isDisplayed());
        Assert.assertTrue(homePageLocators.searchLink.isDisplayed());
    }
}
