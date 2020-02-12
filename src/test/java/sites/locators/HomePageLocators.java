package sites.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLocators {

    @FindBy(how = How.XPATH, using = "//*[@title='GAZETA.pl - Wiadomości, Rozrywka, Forum, Poczta']")
    public WebElement gazetaLogoImg;

    @FindBy(how = How.XPATH, using = "//button[@data-action='agree']")
    public WebElement acceptCookieButton;
}