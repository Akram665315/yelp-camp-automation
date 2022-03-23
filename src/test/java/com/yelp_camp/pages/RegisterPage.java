package com.yelp_camp.pages;

import com.yelp_camp.base.PageObjects;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.yelp_camp.base.TestBase.driver;

public class RegisterPage extends PageObjects {
    @FindBy(id = "username")
    WebElement username_textField;

    @FindBy(id = "email")
    WebElement email_textField;

    @FindBy(id = "password")
    WebElement password_textField;

    @FindBy(css = "[class=\"btn btn-success\"]")
    WebElement registerBtn;

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    public void fillOutRegisterFormAndSubmit(String username, String email, String password) {
        username_textField.sendKeys(username);
        email_textField.sendKeys(email);
        password_textField.sendKeys(password);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
        waitInSeconds(1);
        registerBtn.click();
        waitInSeconds(1);
    }
}
