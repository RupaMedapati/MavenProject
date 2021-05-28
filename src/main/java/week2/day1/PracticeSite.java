package week2.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeSite {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElementByXPath("(//input[@class='input_error form_input'])[1]").sendKeys("standard_user");


    driver.findElementByXPath("(//input[@class='input_error form_input'])[2]").sendKeys("secret_sauce");
    driver.findElementByXPath("//input[@class='submit-button btn_action']").click();
    Thread.sleep(3000);
        WebElement source=driver.findElementByXPath("//select[@class='product_sort_container']");
        Select dropdown=new Select(source);
        dropdown.selectByVisibleText("Price (low to high)");
}
}

