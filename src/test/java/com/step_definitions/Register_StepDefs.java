package com.step_definitions;

import com.pages.RegisterPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Register_StepDefs {
    RegisterPage registerPage = new RegisterPage();

    @When("The user navigates to the Register.")
    public void the_user_navigates_to_the_register() {
        registerPage.RegisterBtn.click();
    }

    @Then("The user enters {string} and {string} and {string} and {string} and {string} registers credentials")
    public void the_user_enters_and_and_and_and_registers_credentials(String firstname, String lastname, String email, String password, String confirmPassword) {
        registerPage.register(firstname,lastname,email,password,confirmPassword);
    }

    @Then("The user should be able to register")
    public void the_user_should_be_able_to_register() {

        registerPage.isDisplayedMtd();
    }
    @Then("First and Last Name should not accept numbers")
    public void first_and_last_name_should_not_accept_numbers() {

    }
    @Then("The user should ne able to not  take a text contain\"Your registration completed\"")
    public void the_user_should_ne_able_to_not_take_a_text_contain_your_registration_completed() {

    }
}
