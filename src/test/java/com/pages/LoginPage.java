package com.pages;

import com.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public  class LoginPage extends BasePage {

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement loginBtn;

    @FindBy(id = "Email")
    public WebElement emailBox;

    @FindBy(id = "Password")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@class='button-1 login-button']")
    public WebElement loginSubmit;

    public void login(){
        loginBtn.click();
        emailBox.sendKeys(ConfigurationReader.get("loginMail"));
        passwordBox.sendKeys(ConfigurationReader.get("loginPassword"));
        loginSubmit.click();
    }


 //deneme
    //deneme2
    //deneme3



}
