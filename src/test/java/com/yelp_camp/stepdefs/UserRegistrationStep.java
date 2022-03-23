package com.yelp_camp.stepdefs;

import com.yelp_camp.pages.CampgroundsPage;
import com.yelp_camp.pages.HomePage;
import com.yelp_camp.pages.LoginPage;
import com.yelp_camp.pages.RegisterPage;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.logging.Log;
import org.testng.Assert;

public class UserRegistrationStep {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();

    @Given("user is on registration page")
    public void userIsOnRegistrationPage() {
        homePage.openRegisterPage();
    }

    @When("user registers with valid data")
    public void userRegistersWithValidData() {
    registerPage.fillOutRegisterFormAndSubmit("Akram","random@email.com","hello123");
    }

    @Then("his account is created successfully")
    public void hisAccountIsCreatedSuccessfully() {
        String actualText = loginPage.getLogoutText();
        Assert.assertTrue(actualText.contains("Logout"));
    }
}
