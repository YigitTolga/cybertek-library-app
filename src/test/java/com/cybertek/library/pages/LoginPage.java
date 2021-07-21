package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement inputEmail;
    @FindBy(id = "inputPassword")
    public WebElement inputPassword;
    @FindBy (xpath = "//button[.='Sign in']")
    public WebElement signInButton;
}
