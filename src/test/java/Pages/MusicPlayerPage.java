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

    private static By musicpTitle = By.xpath("//android.widget.TextView[@text=\"UAMP\"]");
    private static By wakeupAlbum = By.xpath("//android.widget.TextView[@resource-id=\"com.example.android.uamp.next:id/title\" and @text=\"Wake Up\"]");
    private static By songGeisha = By.xpath("//android.widget.TextView[@resource-id=\"com.example.android.uamp.next:id/title\" and @text=\"Geisha\"]");

    public MusicPlayerPage() {
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void verifyAppIsLaunched() {
        if (androidUtils.objectExist(musicpTitle)) {
            Assert.assertTrue(true, "Landing page is displayed");
        } else {
            Assert.assertTrue(false, "Landing page was not displayed");
        }
    }

    public void clickWakeUp() {

        androidUtils.clickButton(wakeupAlbum);
    }
    public void playGuisha() {

        androidUtils.clickButton(songGeisha);
    }
}
