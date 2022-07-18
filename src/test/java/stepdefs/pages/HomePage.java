package stepdefs.pages;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.util.EnvironmentVariables;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//@DefaultUrl("https://bstackdemo.com/")
public class HomePage extends PageObject {

    @FindBy(id = "signin")
    WebElement signinButton;

    public void clickSignin() {

        signinButton.click();

    }
}
