package Pages;

import Utils.AndroidUtils;
import Utils.AppiumDriverFactory;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MusicPlayerPage {

    AppiumDriver driver;
    AndroidUtils androidUtils;
    AppiumDriverFactory appiumDriverFactory = AppiumDriverFactory.getInstanceOfAppiumDriverFactory();

    private static By uAmpPopup = By.id("android:id/button1");
    private static By uAmpTitle = By.xpath("//android.widget.TextView[@text=\"UAMP\"]");
    private static By musicAlbum = By.xpath("//android.widget.TextView[@resource-id=" +
            "\"com.example.android.uamp.next:id/title\" and @text=\"Wake Up\"]");
    private static By musicTrack = By.xpath("(//android.widget.TextView[@resource-id=" +
            "\"com.example.android.uamp.next:id/subtitle\"])[2]");

    public MusicPlayerPage() {
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void closePopup() {
        androidUtils.clickButton(uAmpPopup);
    }

    public void verifyAppIsLaunched() {
        if (androidUtils.objectExist(uAmpTitle)) {
            Assert.assertTrue(true, "App is launched");
        } else {
            Assert.assertTrue(false, "App was not launched");
        }
    }

    public void clickWakeUp() {
        androidUtils.clickButton(musicAlbum);

    }

    public void clickGuisha() {
        androidUtils.clickButton(musicTrack);
    }

}
