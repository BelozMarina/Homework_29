package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ElectronicsPageLocators {


    @FindBy(xpath = "//a[text()='Smart Watches']")
    public WebElement smartWatches;

    @FindBy(xpath = "//span[text()='Samsung']")
    public WebElement selectBrandSamsung;

    @FindBy(how= How.LINK_TEXT, using = "Electronics")
    public WebElement electronicsLink1;

}
