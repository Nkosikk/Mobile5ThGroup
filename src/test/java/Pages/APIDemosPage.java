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

    public APIDemosPage() {
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void verifyLandingPage() {
        if (androidUtils.objectExist(apiDemosTitle)){
            Assert.assertTrue(true,"Landing page is displayed");
        }else {
            Assert.assertTrue(false,"Landing page was not displayed");
        }

    }
    public void clickApp(){
        androidUtils.clickButton(appBTN);
    }

}
