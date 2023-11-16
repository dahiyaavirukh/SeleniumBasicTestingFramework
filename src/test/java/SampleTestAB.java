package test.java;

import main.java.pageEvents.HomepageAB;
import main.java.pageObjects.HomepageABElements;
import org.testng.annotations.Test;

public class SampleTestAB extends BaseTest{
    @Test
    public void validateCompanyComparison() throws InterruptedException {
        HomepageAB homepageAB = new HomepageAB();
        homepageAB.validateCompanyReviewsWidget();
    }
}
