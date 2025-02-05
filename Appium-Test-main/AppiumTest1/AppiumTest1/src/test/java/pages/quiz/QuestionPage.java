package pages.quiz;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import pages.BasePage;

public class QuestionPage extends BasePage {

    public QuestionPage(AndroidDriver driver) {
        super(driver);
    }

    public void completeTest(int numberOfQuestion, int indexOfAnswerForAllQuestion) throws Exception {
        String suffix = "";
        if ( 0 < indexOfAnswerForAllQuestion && indexOfAnswerForAllQuestion < 3){
            suffix = String.valueOf(indexOfAnswerForAllQuestion + 1);
        } else if (indexOfAnswerForAllQuestion >= 3) {
            throw new Exception("index out of range");
        }

        By answer = By.id(String.format("com.happyverse.bfftest:id/OPTIONS%s", suffix));
        for(int i = 0; i < numberOfQuestion; i++){
            this._driver.findElement(answer).click();
        }
    }
}

