package Selenium;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork2 {
    private final String HOME_PAGE_URL = "http://www.qaguru.lv:8089/tickets/step2.php?afrom=CPT&bfrom=BCN";
    private final By SEARCH_INPUT_FIELD = By.id("name");
    private final By SEARCH_INPUT_FIELD1 = By.id("surname");
    private final By SEARCH_INPUT_FIELD2 = By.id("discount");
    private final By SEARCH_INPUT_FIELD3 = By.id("adults");
    private final By SEARCH_INPUT_FIELD4 = By.id("children");
    private final By SEARCH_INPUT_FIELD5 = By.id("bugs");
    private final By SEARCH_INPUT_FIELD6 = By.id("flight");
    private final By PRODUCT_TYPE = By.xpath(".//span[@class = 'single-title']");

    @Test
    public void searchFieldsCheck() {
        System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebElement searchField = browser.findElement(SEARCH_INPUT_FIELD6);
        searchField.sendKeys("11-05-2018");
        searchField.sendKeys(Keys.ENTER);
    }
}