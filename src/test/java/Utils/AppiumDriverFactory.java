package Utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumDriverFactory {
    public static AppiumDriver driver;
    public static AppiumDriverFactory instanceOfAppiumDriverFactory;

    public AppiumDriverFactory() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("app", System.getProperty("user.dir") + "/src/main/Apps/app-debug.apk");
        capabilities.setCapability("autoAcceptAlerts",true);

        try{
            driver= new AndroidDriver(new URL("http://127.0.0.1:4723"),capabilities);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public static AppiumDriverFactory getInstanceOfAppiumDriverFactory(){
        if (instanceOfAppiumDriverFactory==null)
            instanceOfAppiumDriverFactory= new AppiumDriverFactory();
        return instanceOfAppiumDriverFactory;
    }

    public AppiumDriver getDriver(){
        return driver;
    }
}
