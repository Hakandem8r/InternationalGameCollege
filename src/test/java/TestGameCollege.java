import com.codeborne.selenide.Condition;
import com.codeborne.selenide.webdriver.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestGameCollege {

        WebDriver driver;

        @BeforeMethod
        public void setUpMethod() {
            //driver = WebDriverFactory.getDriver("chrome");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();

        }

        @AfterMethod
        public void afterMethod() throws InterruptedException {
            Thread.sleep(2000);
            driver.quit();
        }

        @Test
        public void test1() throws InterruptedException {

            driver.get("https://igamecollege.com/");

            WebElement gameCo = driver.findElement(By.id("menu-item-317"));

            Actions actions = new Actions(driver);

            Thread.sleep(2000);

            actions.moveToElement(gameCo).perform();

            Thread.sleep(2000);

            driver.findElement(By.cssSelector("#menu-item-318")).click();

            Thread.sleep(2000);

           // driver.findElement(By.xpath("(//a[@href='https://igamecollege.com/discover/pre-registration-form/'])[3]")).click();

           // Thread.sleep(3000);
        }
    }