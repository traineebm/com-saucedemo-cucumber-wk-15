package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckOutPage extends Utility {

    private static final Logger log = LogManager.getLogger(CheckOutPage.class.getName());

    public CheckOutPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement postCode;

    @CacheLookup
    @FindBy(xpath = "//input[@id='continue']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishButton;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]")
    WebElement orderConfirmationText;


    public void enterFirstName(String firstname) {
        sendTextToElement(firstName, firstname);
        log.info("Entering First Name: " + firstname + firstName.toString());
    }

    public void enterLastName(String lastname) {
        sendTextToElement(lastName, lastname);
        log.info("Entering Last Name: " + lastname + lastName.toString());
    }

    public void enterPostCode(String postcode) {
        sendTextToElement(postCode, postcode);
        log.info("Entering PostCode: " + postcode + postCode.toString());
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
        log.info("Clicking on Continue Button: " + continueButton.toString());
    }

    public void clickOnFinishButton() {
        clickOnElement(finishButton);
        log.info("Clicking on Finish Button: " + finishButton.toString());
    }

    public String verifyOrderConfirmationText() {
        log.info("Getting text from: " + orderConfirmationText.toString());
        return getTextFromElement(orderConfirmationText);
    }
}
