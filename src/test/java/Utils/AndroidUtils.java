package Utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AndroidUtils {

    private AppiumDriver driver;

    public AndroidUtils(AppiumDriver driver) {
        this.driver = driver;
    }

    public Boolean objectExist(By by) {
        if (driver.findElements(by).size() == 0) {
            return false;
        } else {
            return true;
        }
    }

    public void clickButton(By by){
        WebElement element=driver.findElement(by);
        if(element.isDisplayed()){
                element.click();
        }


    }

}
