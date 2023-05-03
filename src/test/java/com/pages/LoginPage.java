package com.pages;

import com.utilities.ConfigurationReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public  class LoginPage extends BasePage {

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement loginBtn;

    @FindBy(className = "ico-logout")
    public WebElement logOut;

    @FindBy(className = "page-title")
    public WebElement titleText;

    @FindBy(id = "Email")
    public WebElement emailBox;

    @FindBy(id = "Password")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@class='button-1 login-button']")
    public WebElement loginSubmit;

    @FindBy(className ="topic-html-content-header")
    public WebElement textControl;

    @FindBy(className = "validation-summary-errors")
    public WebElement unsuccess;

    @FindBy(xpath = "//span[@for='Email']")
    public WebElement invaildMail;

    public void login(){
        loginBtn.click();
        Assert.assertTrue(titleText.getText().contains("Sign In!"));
        emailBox.sendKeys(ConfigurationReader.get("loginMail"));
        passwordBox.sendKeys(ConfigurationReader.get("loginPassword"));
        loginSubmit.click();
    }
    public void invalidLogin(){
        logOut.click();
        loginBtn.click();
        Assert.assertTrue(titleText.getText().contains("Sign In!"));
        emailBox.sendKeys("ilhan@gmail.com");
        passwordBox.sendKeys("12345");
        loginSubmit.click();
    }











}
