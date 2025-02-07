package theInternet.MouseAndKeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HorizontalTest {
    @Test
    void horizontalSlider() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/horizontal_slider");

        Actions actions = new Actions(driver);

        WebElement pointer = driver.findElement(By.xpath("//div[@class='sliderContainer']/input"));
        int width = pointer.getSize().getWidth();

        actions.clickAndHold(pointer).moveByOffset(width,0).perform();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        Assert.assertTrue(wait.until(ExpectedConditions.textToBe(By.id("range"),"5")));
    }
}
