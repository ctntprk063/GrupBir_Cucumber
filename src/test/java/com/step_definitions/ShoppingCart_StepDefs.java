package com.step_definitions;

import com.pages.ShoppingCartPage;
import com.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ShoppingCart_StepDefs {
    ShoppingCartPage scp = new ShoppingCartPage();

    @And("The user navigates to the Shopping Cart.")
    public void theUserNavigatesToTheShoppingCart() {
        scp.shoppingCartIcon.click();

    }

    @Then("The user should be able to see Shopping Cart is empty")
    public void theUserShouldBeAbleToSeeShoppingCartIsEmpty() {
        String actualText = scp.cartEmpty.getText();
       System.out.println("actualText = " + actualText);
        Assert.assertTrue(actualText.contains("empty"));
    }

    @Then("The user click on  the Computers")
    public void theUserClickOnTheComputers() {
        BrowserUtils.waitFor(2);
       scp.computerIcon.click();
    }

    @And("The user clicks on Notebooks icon and adds the product")
    public void theUserClicksOnNotebooksIconAndAddsTheProduct() {
        scp.notebookIcon.click();
        scp.addToCartBtn.click();
    }

    @Then("Verify that the product has been added to the shopping cart")
    public void verifyThatTheProductHasBeenAddedToTheShoppingCart() {
        System.out.println("scp.addToCartVerify.getText() = " + scp.addToCartVerify.getText());
       Assert.assertTrue( scp.addToCartVerify.getText().contains("product has been added"));
    }

    @Then("The user should be able to see Shopping Cart")
    public void theUserShouldBeAbleToSeeShoppingCart() {

        System.out.println("cartVerify = " + scp.cartVerify.getText());
        Assert.assertTrue(scp.cartVerify.getText().contains("cart"));
    }

    @Then("The user click on the update cart")
    public void theUserClickOnTheUpdateCart() {
       scp.updateCartBtn.click();
    }

    @And("The user enters {string} product")
    public void theUserEntersProduct(String productNumer) {
        scp.productsQty.click();
       scp.productsQty.clear();
        scp.productsQty.sendKeys(productNumer);

    }
}
