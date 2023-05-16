package com.pages;

import com.utilities.BrowserUtils;
import com.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(partialLinkText = "Books")
    public WebElement booksIcon;

    @FindBy(xpath =  "//ul[@class='top-menu']/li[2]")
    public WebElement computerIcon;

    @FindBy(partialLinkText = "Electronics")
    public WebElement elektronicIcon;

    @FindBy(partialLinkText = "Apparel")
    public WebElement apparelIcon;

    @FindBy(partialLinkText = "Digital")
    public WebElement digitalIcon;

    @FindBy(partialLinkText = "Jewelry")
    public WebElement jewelryIcon;

    @FindBy(partialLinkText = "Gift")
    public WebElement giftIcon;

    public void topMenu(String menu) {
    Driver.get().findElement(By.partialLinkText(menu)).click();

    }

}
