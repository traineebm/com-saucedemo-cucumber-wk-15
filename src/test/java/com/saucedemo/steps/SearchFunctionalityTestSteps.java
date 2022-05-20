package com.saucedemo.steps;

import com.saucedemo.pages.CheckOutPage;
import com.saucedemo.pages.InventoryPage;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SearchFunctionalityTestSteps {

    @Given("^I am on saucedemo page$")
    public void iAmOnSaucedemoPage() {
    }

    @When("^I login with credential username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginWithCredentialUsernameAndPassword(String name, String password) {
       new LoginPage().enterUsernameField(name);
       new LoginPage().enterPasswordField(password);
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @And("^I filter the products by Price \"([^\"]*)\"$")
    public void iFilterTheProductsByPrice(String price) {
        new InventoryPage().selectSortByPriceHighToLow(price);
    }

    @And("^I select cheapest & costliest products and add to basket$")
    public void iSelectCheapestCostliestProductsAndAddToBasket() {
        new InventoryPage().addCheapestProductToCart();
        new InventoryPage().addCostliestProductToCart();
    }

    @And("^I open shopping cart$")
    public void iOpenShoppingCart() {
        new InventoryPage().setViewShoppingCart();
    }

    @And("^I go to checkout$")
    public void iGoToCheckout() {
        new ShoppingCartPage().clickOnCheckOutButton();
    }


    @And("^I enter details first name \"([^\"]*)\", last name \"([^\"]*)\" and zipPostalCode \"([^\"]*)\"$")
    public void iEnterDetailsFirstNameLastNameAndZipPostalCode(String firstname, String lastname, String postcode) {
        new CheckOutPage().enterFirstName(firstname);
        new CheckOutPage().enterLastName(lastname);
        new CheckOutPage().enterPostCode(postcode);
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new CheckOutPage().clickOnContinueButton();
    }

    @And("^I click on finish button$")
    public void iClickOnFinishButton() {
        new CheckOutPage().clickOnFinishButton();
    }


    @Then("^I should be able to see message 'THANK YOU FOR YOUR ORDER'$")
    public void iShouldBeAbleToSeeMessageTHANKYOUFORYOURORDER() {
        Assert.assertEquals("Order confirmation failed", "THANK YOU FOR YOUR ORDER",new CheckOutPage().verifyOrderConfirmationText());
    }
}
