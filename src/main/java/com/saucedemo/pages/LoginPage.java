package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "user-name")
    WebElement usernameField;

    @CacheLookup
    @FindBy(id = "password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "login-button")
    WebElement loginButton;



    public void enterUsernameField(String name){
        sendTextToElement(usernameField,name);
        log.info("Enter usernameField: " + name + usernameField.toString());
    }

    public void enterPasswordField(String password){
        sendTextToElement(passwordField,password);
        log.info("Enter passwordField: " + password + passwordField.toString());
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
        log.info("Clicking on login button: " + loginButton.toString());
    }
}
