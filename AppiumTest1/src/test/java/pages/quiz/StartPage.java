package pages.quiz;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import pages.BasePage;

public class StartPage extends BasePage {

    public StartPage(AndroidDriver driver) {
        super(driver);
    }

    private By startBtn = By.xpath("//*[contains(@resource-id, 'BUTTON5')]");

    public void startApp(){
        this._driver.findElement(startBtn).click();
    }
}
