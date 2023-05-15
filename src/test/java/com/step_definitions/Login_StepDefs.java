package com.step_definitions;

import com.pages.LoginPage;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
public class Login_StepDefs {
    LoginPage loginPage=new LoginPage();
    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("The user enters valid credentials")
    public void the_user_enters_valid_credentials() {
     loginPage.login();
    }
    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        Assert.assertTrue(loginPage.textControl.getText().contains("Welcome"));
    }

    @When("The user enters {string} and {string}")
    public void theUserEntersAnd(String username, String password) {
        loginPage.loginBtn.click();
        loginPage.emailBox.sendKeys(username);
        loginPage.passwordBox.sendKeys(password);
        loginPage.loginSubmit.click();
    }

    @Then("The user should be able not to login")
    public void theUserShouldBeAbleNotToLogin() {
        Assert.assertTrue(loginPage.titleText.getText().contains("Sign In!"));
    }
    @And("The user take a text contain{string}")
    public void theUserTakeATextContain(String message) {
        Assert.assertTrue(loginPage.unsuccess.getText().contains(message));

    }

    @And("The user must take a text contain{string}")
    public void theUserMustTakeATextContain(String message) {
        Assert.assertTrue(loginPage.invaildMail.getText().contains(message));

    }


}
