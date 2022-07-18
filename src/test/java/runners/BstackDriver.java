package runners;

import freemarker.core.Environment;
import io.cucumber.java.Before;
import lombok.SneakyThrows;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.core.webdriver.enhancers.BeforeAWebdriverScenario;
import net.thucydides.core.model.TestOutcome;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import net.thucydides.core.webdriver.DriverSource;
import net.thucydides.core.webdriver.SupportedWebDriver;
import org.json.simple.parser.JSONParser;
import org.junit.runner.RunWith;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.json.simple.JSONObject;

import java.io.FileReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class BstackDriver implements DriverSource {
    EnvironmentVariables conf;
    DesiredCapabilities caps;
    WebDriver driver;
    public String username, accesskey;

    @SneakyThrows
    @Override
    public WebDriver newDriver() {
        EnvironmentVariables properties = SystemEnvironmentVariables.createEnvironmentVariables();
        String server = properties.getProperty("browserstack.url");
        username = System.getenv("BROWSERSTACK_USERNAME");
        if(username == null){
            username = properties.getProperty("browserstack.username");
        }
        accesskey = System.getenv("BROWSERSTACK_ACCESS_KEY");
        if(accesskey == null){
            accesskey = properties.getProperty("browserstack.accesskey");
        }
        caps = new DesiredCapabilities();
        //String config = System.getProperty("config");

        /*JSONParser parser = new JSONParser();
        JSONObject platformConfig = (JSONObject) parser.parse(new FileReader("src/test/resources/caps.json"));
        caps = new DesiredCapabilities();

        JSONObject profile = (JSONObject) platformConfig.get(config);
        Map<String,String> common_caps = (Map<String, String>) profile.get("common_caps");

        Iterator commonCapsIterator = common_caps.entrySet().iterator();
        while (commonCapsIterator.hasNext())
        {
            Map.Entry pair = (Map.Entry) commonCapsIterator.next();
            caps.setCapability((String) pair.getKey(),pair.getValue());
        }

        JSONObject platform = (JSONObject) profile.get("platform");
        Iterator platformIterator = platform.keySet().iterator();
        while (platformIterator.hasNext()){
            String currentPlatform = (String) platformIterator.next();
            Map<String,String> currentPlatformConfig = (Map<String, String>) platform.get(currentPlatform);
            Iterator i = currentPlatformConfig.entrySet().iterator();
            while (i.hasNext())
            {
                Map.Entry<String, String> pair = (Map.Entry<String, String>) i.next();
                caps.setCapability(pair.getKey(),pair.getValue());
            }

        }*/
//        Iterator environments = properties.getKeys().iterator();
//        while (environments.hasNext()){
//            String key = (String) environments.next();
//            String parseEnvConfig = "environment."+config;
//            if(key.contains(parseEnvConfig)){
//                String[] capKey = key.split("\\.", 3);
//                caps.setCapability(capKey[2],properties.getProperty(key));
//            }
//        }
        caps.setCapability("build","serenity-status");
        caps.setCapability("name","test");
        try{
            driver = new RemoteWebDriver(new URL("https://"+username+":"+accesskey+"@"+server),caps);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return driver;
    }
    @Override
    public boolean takesScreenshots() {
        return false;
    }
}
