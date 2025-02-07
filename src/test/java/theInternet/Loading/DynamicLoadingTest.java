package theInternet.Loading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DynamicLoadingTest {
    @Test
    void dynamicLoading() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//button[.='Start']")).click();

//        Thread.sleep(5000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.id("finish"))));

//        Wait<WebDriver> wait= new WebDriverWait(driver,Duration.ofSeconds(10));
//        wait.until(d -> driver.findElement(By.id("finish")).isDisplayed());

        Assert.assertEquals(driver.findElement(By.id("finish")).getText(),"Hello World!");
    }
}
