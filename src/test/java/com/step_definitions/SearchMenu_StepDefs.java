package com.step_definitions;

import com.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchMenu_StepDefs {
    LoginPage loginPage=new LoginPage();


    @When("The user searches for the product on the website, they must verify that the product is displayed")
    public void theUserSearchesForTheProductOnTheWebsiteTheyMustVerifyThatTheProductIsDisplayed() {
    }

    @Then("Verify item not found is displayed when user searches for item not on website")
    public void verifyItemNotFoundIsDisplayedWhenUserSearchesForItemNotOnWebsite() {
        
    }

    @And("Can verify that search results contain accurate and up-to-date information on product features and pricing")
    public void canVerifyThatSearchResultsContainAccurateAndUpToDateInformationOnProductFeaturesAndPricing() {
        
    }

    @When("Users can save search results according to the criteria they want")
    public void usersCanSaveSearchResultsAccordingToTheCriteriaTheyWant() {
        
    }

   

    @And("Search menu is case sensitive")
    public void searchMenuIsCaseSensitive() {
    }

    @And("search menu works with numbers and signs")
    public void searchMenuWorksWithNumbersAndSigns() {
        
    }

    @And("A photo or price of any product should appear on the search results page")
    public void aPhotoOrPriceOfAnyProductShouldAppearOnTheSearchResultsPage() {

    }
}
