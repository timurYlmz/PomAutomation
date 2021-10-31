package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.driver.Driver;

public abstract class Utilities extends Driver {

    //This method scrolls an element to the center of the view
    public WebElement centerElement(WebElement element){

        String scrollScript = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/2));";

        ((JavascriptExecutor) browser).executeScript(scrollScript, element);

        waitFor(0.5);

        return element;
    }

    public void waitFor(Double duration) {
        try {Thread.sleep((long) (duration*1000));}
        catch (InterruptedException ignored){}
    }
    public void dragAndDropByOffset(WebElement element, Integer xOffset, Integer yOffset){
        Actions action = new Actions(browser);
        action
                .moveToElement(element,0,0)
                .clickAndHold(element)
                .moveToElement(element, xOffset,yOffset)
                .release()
                .build()
                .perform();
        waitFor(0.5);
    }
}
