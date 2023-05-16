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
    @Then("First and Last Name should not accept numbers {string}")
    public void first_and_last_name_should_not_accept_numbers(String message) {
        String expectedMessage = registerPage.Message.getText();
        String actualMessage = message;
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Then("First Name cannot be left blank {string}")
    public void first_name_cannot_be_left_blank(String message1) {

        String expectedMessage = registerPage.FirstNameMessage.getText();
        String actualMessage = message1;
        Assert.assertEquals(actualMessage, expectedMessage);
    }
    @Then("The password should have at least six characters. {string}")
    public void the_password_should_have_at_least_six_characters(String message2) {
        String expectedMessage = registerPage.PasswordMessage.getText();
        String actualMessage = message2;
        Assert.assertEquals(actualMessage, expectedMessage);
    }
    @Then("email cannot be left blank {string}")
    public void email_cannot_be_left_blank(String message3) {

        String expectedMessage = registerPage.EmailEmptyMessage.getText();
        String actualMessage = message3;
       Assert.assertEquals(actualMessage,expectedMessage);
    }
    @Then("Email address should not be accepted without the @sign {string}")
    public void email_address_should_not_be_accepted_without_the_sign(String message4) {
        String expectedMessage = registerPage.WrongEmailMessage.getText();
        String actualMessage = message4;
        Assert.assertEquals(actualMessage,expectedMessage);

    }
}
