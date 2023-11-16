package main.java.pageEvents;

import main.java.pageObjects.HomepageABElements;
import main.java.utils.Generic;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import test.java.BaseTest;

import java.util.List;
import java.util.Locale;

public class HomepageAB {
    Generic generic = new Generic();
    public void validateCompanyReviewsWidget() throws InterruptedException {
        for(int i=1;i<=HomepageABElements.sliderMaxCount;i++)
        {
            generic.isVisibleUsingExplicitWait(HomepageABElements.companyReviewsUserProfile+"["+i+"]");
            String condition = generic.getWebElement("XPATH",HomepageABElements.companyReviewsUserProfile+"["+i+"]").getText();
            System.out.println("Condition : "+condition);
            generic.getWebElement("XPATH",HomepageABElements.companyReviewsUserProfile+"["+i+"]").click();
            Thread.sleep(2000);
            generic.isVisibleUsingExplicitWait(HomepageABElements.companyReviewsDesignationCheck);
            String check = generic.getWebElement("XPATH",HomepageABElements.companyReviewsDesignationCheck).getText();
            System.out.println("Check :"+check);
            condition = condition.toLowerCase();
            check = check.toLowerCase();
            Assert.assertTrue(check.contains(condition));
            BaseTest.driver.navigate().back();
            Thread.sleep(2000);
            int run = (i-1)/2;
            if(i == HomepageABElements.sliderMaxCount-1){
                run = (i-1) / 2;
            }
            while (true){
                if(run == 0)
                    break;
                else if(i==10)
                    break;
                else{
                    generic.getWebElement("XPATH",HomepageABElements.sliderBtn).click();
                    Thread.sleep(2000);
                    run--;
                }
            }
        }
    }
}
