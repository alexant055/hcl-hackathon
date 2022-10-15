package org.hackathon.pages;

import org.hackathon.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.hackathon.base.Base.driver;

public class HomePage {

    @FindBy(id = "menu-top-navigation")
    private WebElement menuNavigation;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public WebElement getMenu(String menuHeading) {
       return menuNavigation.findElements(By.tagName("li")).stream()
               .filter(element -> element.getText().equals(menuHeading)).findFirst().get();
    }

    public void mouseOver(String menu) {
        Base.actions.moveToElement(getMenu(menu)).perform();
    }
}
