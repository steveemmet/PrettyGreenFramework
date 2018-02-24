package com.shiftedtech.qa.steps;

import com.google.common.base.Function;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public class LoginSteps extends StepBase {





    @Given("^Not a validated user$")
    public void not_a_validated_user() throws Throwable {
        driver.manage().deleteAllCookies();
    }

    @When("^User browse to website$")
    public void user_browse_to_website() throws Throwable {
        driver.navigate().to("https://www.prettygreen.com");
    }

    @Then("^Pretty Green Homepage should display$")
    public void pretty_Green_homepage_display() throws Throwable {
        String title = driver.getTitle();
        Assert.assertEquals("Pretty Green | Online Shop", title);
    }

    @When("^User click login link$")
    public void user_click_login_link() throws Throwable {
        click(By.linkText("Login"));
    }

    @Then("^Browser display Login page$")
    public void browser_display_Login_page() throws Throwable {
        String title = driver.getTitle();
        Assert.assertEquals("Login | Pretty Green | Online Shop", title);
    }

    @When("^User enter user email as \"([^\"]*)\"$")
    public void user_enter_user_email_as(String email) throws Throwable {
        typeText(By.id("id_username"), email);
    }

    @When("^User enter password as \"([^\"]*)\"$")
    public void user_enter_password_as(String password) throws Throwable {
        typeText(By.id("id_password"), password);
    }

    @When("^User click login button$")
    public void user_click_login_button() throws Throwable {
        click(By.xpath("/html/body/div[1]/div/div[2]/section/div[3]/form/div[4]/div/button"));
    }

    @Then("^Homepage should display$")
    public void home_page_should_display() throws Throwable {
        String title = driver.getTitle();
        Assert.assertEquals("Pretty Green | Online Shop", title);
    }

    @Then("^Logout button should be present$")
    public void logout_button_should_be_present() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        Boolean isPresent = driver.findElements(By.id("/account/logout/")).size() > 0;
        System.out.println("Login Successful");
    }



}



