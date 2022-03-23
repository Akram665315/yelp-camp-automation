package com.yelp_camp.pages;

import com.yelp_camp.base.PageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.yelp_camp.base.TestBase.driver;

public class HomePage extends PageObjects {
    @FindBy(css = "[class=\"nav nav-masthead justify-content-center float-md-right\"] a:nth-of-type(2)")
    WebElement campgrounds_headerLink;

    @FindBy(css = "[class=\"nav nav-masthead justify-content-center float-md-right\"] a:nth-of-type(3)")
    WebElement login_headLink;

    @FindBy(css = "[href=\"/register\"]")
    WebElement register_headerLink;



    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void openCampgroundsPage() {
        campgrounds_headerLink.click();
        waitInSeconds(1);
    }

    public void openLoginPage(){
        login_headLink.click();
        waitInSeconds(1);
    }

    public void openRegisterPage(){
        register_headerLink.click();
        waitInSeconds(1);
    }


}
