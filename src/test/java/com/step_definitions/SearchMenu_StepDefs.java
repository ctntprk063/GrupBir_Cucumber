package com.step_definitions;

import com.github.dockerjava.api.model.Image;
import com.pages.LoginPage;
import com.pages.SearchMenuPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;

public class SearchMenu_StepDefs {
    LoginPage loginPage=new LoginPage();
SearchMenuPage searchMenuPage=new SearchMenuPage();

    @When("The user searches for the product on the website, they must verify that the {string} is displayed")
    public void theUserSearchesForTheProductOnTheWebsiteTheyMustVerifyThatTheIsDisplayed(String text) {
        searchMenuPage.searchMenu(text);


    }

    @Then("Verify item not found is displayed when user searches for item not on website")
    public void verifyItemNotFoundIsDisplayedWhenUserSearchesForItemNotOnWebsite() {
        System.out.println("searchMenuPage.searchResult.getText() = " + searchMenuPage.searchResult.getText());
        Assert.assertTrue(searchMenuPage.searchResult.getText().contains("No products"));
    }




    @And("Search menu is case sensitive {string}")
    public void searchMenuIsCaseSensitive(String text) {
        searchMenuPage.searchMenu(text);

    }
    @And("search menu works with numbers and signs {string}")
    public void searchMenuWorksWithNumbersAndSigns(String text) {
        searchMenuPage.searchMenu(text);
    }




    @And("A photo or price of any product should appear on the search results page {string}")
    public void aPhotoOrPriceOfAnyProductShouldAppearOnTheSearchResultsPage(String text) {
        searchMenuPage.searchMenu(text);


        Assert.assertTrue(searchMenuPage.Image.getText().contains("Build your own cheap computer"));

    }
}
