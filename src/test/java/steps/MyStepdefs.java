package steps;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sites.actions.HomePageActions;

public class MyStepdefs {
    HomePageActions homePageActions = new HomePageActions();

    @Given("I opened gazeta landing site")
    public void iOpenedGazetaLandingSite() {
        homePageActions.checkIfGazetaLogoIsVisible();
    }

    @Then("I validate that header site elements are available")
    public void iValidateThatHeaderSiteElementsAreAvailable() {
        System.out.println("None");
    }

    @When("I click on accept cookie button")
    public void iClickOnAcceptCookieButton() {
        homePageActions.clickAcceptCookieButton();
    }
}
