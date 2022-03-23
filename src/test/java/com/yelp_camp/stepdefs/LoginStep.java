package com.yelp_camp.stepdefs;

import com.yelp_camp.pages.HomePage;
import com.yelp_camp.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginStep {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Given("user has a valid user account")
    public void userHasAValidUserAccount() {
        homePage.openLoginPage();
    }

    @When("he enters valid account")
    public void heEntersValidAccount() {
        loginPage.loginWithValidAccount("geek", "geek");
    }

    @Then("verify user is logged in")
    public void verifyUserIsLoggedIn() {
        String actualText = loginPage.getLogoutText();
        Assert.assertTrue(actualText.contains("Logout"));
    }
}
