package steps;

import io.cucumber.java.en.Given;
import pages.BacksidePage;

public class BacksidePageSteps {

     BacksidePage backsidePage = new BacksidePage();

    @Given("Click side menu item named {}")
    public void clickCard(String cardName){
        backsidePage.selectItem(cardName);
    }

    @Given("Resize box to x:{} and y:{}")
    public void dragAndDropByCoordinates(Integer x, Integer y){
        backsidePage.resizeElement(x, y);
    }
}
