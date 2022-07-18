package runners;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class Temp {
    WebDriver driver;
    @Before
    public void setup() throws IOException, ParseException {
//        String env = System.getenv("TEST_ENV");
//        JSONParser jsonParser = new JSONParser();
//        JSONObject config = (JSONObject) jsonParser.parse(new FileReader("src/test/resources/caps.json"));
//        JSONObject profile = null, common_caps = null, platform = null;
//        profile = (JSONObject) config.get(env);
//        common_caps = (JSONObject) profile.get("common_caps");
//        platform = (JSONObject) profile.get("platform");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        driver = new RemoteWebDriver(new URL("https://nithyamani3:PsurqC6o6MphBNxyphUy@hub-cloud.browserstack.com/wd/hub"),capabilities);

    }
    @After
    public void teardown(){
        driver.quit();
    }
}
