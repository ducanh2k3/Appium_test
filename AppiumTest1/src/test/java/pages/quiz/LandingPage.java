package pages.quiz;

import helper.Utilities;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import pages.BasePage;

import java.io.IOException;

public class LandingPage extends BasePage {

    public LandingPage(AndroidDriver driver) {
        super(driver);
    }

    By quizTestList = By.id("com.happyverse.bfftest:id/IMAGE_VIEW13");
    public void selectQuizTest(String englishQuizTestName) throws IOException {
        String propertyName = englishQuizTestName.replace(" ", "");
        String index = Utilities.getValue("quiz_categories.properties", propertyName);

        this._driver.findElements(quizTestList).get(Integer.parseInt(index)).click();
    }
}
