package steps;

import io.cucumber.java.en.Given;
import pages.HomePage;

public class HomePageSteps {

    HomePage homePage = new HomePage();

    @Given("Click homepage card named {}")
    public void clickCard(String cardName){
        homePage.selectCard(cardName);
    }
}
