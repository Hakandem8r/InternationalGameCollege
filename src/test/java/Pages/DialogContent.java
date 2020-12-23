package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends _Parent {

    WebElement myElement;

    public DialogContent() {

        PageFactory.initElements(driver, this);
    }

    @FindBy (id ="menu-item-317")
    public WebElement corporateBtn;

    @FindBy (css= "#menu-item-318")
    public WebElement aboutUsBtn;

    @FindBy (id = "menu-item-319")
    public WebElement missionAndVisionBtn;

   // @FindBy (xpath = "(//div[@class='wpb_column vc_column_container vc_col-sm-9'])[1]")
   // public WebElement homeLine;

    @FindBy (xpath= "(//a[@href='https://igamecollege.com/contact/'])[2]")        // id = menu-item-325
    public WebElement contactFirst;

    @FindBy (xpath = "(//a[@href='https://igamecollege.com/contact/'])[3]")
    public WebElement contactSecond;

    @FindBy (xpath = "//input[contains(@name, 'your-name')]")
    public WebElement nameInput;

    @FindBy (xpath = "//input[contains(@name, 'your-email')]")
    public WebElement emailInput;

    @FindBy (xpath = "//input[contains(@name, 'your-subject')]")
    public WebElement subject;

    @FindBy (xpath = "//textarea[contains(@name, 'your-message')]")
    public WebElement messageInput;

    @FindBy (xpath = "//input[contains(@value, 'Submit')]")
    public WebElement submitBtn;

    @FindBy (xpath = "//div[@class='wpcf7-response-output wpcf7-display-none wpcf7-mail-sent-ok']")
    public WebElement lastMessage;


    public void findElementAndClickFunction(String ElementName) {
        switch (ElementName) {
            case "corporateBtn" : myElement=corporateBtn; break;

            case "aboutUsBtn" : myElement=aboutUsBtn; break;

            case "missionAndVisionBtn" : myElement=missionAndVisionBtn; break;

            case "contactFirst" : myElement=contactFirst; break;

            case "contactSecond" : myElement=contactSecond; break;

            case "submitBtn" : myElement=submitBtn; break;
        }
        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String ElementName, String value) {

        switch (ElementName) {
            case "nameInput" : myElement = nameInput; break;

            case "emailInput" : myElement = emailInput; break;

            case "subject" : myElement = subject; break;

            case "messageInput" : myElement = messageInput; break;

        }
        sendKeysFunction(myElement, value);
    }
}
