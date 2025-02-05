package test.android.api_demo;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.api_demo.ListViewPage;
import test.TestBase;

import java.time.Duration;

public class ApiDemoTest extends TestBase {
    @Test(priority = 0)
    public void TestCase1(){
        ListViewPage listViewPage = new ListViewPage(this._driver);
        listViewPage.closeReleasePopup();
        listViewPage.selectItemByText("Support v13 Demos");
        listViewPage.selectItemByText("Fragment");
        listViewPage.selectItemByText("Pager");
        Dimension size = _driver.manage().window().getSize();
        int startx = (int) (size.width * 0.9);
        int endx = (int) (size.width * 0.1);
        int starty = size.height / 2;
        TouchAction action = new TouchAction(_driver);
        for (int i = 0; i < 6; i++) {
            action.press(PointOption.point(startx, starty))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                    .moveTo(PointOption.point(endx, starty))
                    .release()
                    .perform();
        }
        String text = _driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.touchboarder.android.api.demos:id/text']")).getText();
        System.out.print(text);
        assert text.equals("Fragment #6");
    }

    @Test(priority = 1)
    public void TestCase2() {
        ListViewPage listViewPage = new ListViewPage(this._driver);
        listViewPage.closeReleasePopup();
        listViewPage.selectItemByText("Support v13 Demos");
        listViewPage.selectItemByText("Fragment");
        listViewPage.selectItemByText("Pager");

        // Wait for the button to be clickable
        WebDriverWait wait = new WebDriverWait(_driver, Duration.ofSeconds(10));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@resource-id='com.touchboarder.android.api.demos:id/goto_last']")));
        button.click();

        // Wait for the text element to be visible
        WebElement textElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@resource-id='com.touchboarder.android.api.demos:id/text']")));
        String text = textElement.getText();
        System.out.print(text);

        // Assert the text value
        assert text.equals("Fragment #9");

        // Perform swipe action
        Dimension size = _driver.manage().window().getSize();
        int startx = (int) (size.width * 0.1);
        int endx = (int) (size.width * 0.9);
        int starty = size.height / 2;
        TouchAction action = new TouchAction(_driver);
        for (int i = 0; i < 6; i++) {
            action.press(PointOption.point(startx, starty))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                    .moveTo(PointOption.point(endx, starty))
                    .release()
                    .perform();
        }
        WebElement textElement2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@resource-id='com.touchboarder.android.api.demos:id/text']")));
      String  text2 = textElement2.getText();
        System.out.println(text2);
        assert text2.equals("Fragment #3");
    }

}
