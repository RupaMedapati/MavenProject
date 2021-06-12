package steps;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public ChromeDriver driver;

    @Given("Open chrome browser")
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @And("Load the application url {string}")
    public void loadUrl(String url) {
        driver.get(url);
    }

    @And("Enter the username as {string}")
    public void enterName(String username) {
        driver.findElementByXPath("//input[@id='username']").sendKeys(username);

    }

    @And("Enter the password as {string}")
    public void enterPassword(String password) {
        driver.findElementByXPath("//input[@name='PASSWORD']").sendKeys(password);

    }

    @When("Click on login button")

    public void clickLoginButton() {
        driver.findElementByXPath("//input[@class='decorativeSubmit']").click();

    }

    @Then("Homepage should be displayed")
    public void verifyHomePge() {
        System.out.println("home page is displayed");

    }

    @But("Error msg should be displayed")
    public void verifyHomePage() {
        System.out.println("Error msg should be displayed");
    }
}