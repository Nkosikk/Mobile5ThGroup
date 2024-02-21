package Pages;

import Utils.AndroidUtils;
import Utils.AppiumDriverFactory;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class APIDemosPage {

    AppiumDriver driver;
    AndroidUtils androidUtils;
    AppiumDriverFactory appiumDriverFactory = AppiumDriverFactory.getInstanceOfAppiumDriverFactory();

    private static By apiDemosTitle = By.xpath("//android.widget.TextView[contains(@text, 'API Demos')]");
    private static By appBTN = By.xpath("//android.widget.TextView[@content-desc=\"App\"]");
    private static By alarmApp = By.xpath("//android.widget.TextView[@content-desc=\"Alarm\"]");
    private static By alarmControllerMenu = By.xpath("//android.widget.TextView[@content-desc=\"Alarm Controller\"]");
    private static By oneShotAlarmButton = By.id("io.appium.android.apis:id/one_shot");

    public APIDemosPage() {
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void verifyLandingPage() {
        if (androidUtils.objectExist(apiDemosTitle)) {
            Assert.assertTrue(true, "Landing page is displayed");
        } else {
            Assert.assertTrue(false, "Landing page was not displayed");
        }
    }

    public void clickApp() {
        androidUtils.clickButton(appBTN);
    }

    public void clickAlarm() {
        androidUtils.clickButton(alarmApp);
    }

    public void clickAlarmController() {
        androidUtils.clickButton(alarmControllerMenu);
    }    public void clickOneShotAlarm() {
        androidUtils.clickButton(oneShotAlarmButton);
    }
}
