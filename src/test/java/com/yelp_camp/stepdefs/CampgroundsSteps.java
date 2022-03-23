package com.yelp_camp.stepdefs;

import com.yelp_camp.pages.CampgroundsPage;
import com.yelp_camp.pages.HomePage;
import com.yelp_camp.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CampgroundsSteps {

    HomePage homePage = new HomePage();
    CampgroundsPage campgroundsPage = new CampgroundsPage();
    LoginPage loginPage = new LoginPage();

    //Scenario 1

    @Given("user goes to campgrounds page")
    public void userGoesToCampgroundsPage() {
        homePage.openCampgroundsPage();
    }

    @And("user can see all campgrounds are listed")
    public void userCanSeeAllCampgroundsAreListed() {
        String actualText = campgroundsPage.getAllCampGroundsText();
        Assert.assertTrue(actualText.contains("All"));
    }

    //Scenario 2

    @Given("user is logged in")
    public void userIsLoggedIn() {
        homePage.openLoginPage();
        loginPage.loginWithValidAccount("geek", "geek");
    }

    @And("go to campground page")
    public void goToCampgroundPage() {
        loginPage.openNewCampgroundsPage();
    }

    @And("create new campground")
    public void createNewCampground() {
        campgroundsPage.fillOutNewCampgroundFormAndSubmit("BABA TUNDAY'S HotSpot", "Africa", "9999", "Beautiful resort filled with water, yes water can you belive it we got it. ALHUMDULILAH!!!!", "C:/Users/Akram Nuradeen/IdeaProjects/yelpCamp-bdd/src/test/java/com/yelp_camp/liabary/image_holder/istockphoto-1305448689-170667a.jpg");
    }

    @Then("verify a new campground is created")
    public void verifyANewCampgroundIsCreated() {
        String actualText = campgroundsPage.getAllCampGroundsText();
        System.out.println(actualText.contains("Edit"));
    }


}
