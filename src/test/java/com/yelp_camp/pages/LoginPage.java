package com.yelp_camp.pages;

import com.yelp_camp.base.PageObjects;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.yelp_camp.base.TestBase.driver;

public class LoginPage extends PageObjects {

    @FindBy(id = "username")
    WebElement username_textField;

    @FindBy(id = "password")
    WebElement password_textField;

    @FindBy(css = ".d-grid.gap-2")
    WebElement loginBtn;

    @FindBy(css = "[href=\"/campgrounds/new\"]")
    WebElement newCampgrounds_headerLink;

    @FindBy(css = "[href=\"/logout\"]")
    WebElement logoutHeaderLink;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void loginWithValidAccount(String username, String password) {
        username_textField.sendKeys(username);
        password_textField.sendKeys(password);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)","");
        waitInSeconds(2);
        loginBtn.click();
        waitInSeconds(1);
    }

    public void openNewCampgroundsPage() {
        newCampgrounds_headerLink.click();
        waitInSeconds(1);
    }

    public String getLogoutText(){
        return logoutHeaderLink.getText();
    }


}
