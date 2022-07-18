package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import stepdefs.steps.UserSteps;

public class SigninUsersStepDefinition {
    @Steps
    UserSteps user;
    @Given("I click on signin button")
    public void iClickOnSigninButton() {
        user.opensBstackDemoPage();
        user.clicksOnSignInButton();
    }

    @When("I enter \"(.+)\" and \"(.+)\"$")
    public void iEnterUsernameAndPassword(String username, String password) {
        user.entersCredentials(username, password);
    }

    @Then("I should see {string} as the user")
    public void iShouldSeeUsernameAsTheUser(String username) {
        user.validatesDetails(username);
    }

    @And("I logout")
    public void iLogout() {
        user.logsOut();
    }
//
//    @After
//    public void tidyUp(){
//        JavascriptExecutor jse = (JavascriptExecutor)webDriver;
//        if(testOutcome.isSuccess()) {
//            System.out.println("Session:"+((RemoteWebDriver)webDriver).getSessionId());
//            System.out.println("inside if loop - pass");
//            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"passed test\"}}");
//        }
//        else {
//            System.out.println("Session:"+((RemoteWebDriver)webDriver).getSessionId());
//            System.out.println("inside else loop - fail");
//            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"passed test\"}}");
//        }
//        Thread.sleep(5000);
//    }
}
