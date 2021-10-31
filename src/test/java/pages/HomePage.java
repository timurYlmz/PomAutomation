package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utilities;
import utils.driver.Driver;

import java.util.List;

public class HomePage extends Utilities {

    public HomePage() {
        PageFactory.initElements(browser,this);
    }

    @FindBy(css = "[class=\"category-cards\"] [class*='top-card']")
    public List<WebElement> homePageCards ;

    public void selectCard(String cardTitle){
        for (WebElement card: homePageCards) {
            String homePageCard = card.getText();
            if (homePageCard.contains(cardTitle)){
                card.click();
                return;
            }
        }
        Assert.fail("No element called "+cardTitle+" was found");
    }
}
