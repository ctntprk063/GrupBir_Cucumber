package com.pages;

import com.utilities.BrowserUtils;
import com.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchMenuPage extends BasePage {
    @FindBy(xpath = "//input[@type='text'][1]")
    public WebElement searchMenuplace;
    //    @FindBy(linkText = "/books") link text
    @FindBy(partialLinkText = "Books")
    public WebElement searchMenuBooks;
    @FindBy(xpath = "//*[@type='submit'][1]")
    public WebElement submitBtn;
    @FindBy(xpath = "//div[@class='search-results']")
    public WebElement searchResult;
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div[1]/div/div[2]/h2/a")
    public WebElement Image;

    public void searchMenu(String text) {

      //  String books = searchMenuBooks.getText();
        BrowserUtils.waitFor(2);

        searchMenuplace.sendKeys(text);
        BrowserUtils.waitFor(2);
        submitBtn.click();


    }
    public void menu(String element){
       // Driver.get().findElement(By.xpath("//input[@type='text'][1]").
    }


}

