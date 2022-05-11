package Selenium;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
    private final String HOME_PAGE_URL = "http://www.1a.lv/";
    private final By SEARCH_INPUT_FIELD = By.id("");
    private final By SEARCH_INPUT_FIELD1 = By.id("");
    private final By SEARCH_INPUT_FIELD2 = By.id("");
    private final By PRODUCT_TYPE = By.xpath(".//span[@class = 'single-title']");

    @Test
    public void searchFieldsCheck() {
        System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebElement searchField = browser.findElement(SEARCH_INPUT_FIELD);
        searchField.sendKeys(Keys.ENTER);
    }
}
