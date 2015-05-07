package testdetective.factorypattern.test;

import org.junit.Test;
import testdetective.commons.WebDriverDefault;
import testdetective.factorypattern.pageobject.HomePage;
import testdetective.factorypattern.pageobject.LoginPage;

public class FacebookPOMLoginFailTest extends WebDriverDefault {

    @Test
    public void shouldNotLoginWithIncorrectCreds() {

        LoginPage loginPage = new LoginPage(driver)
            .enterUserLogin("wrong@login.com")
            .enterUserPassword("wrongPassword");

        HomePage homePage = loginPage.submitLoginCredentials();
        assert (!homePage.checkIfLoginSucceed());

    }
}
