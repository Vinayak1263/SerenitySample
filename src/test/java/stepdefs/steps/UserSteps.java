package stepdefs.steps;

import stepdefs.pages.HomePage;
import stepdefs.pages.LoggedInPage;
import stepdefs.pages.SiginPage;

public class UserSteps {
    HomePage homePage;
    SiginPage siginPage;
    LoggedInPage loggedInPage;
    public void opensBstackDemoPage() {
        homePage.open();
    }

    public void clicksOnSignInButton() {
        homePage.clickSignin();
    }

    public void entersCredentials(String username, String password) {

        siginPage.sendCredentials(username,password);
        siginPage.clickLoginButton();
    }

    public void validatesDetails(String username) {
        loggedInPage.validateUser(username);
    }

    public void logsOut() {
        loggedInPage.clickOnLogoutButton();
    }
}
