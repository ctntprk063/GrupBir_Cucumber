package com.pages;

import com.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {
    @FindBy(xpath = "//a[text()='Register']")
    public WebElement RegisterBtn;
    @FindBy(xpath = "//label[text()='Male']")
    public WebElement GenderBtn;
    @FindBy(xpath = "//input[@name='FirstName']")
    public WebElement FirstName;
    @FindBy(xpath = "//input[@name='LastName']")
    public WebElement LastName;
    @FindBy(xpath = "//input[@name='Email']")
    public WebElement Email;
    @FindBy(xpath = "//input[@name='Password']")
    public WebElement Password;
    @FindBy(xpath = "//input[@name='ConfirmPassword']")
    public WebElement ConfirmPassword;
    @FindBy(xpath = "//input[@name='register-button']")
    public WebElement RegisterCheck;
    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement ContinueBtn;
    @FindBy(xpath = "//a[text()='Log out']")
    public WebElement LogoutText;
    @FindBy(xpath = "//div[@class='result']")
    public WebElement Message;
    @FindBy(xpath = "(//span[@class='field-validation-error'])[1]")
    public WebElement FirstNameMessage;
    @FindBy(xpath = "//span[text()='The password should have at least 6 characters.']")
    public WebElement PasswordMessage;
    @FindBy(xpath = "//span[text()='Wrong email']")
    public WebElement WrongEmailMessage;
    @FindBy(xpath = "//span[text()='Email is required.']")
    public WebElement EmailEmptyMessage;



    public void register(String firstname, String lastname, String email, String password, String confirmPassword) {
        GenderBtn.click();
        FirstName.sendKeys(firstname);
        LastName.sendKeys(lastname);
        Email.sendKeys(email);
        Password.sendKeys(password);
        ConfirmPassword.sendKeys(confirmPassword);
        RegisterCheck.click();
        //ContinueBtn.click();
    }

    public void isDisplayedMtd() {
        BrowserUtils.waitForPageToLoad(2);
        Assert.assertTrue(LogoutText.isDisplayed());
    }
}

