package pages.quiz;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SisterFillInformationPage extends FillInformationPage {
    public SisterFillInformationPage(AndroidDriver driver) {
        super(driver);
    }

    public void fillInformation(){
        this._driver.findElement(By.id("com.happyverse.bfftest:id/YourName")).sendKeys("Quang");
        this._driver.findElement(By.id("com.happyverse.bfftest:id/FriendName")).sendKeys("Su");
        this._driver.findElement(By.id("com.happyverse.bfftest:id/BUTTON5")).click();
    }



}
