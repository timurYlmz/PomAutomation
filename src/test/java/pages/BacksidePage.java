package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utilities;

import java.util.List;

public class BacksidePage extends Utilities {

    public BacksidePage() {PageFactory.initElements(browser,this);}

    @FindBy(css = "[class='btn btn-light ']")
    public List<WebElement> menuItems;

    @FindBy(css = "[id='resizableBoxWithRestriction'] [class='react-resizable-handle react-resizable-handle-se']")
    public WebElement handle;

    public void selectItem(String itemTitle){
        for (WebElement item: menuItems) {
            if (item.getText().contains(itemTitle)){
                centerElement(item).click();
                return;
            }
        }
        Assert.fail("No element called "+itemTitle+" was found");
    }

    public void resizeElement(Integer x, Integer y) {
        dragAndDropByOffset(handle, x, y);
    }

}
