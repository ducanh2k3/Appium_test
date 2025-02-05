package pages;

import io.appium.java_client.android.AndroidDriver;

public class BasePage {

    public AndroidDriver _driver;

    public BasePage(AndroidDriver driver){
        this._driver = driver;
    }
}
