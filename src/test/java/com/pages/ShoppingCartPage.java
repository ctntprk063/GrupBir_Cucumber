package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

    @FindBy(xpath = "//span[text()='Shopping cart']")
    public WebElement shoppingCartIcon;

    @FindBy(xpath = "//h1[text()='Shopping cart']")
    public WebElement cartVerify;

    @FindBy(className = "page-body")
    public WebElement cartEmpty;

    @FindBy(partialLinkText = "Notebooks")
    public WebElement notebookIcon;

    @FindBy(xpath = "//input[@value='Add to cart']")
    public WebElement addToCartBtn;

    @FindBy(xpath = "//p[text()='The product has been added to your ']")
    public WebElement addToCartVerify;


    @FindBy(xpath = "(//td[@class='qty nobr']//input)[1]")
    public WebElement productsQty;

    @FindBy(name = "updatecart")
    public WebElement updateCartBtn;

}
