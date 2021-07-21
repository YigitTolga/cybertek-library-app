package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LoginPage;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("User on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get("https://library2.cybertekschool.com/login.html");
    }

    @When("User enter librarian valid username and password")
    public void user_enter_librarian_valid_username_and_password() {
        loginPage.inputEmail.sendKeys("librarian13@library");
        loginPage.inputPassword.sendKeys("9rf6axdD");

    }

    @When("user click login button")
    public void user_click_login_button() {
        loginPage.signInButton.click();
    }

    @Then("user should land dashboard")
    public void user_should_land_dashboard() throws InterruptedException {
        String expectedTitle = "Library";
        Thread.sleep(8000);
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(expectedTitle, actualTitle);
    }


    @When("User enter student valid username and password")
    public void user_enter_student_valid_username_and_password() {
        loginPage.inputEmail.sendKeys("student30@library");
        loginPage.inputPassword.sendKeys("IaT9YI0I");
    }


}
