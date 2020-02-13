package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import screens.LandingScreens;
import testUI.Configuration;

import static testUI.UIOpen.open;
import static testUI.Utils.AppiumHelps.sleep;

public class LandingSteps {
    private LandingScreens landingScreen = new LandingScreens();

    @Given("I check landing screen")
    public void iCheckLandingScreen() {
        Configuration.useAllure = true;
        Configuration.automationType = Configuration.ANDROID_PLATFORM;
        Configuration.androidAppPath = "src/test/resources/groceries-app.apk";
        open();
    }

    @When("I click on add shopping list")
    public void iClickOnAddShoppingList() {
        landingScreen.addShopingList();
    }

    @And("I type {string}")
    public void iType(String arg0) {
        landingScreen.typeInShoppingList(arg0);
    }

    @And("I click on add list")
    public void iClickOnAddList() {
        landingScreen.addAShopinglistButton();
        sleep(3000);
    }

    @Then("I see {string} on landing screen")
    public void iSeeOnLandingScreen(String arg0) {
        landingScreen.AddsToList(arg0);
    }

    @When("I click on {string}")
    public void iClickOn(String arg0) {
        landingScreen.opensList1();
    }

    @And("I click on option bar")
    public void iClickOnOptionBar() {
        landingScreen.openMenu();
    }

    @Then("I click on delete list")
    public void iClickOnDeleteList() {
        landingScreen.pressDelete();
    }


    @When("I delete the list {string}")
    public void iDeleteTheList(String arg0) {
        landingScreen.confrimDelete();

    }

    @Then("I check there is no {string}")
    public void iCheckThereIsNo(String arg0) {
        landingScreen.check("First List 1");
    }

}