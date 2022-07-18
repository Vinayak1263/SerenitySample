package stepdefs.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SiginPage extends PageObject {
    @FindBy(css = "#username input")
    WebElement usernameField;

    @FindBy(css = "#password input")
    WebElement passwordField;

    @FindBy(id = "login-btn")
    WebElement loginButton;

    public void sendCredentials(String username, String password) {
        usernameField.sendKeys(username, Keys.ENTER);
        passwordField.sendKeys(password, Keys.ENTER);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
