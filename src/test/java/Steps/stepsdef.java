package Steps;

import io.cucumber.java.en.*;

public class stepsdef extends Base{
    @Given("The app is launched")
    public void the_app_is_launched() {

    }
    @And("User verify that the landing is displayed")
    public void user_verify_that_the_landing_is_displayed() {
        apiDemosPage.verifyLandingPage();
    }
    @And("User click App")
    public void userClickApp() {
    }
}
