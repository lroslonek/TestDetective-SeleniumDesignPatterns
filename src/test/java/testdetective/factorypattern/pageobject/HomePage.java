package testdetective.factorypattern.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean checkIfLoginSucceed() {
        return driver.getPageSource().contains("fbxWelcomeBoxName");
    }
}
