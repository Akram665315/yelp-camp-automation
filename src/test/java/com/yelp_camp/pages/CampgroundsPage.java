package com.yelp_camp.pages;

import com.yelp_camp.base.PageObjects;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.yelp_camp.base.TestBase.driver;

public class CampgroundsPage extends PageObjects{
    @FindBy(css = "body h1")
    WebElement allCampGroundsText;

    @FindBy(id = "title")
    WebElement newTitleTextField;

    @FindBy(id = "location")
    WebElement newLocationTextField;

    @FindBy(id = "price")
    WebElement newPriceTextField;

    @FindBy(id = "description")
    WebElement newDescriptionTextField;

    @FindBy(id = "image")
    WebElement newImageInputField;

    @FindBy(css = "[class=\"btn btn-success\"]")
    WebElement addCampgroundBtn;

    @FindBy(css = "[class=\"alert alert-success alert-dismissible fade show\"]")
    WebElement campgroundAddedConfirmationText;

    @FindBy(css = "[class=\"mapboxgl-canvas-container mapboxgl-interactive mapboxgl-touch-drag-pan mapboxgl-touch-zoom-rotate\"]")
    List<WebElement> mapBoxContainer;

    public CampgroundsPage(){
        PageFactory.initElements(driver,this);
    }

    public String getAllCampGroundsText(){
        return allCampGroundsText.getText();
    }

    public void fillOutNewCampgroundFormAndSubmit(String title,String location,String price,String description,String image){
        newTitleTextField.sendKeys(title);
        newLocationTextField.sendKeys(location);
        newPriceTextField.sendKeys(price);
        newDescriptionTextField.sendKeys(description);
        newImageInputField.sendKeys(image);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)","");
        waitInSeconds(1);
        addCampgroundBtn.click();
        waitInSeconds(1);
    }

    public String getConfirmationText(){
        return campgroundAddedConfirmationText.getText();
    }

    public int getMapBox(){
    return mapBoxContainer.size();
    }

}
