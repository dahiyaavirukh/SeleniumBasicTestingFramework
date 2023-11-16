package main.java.pageObjects;

public interface HomepageABElements {
    String companyReviewsUserProfile = "((//div[@class='home_reviews'])[1]//div[@class='user_profile'])";
    String companyReviewsDesignationCheck = "(//h2[@itemprop='name'])[1]";
    String sliderBtn = "(//div[@class='slider_btns slider_next'])[1]";
    int sliderMaxCount = 8;
}
