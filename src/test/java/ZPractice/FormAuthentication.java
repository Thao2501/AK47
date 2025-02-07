package ZPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FormAuthentication {
    WebDriver driver;

    @BeforeMethod
    void setUp() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @Test
    void loginSuccess() {
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/secure");
        String textSuccess = driver.findElement(By.className("success")).getText();
        Assert.assertTrue(textSuccess.contains("You logged into a secure area"));
    }

    @Test
    void loginEmpty(){
        driver.findElement(By.cssSelector("button[class=radius]")).click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/login");
        String errorText1 = driver.findElement(By.className("error")).getText();
        Assert.assertTrue(errorText1.contains("Your username is invalid!"));
    }

    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}
