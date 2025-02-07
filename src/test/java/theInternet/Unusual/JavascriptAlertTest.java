package theInternet.Unusual;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavascriptAlertTest {
    @Test
    void ableClickJSAlert() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();

        driver.switchTo().alert().accept();
        Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You successfully clicked an alert");
    }

    @Test
    void ableCancelJSConfirm() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();

        driver.switchTo().alert().dismiss();
        Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You clicked: Cancel");

        driver.quit();
    }

    @Test
    void ableAcceptJSConfirm() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();

        driver.switchTo().alert().accept();
        Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You clicked: Ok");

        driver.quit();
    }

    @Test
    void ableSendKeysInJSPrompt() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();

        driver.switchTo().alert().sendKeys("hello");
        driver.switchTo().alert().accept();
        Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You entered: hello");

        driver.quit();
    }

    @Test
    void ableSendKeysNull() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();

        driver.switchTo().alert().sendKeys("hello");
        driver.switchTo().alert().dismiss();
        Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You entered: null");

        driver.quit();
    }

}
