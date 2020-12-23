package StepDefinitions;

import Pages.DialogContent;
import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class LoginSteps {

    WebDriver driver;

    DialogContent dialogContent=new DialogContent();


    @Given("^Navigate to igamecollege$")
    public void navigate_to_igamecollege() {
        driver = Driver.getDriver();
        driver.get("https://igamecollege.com/");
        driver.manage().window().maximize();
        //driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }

    @When("^Click corporate button$")
    public void click_corporate_button() {

        dialogContent.findElementAndClickFunction("corporateBtn");
        dialogContent.findElementAndClickFunction("aboutUsBtn");

    }

    @When("^Click About Us button verify about us title$")
    public void click_About_Us_button_verify_about_us_title() {

    }

    @Then("^Verify url \"([^\"]*)\"$")
    public void verify_url(String arg1) {

    }

    @Then("^Click Mission and Vision$")
    public void click_Mission_and_Vision() {
        dialogContent.findElementAndClickFunction("corporateBtn");
        dialogContent.findElementAndClickFunction("missionAndVisionBtn");
    }

    @Given("^click contactFirst$")
    public void click_contactFirst() {
       dialogContent.findElementAndClickFunction("contactFirst");
    }

    @Given("^click contactSecond$")
    public void click_contactSecond() {
        dialogContent.findElementAndClickFunction("contactSecond");
    }

    @Given("^given the name$")
    public void given_the_name() throws InterruptedException {
        Thread.sleep(3000);
        dialogContent.findElementAndSendKeysFunction("nameInput", "abc");
    }

    @Given("^given the email$")
    public void given_the_email() {
        dialogContent.findElementAndSendKeysFunction("emailInput","abc@gmail.com");
    }

    @Given("^given the subject$")
    public void given_the_subject() {
        dialogContent.findElementAndSendKeysFunction("subject", "Finding Bugs");
    }

    @Given("^given the message$")
    public void given_the_message() {
        dialogContent.findElementAndSendKeysFunction("messageInput", "There is a bug here. Find it!");
    }

    @Then("^click submit button$")
    public void click_submit_button() {
        dialogContent.findElementAndClickFunction("submitBtn");
    }

    @Then("^see the last message$")
    public void see_the_last_message() {
        dialogContent.lastMessage.isDisplayed();
    }



}
