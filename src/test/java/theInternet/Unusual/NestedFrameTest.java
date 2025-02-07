package theInternet.Unusual;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NestedFrameTest {
    @Test
    void verifyNestedFrameContent() {
        WebDriver driver = new ChromeDriver(); // default content
        driver.get("https://the-internet.herokuapp.com/nested_frames");

        driver.switchTo().frame("frame-top"); // be FRAME-TOP
        driver.switchTo().frame("frame-left"); // be FRAME-LEFT
        String content = driver.findElement(By.xpath("/html/body")).getText();
        Assert.assertTrue(content.contains("LEFT"));

        driver.switchTo().parentFrame();// be FRAME-TOP
        driver.switchTo().frame("frame-middle");
        content = driver.findElement(By.id("content")).getText();
        Assert.assertTrue(content.contains("MIDDLE"));

        driver.switchTo().parentFrame();// be FRAME-TOP
        driver.switchTo().frame("frame-right");
        content = driver.findElement(By.xpath("/html/body")).getText();
        Assert.assertTrue(content.contains("RIGHT"));

        driver.switchTo().defaultContent(); // default content
        driver.switchTo().frame("frame-bottom");
        content = driver.findElement(By.xpath("/html/body")).getText();
        Assert.assertTrue(content.contains("BOTTOM"));

        driver.quit();
    }
}
