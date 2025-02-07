package ZPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabTest {
    WebDriver driver;

    @BeforeMethod
    void Setup() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    void success() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
    }

    @Test
    void empty() {
        driver.findElement(By.id("login-button")).click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");
        String errorText1 = driver.findElement(By.cssSelector("h3[data-test=error]")).getText();
        Assert.assertTrue(errorText1.contains("Epic sadface: Username is required"));
    }

    @AfterMethod
    void tearDown() {
        driver.quit();
    }
}
