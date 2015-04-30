package testdetective.pageobjectpattern.pageobject;

import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean checkIfLoginSucceed() {
        return driver.getPageSource().contains("fbxWelcomeBoxName");
    }
}
