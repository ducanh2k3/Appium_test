package test.android.quiz;

import org.testng.annotations.Test;
import pages.quiz.*;
import test.TestBase;

public class QuizTest extends TestBase {

    @Test
    public void brokenHeartTest() throws Exception {
        StartPage startPage = new StartPage(_driver);
        startPage.startApp();

        SelectLanguagePage selectLanguagePage = new SelectLanguagePage(_driver);
        selectLanguagePage.selectLanguage("Vietnamese");

        LandingPage landingPage = new LandingPage(_driver);
        landingPage.selectQuizTest("Sister Test");

        SisterFillInformationPage sisterFillInformationPage = new SisterFillInformationPage(_driver);
        sisterFillInformationPage.fillInformation();

        QuestionPage questionPage = new QuestionPage(_driver);
        questionPage.completeTest(10, 2);

    }
}
