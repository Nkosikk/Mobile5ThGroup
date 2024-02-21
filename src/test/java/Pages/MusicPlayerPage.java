package Pages;

import Utils.AndroidUtils;
import Utils.AppiumDriverFactory;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MusicPlayerPage {

    AppiumDriver driver;
    AndroidUtils androidUtils;
    AppiumDriverFactory appiumDriverFactory = AppiumDriverFactory.getInstanceOfAppiumDriverFactory();

    private static By apiDemosTitle = By.xpath("");

    public MusicPlayerPage() {
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void verifyAppIsLaunched() {
        if (androidUtils.objectExist(apiDemosTitle)) {
            Assert.assertTrue(true, "Landing page is displayed");
        } else {
            Assert.assertTrue(false, "Landing page was not displayed");
        }
    }

    public void clickWakeUp() {
        androidUtils.clickButton(change this);
    }

}
