package testdetective.factorypattern.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "email")
    private WebElement userEmailLoginInput;

    @FindBy(id = "pass")
    private WebElement userPasswordLoginInput;

    @FindBy(id = "u_0_n")
    private WebElement loginSubmitBtn;

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        driver.get("http://facebook.com");
        PageFactory.initElements(driver, this);
    }

    public LoginPage enterUserLogin(String login) {
        userEmailLoginInput.click();
        userEmailLoginInput.sendKeys(login);
        return this;
    }

    public LoginPage enterUserPassword(String password) {
        userPasswordLoginInput.click();
        userPasswordLoginInput.sendKeys(password);
        return this;
    }

    public HomePage submitLoginCredentials() {
        loginSubmitBtn.click();
        return new HomePage(driver);
    }
}
