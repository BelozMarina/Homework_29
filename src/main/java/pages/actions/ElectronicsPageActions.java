package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.locators.ElectronicsPageLocators;
import utils.SeleniumDriver;

public class ElectronicsPageActions {
    ElectronicsPageLocators electronicsPageLocators = null;
    public ElectronicsPageActions(){
        this.electronicsPageLocators = new ElectronicsPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), electronicsPageLocators);
    }


    public void clickOnSmartWatchesItem(){
        Actions action = new Actions(SeleniumDriver.getDriver());
        action.moveToElement(electronicsPageLocators.electronicsLink1).perform();
        electronicsPageLocators.smartWatches.click();
    }

    public void selectBrandSamsung(){
        electronicsPageLocators.selectBrandSamsung.click();
    }

}
