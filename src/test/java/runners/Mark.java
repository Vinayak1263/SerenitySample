package runners;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Mark {
    public void markStatus(WebDriver webDriver, String status, String reason){
        
        JavascriptExecutor jse = (JavascriptExecutor)webDriver;
        jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \""+status+"\", \"reason\": \""+reason+"\"}}");
    }
}
