package com.yelp_camp.stepdefs;

import com.yelp_camp.pages.CampgroundsPage;
import io.cucumber.java.en.And;
import org.openqa.selenium.Dimension;
import org.testng.Assert;

public class MapBoxStep {

    CampgroundsPage campgroundsPage = new CampgroundsPage();

    @And("user can see the mapbox for all campgrounds")
    public void userCanSeeTheMapboxForAllCampgrounds() {
        int size = campgroundsPage.getMapBox();
        Assert.assertEquals(size,1);
    }
}
