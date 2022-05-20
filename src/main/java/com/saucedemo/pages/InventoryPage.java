package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage extends Utility {
    private static final Logger log = LogManager.getLogger(InventoryPage.class.getName());

    public InventoryPage() {
        PageFactory.initElements(driver, this);
    }

//    @CacheLookup
//    @FindBy(xpath = "//select[@class='product_sort_container']//child::option[4]")
//    WebElement sortByDropDown;

    @CacheLookup
    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement sortByDropDown;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
    WebElement expensiveItemAddToCartButton;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    WebElement cheapestItemAddToCartButton;

    @CacheLookup
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement viewShoppingCart;

//    public void selectSortByPriceHighToLow(String text){
//        log.info("Selecting sort by price 'high to low' from dropdown : " + text + sortByDropDown.toString());
//        selectByValueFromDropDown(sortByDropDown, text);

    public void selectSortByPriceHighToLow(String text) {
        selectByVisibleTextFromDropDown(sortByDropDown, text);
        log.info("Selecting by: " + sortByDropDown.toString());
    }

    public void addCostliestProductToCart() {
        clickOnElement(expensiveItemAddToCartButton);
        log.info("Adding Costliest Product to cart: " + expensiveItemAddToCartButton.toString());
    }

    public void addCheapestProductToCart() {
        clickOnElement(cheapestItemAddToCartButton);
        log.info("Adding Cheapest Product to cart: " + cheapestItemAddToCartButton.toString());
    }

    public void setViewShoppingCart() {
        clickOnElement(viewShoppingCart);
        log.info("Clicking on Shopping Cart: " + viewShoppingCart.toString());
    }

}
