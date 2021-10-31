package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import utils.Utilities;

public class CommonSteps extends Utilities {

    @Before
    public void startBrowser(){init();}

    @After
    public void killBrowser(){terminate();}

    @Given("Navigate to {}")
    public void navigate(String url){browser.get("https://"+url);}

    @And("Wait {} seconds")
    public void waitFor(Long duration) throws InterruptedException {Thread.sleep(duration*1000);}
}
