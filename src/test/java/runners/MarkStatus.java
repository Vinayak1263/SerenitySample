package runners;

import lombok.SneakyThrows;
import net.serenitybdd.core.webdriver.RemoteDriver;
import net.serenitybdd.core.webdriver.enhancers.AfterAWebdriverScenario;
import net.thucydides.core.model.TestOutcome;
import net.thucydides.core.model.TestResult;
import net.thucydides.core.util.EnvironmentVariables;
import org.apache.hc.client5.http.classic.methods.HttpPut;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.http.client.methods.HttpUriRequest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

public class MarkStatus  {
//implements AfterAWebdriverScenario
//    @SneakyThrows
//    @Override
//    public void apply(EnvironmentVariables environmentVariables, TestOutcome testOutcome, WebDriver webDriver) {
//
////        if(testOutcome.isUnsuccessful() && testOutcome.isFailure()){
////
////        }
////        if (testOutcome.isSuccess()){
////            System.out.println("pass");
////            markStatus(webDriver,"passed","passed");
////        }else{
////            System.out.println("fail");
////            JavascriptExecutor jse = (JavascriptExecutor)webDriver;
////            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"failed\", \"reason\": \"failure\"}}");
////        }
//
//        JavascriptExecutor jse = (JavascriptExecutor)webDriver;
//        if(testOutcome.isSuccess()) {
//            //System.out.println("Session:"+((RemoteWebDriver)webDriver).getSessionId());
//            System.out.println("Title:"+webDriver.getTitle());
//            System.out.println("inside if loop - pass");
//            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"passed test\"}}");
//        }
//        if(testOutcome.isError()) {
//            System.out.println("id:"+testOutcome.getDriver());
//            //System.out.println("Session:"+((RemoteWebDriver)webDriver).getSessionId());
//            System.out.println("Title:"+webDriver.getTitle());
//
//            System.out.println("inside else loop - fail");
//            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"passed test\"}}");
//        }
//
//        Thread.sleep(5000);
//    }

//    public void markStatus(WebDriver driver, String status, String reason) {
//
//        //System.out.println("Sesssion:"+((RemoteWebDriver)driver).getSessionId());
//        System.out.println(status+" "+reason);
//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \""+status+"\", \"reason\": \""+reason+"\"}}");
////        //jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"failed\", \"reason\": \"failure\"}}");
////        SessionId sessionId = ((RemoteWebDriver)driver).getSessionId();
////        try{
////            URI uri = new URI("https://nithyamani3:PsurqC6o6MphBNxyphUy@api.browserstack.com/automate/sessions/"+sessionId+".json");
////            HttpPut putRequest = new HttpPut(uri);
////
////            ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
////            nameValuePairs.add((new BasicNameValuePair("status", status)));
////            nameValuePairs.add((new BasicNameValuePair("reason", reason)));
////            putRequest.setEntity((HttpEntity) new UrlEncodedFormEntity(nameValuePairs));
////
////            HttpClientBuilder.create().build().execute((HttpUriRequest) putRequest);
////        }catch (Exception e){
////            System.out.println(e);
////        }
//    }
    @SneakyThrows
    public void mark(){
        System.out.println("ih");
    }
}
