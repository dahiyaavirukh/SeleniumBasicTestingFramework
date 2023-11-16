package main.java.pageObjects;

public interface LoginPageElements {
    String loginText = "//h1";
    String rollNO = "//input[@name='MemberCode']";
    String password = "//input[@name='Password']";
    String submitBtn = "//input[@id='BTNSubmit']";
    String invalidPassword = "(//font)[1]";
    String invalidRollNoOrPassword = "(//font)[1]";
    String logoutBtn = "(//strong)[5]";
}
