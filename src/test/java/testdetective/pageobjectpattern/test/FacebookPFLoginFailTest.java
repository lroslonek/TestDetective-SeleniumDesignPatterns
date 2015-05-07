package testdetective.pageobjectpattern.test;

import org.junit.Test;
import testdetective.commons.WebDriverDefault;
import testdetective.pageobjectpattern.pageobject.HomePage;
import testdetective.pageobjectpattern.pageobject.LoginPage;

public class FacebookPFLoginFailTest extends WebDriverDefault {

    @Test
    public void shouldNotLoginWithIncorrectCreds() {

        LoginPage loginPage = new LoginPage(driver)
            .enterUserLogin("wrong@login.com")
            .enterUserPassword("wrongPassword");

        HomePage homePage = loginPage.submitLoginCredentials();
        assert (!homePage.checkIfLoginSucceed());

    }

}
