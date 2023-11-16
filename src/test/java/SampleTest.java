package test.java;

import main.java.pageEvents.LoginPageEvents;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {

    @Test
    public void validateErrorMsgWhenPasswordIsIncorrect() throws InterruptedException {
        LoginPageEvents loginPageEvents = new LoginPageEvents();
        loginPageEvents.validateIfPasswordIsCorrect();
    }
    @Test
    public void validateErrorMsgWhenRollNoIsIncorrect() throws InterruptedException {
        LoginPageEvents loginPageEvents = new LoginPageEvents();
        loginPageEvents.validateIfRollNoIsCorrect();
    }
    @Test
    public void validateIfUserIsAbleToLogin() throws InterruptedException {
        LoginPageEvents loginPageEvents = new LoginPageEvents();
        loginPageEvents.validateIfLoginIsWorking();
    }
}
