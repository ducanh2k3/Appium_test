package pages.api_demo;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import pages.BasePage;

public class ListViewPage extends BasePage {

    public ListViewPage(AndroidDriver driver) {
        super(driver);
    }

    public void closeReleasePopup(){
        this._driver.findElement(By.id("com.touchboarder.android.api.demos:id/buttonDefaultPositive")).click();
    }
    public void selectItemByText(String itemText){
        String itemXpath = String.format("//*[@text = '%s']", itemText);
        this._driver.findElement(By.xpath(itemXpath)).click();
    }
}
