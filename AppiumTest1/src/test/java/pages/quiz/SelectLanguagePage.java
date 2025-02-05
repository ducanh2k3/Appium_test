package pages.quiz;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import pages.BasePage;

public class SelectLanguagePage extends BasePage {

    public SelectLanguagePage(AndroidDriver driver) {
        super(driver);
    }

    // input Language in English
    public void selectLanguage(String language){
        By languageItm = By.xpath(String.format("//*[@text = '%s']", language));
        this._driver.findElement(languageItm).click();
    }
}
