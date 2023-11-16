package main.java.pageEvents;

import main.java.pageObjects.LoginPageElements;
import main.java.utils.Constants;
import main.java.utils.Generic;
import org.testng.Assert;

public class LoginPageEvents {

    public void enterRollNo(String rollNo){
        Generic generic = new Generic();
        generic.getWebElement("XPATH",LoginPageElements.rollNO).sendKeys(rollNo);
    }
    public void enterPassword(String password){
        Generic generic = new Generic();
        generic.getWebElement("XPATH",LoginPageElements.password).sendKeys(password);
    }
    public void clickOnSubmitButton(){
        Generic generic = new Generic();
        generic.getWebElement("XPATH",LoginPageElements.submitBtn).click();
    }


    public void validateIfPasswordIsCorrect() throws InterruptedException {
        Generic generic = new Generic();
        String condition = "Invalid Password";
        enterRollNo("181462");
        Thread.sleep(2000);
        enterPassword(Constants.pass);
        Thread.sleep(2000);
        clickOnSubmitButton();
        String check = generic.getWebElement("XPATH",LoginPageElements.invalidPassword).getText();
        System.out.println("Condition : "+condition+" Check : "+check);
        Assert.assertTrue(check.contains(condition));
    }
    public void validateIfRollNoIsCorrect() throws InterruptedException {
        Generic generic = new Generic();
        String condition = "Wrong Member Type or Code";
        enterRollNo("avirukh");
        Thread.sleep(2000);
        enterPassword(Constants.pass);
        Thread.sleep(2000);
        clickOnSubmitButton();
        String check = generic.getWebElement("XPATH",LoginPageElements.invalidRollNoOrPassword).getText();
        System.out.println("Condition : "+condition+" Check : "+check);
        Assert.assertTrue(check.contains(condition));
    }

    public void validateIfLoginIsWorking() throws InterruptedException {
        Generic generic = new Generic();
        enterRollNo("181462");
        Thread.sleep(2000);
        enterPassword(Constants.password);
        Thread.sleep(2000);
        clickOnSubmitButton();
        Thread.sleep(2000);
        Assert.assertTrue(generic.isVisibleUsingExplicitWait(LoginPageElements.logoutBtn));
        System.out.println(generic.getWebElement("XPATH",LoginPageElements.logoutBtn).getText());
    }
}
