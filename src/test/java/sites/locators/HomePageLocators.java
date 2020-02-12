package sites.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLocators {

    @FindBy(how = How.XPATH, using = "//*[@title='GAZETA.pl - Wiadomości, Rozrywka, Forum, Poczta']")
    public WebElement gazetaLogoImg;

    @FindBy(how = How.XPATH, using = "//button[@data-action='agree']")
    public WebElement acceptCookieButton;

    @FindBy(how = How.XPATH, using = "//*[@class='c-main-navigation__inner-wrapper']//*[@title='Wiadomości']")
    public WebElement newsLink;

    @FindBy(how = How.XPATH, using = "//*[@class='c-main-navigation__inner-wrapper']//*[@title='Sport']")
    public WebElement sportLink;

    @FindBy(how = How.XPATH,using = "//*[@class='c-main-navigation__inner-wrapper']//*[@title='Next']")
    public WebElement nextLink;

    @FindBy(how = How.XPATH, using = "//*[@class='c-main-navigation__inner-wrapper']//*[@title='kobieta']")
    public WebElement womanLink;

    @FindBy (how = How.XPATH, using = "//*[@class='c-main-navigation__inner-wrapper']//*[@title='Wyborcza.pl']")
    public WebElement wyborczaLink;

    @FindBy (how = How.XPATH, using = "//*[@class='c-main-navigation__inner-wrapper']//*[@title='Poczta']")
    public WebElement emailLink;

    @FindBy (how = How.XPATH, using = "//*[@class='c-main-navigation__inner-wrapper']//*[@title='Forum']")
    public WebElement forumLink;

    @FindBy (how = How.XPATH, using = "//*[@class='c-main-navigation__inner-wrapper']//*[@title='Praca']")
    public WebElement workLink;

    @FindBy (how = How.XPATH, using = "//*[@class='c-main-navigation__inner-wrapper']//*[@title='Oferty nieruchomości']")
    public WebElement offersLink;

    @FindBy (how = How.XPATH, using = "//*[@class='c-main-navigation__inner-wrapper']//*[@title='Szukaj']")
    public WebElement searchLink;

}
