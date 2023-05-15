package com.step_definitions;

import com.pages.LoginPage;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefs {
    LoginPage loginPage=new LoginPage();
    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));

    }
    @When("The user enters valid credentials")
    public void the_user_enters_valid_credentials()
    {
     loginPage.login();
    }

    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {

    }
}
