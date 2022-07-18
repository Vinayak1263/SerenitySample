package stepdefs.pages;

import static org.junit.Assert.*;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import runners.Mark;


public class LoggedInPage extends PageObject {
    @FindBy(css = ".username")
    WebElement getUsername;

    @FindBy(id = "logout")
    WebElement logoutButton;
    public void validateUser(String username) {
        Mark mark = new Mark();
        mark.markStatus(getDriver(),"passed","passing 2");
        //mark.markStatus(getDriver(),"passed","passed");
        assertEquals(getUsername.getText(),username);
    }

    public void clickOnLogoutButton() {
        logoutButton.click();
    }
}
