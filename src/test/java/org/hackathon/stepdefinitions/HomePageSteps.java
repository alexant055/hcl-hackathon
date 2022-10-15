package org.hackathon.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hackathon.pages.HomePage;

public class HomePageSteps {
    HomePage homePage;

    @When("home page visible")
    public void homePageVisible() {
        homePage = new HomePage();
    }

    @Then("click menu")
    public void clickMenu() {
        homePage.mouseOver("Services");
    }

    @Given("Application launched")
    public void applicationLaunched() {

    }

    @Then("get count of menu and sub-menu")
    public void getCountOfMenuAndSubMenu() {
    }
}
