package theInternet.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class formAuthenicationTest {
    WebDriver driver;
    @BeforeTest
    void before(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
    }
    @DataProvider
    Object[][] testData(){
        return new Object[][]{
                {"tomsmith","SuperSecretPassword!","https://the-internet.herokuapp.com/secure","success","You logged into a secure area!"},
                {"","","https://the-internet.herokuapp.com/login","error","Your username is invalid!"},
                {"tomsmih","SuperSecretPassword!","https://the-internet.herokuapp.com/login","error","Your username is invalid!"},
                {"tomsmith","","https://the-internet.herokuapp.com/login","error","Your password is invalid!"},
                {"tomsmith","SuperSecretPassword","https://the-internet.herokuapp.com/login","error","Your password is invalid!"},
        };
    }

    @Test(dataProvider = "testData")
    void authenticationFormTest(String username,String password,String expectedUrl,String expectedMessageType,String expectedMessageContent) {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.cssSelector("input[type=submit]")).click();

        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
        Assert.assertTrue(driver.findElement(By.className(expectedMessageType)).getText().contains(expectedMessageContent));
//        driver.quit();
    }
    @Test
    void tc01() {

        /*CSS = [A=t] or E[A=t]
          XPATH = //*[@A='t'] or //E[A='t']*/

//        driver.findElement(By.tagName("input")).sendKeys("tomsmith");
//
//        driver.findElement(By.cssSelector("[type=text]")).sendKeys("tomsmith");
//        driver.findElement(By.cssSelector("input[type=text]")).sendKeys("tomsmith");
//        driver.findElement(By.xpath("//*[@type='text']")).sendKeys("tomsmith");
//        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tomsmith");
//
//        driver.findElement(By.name("username")).sendKeys("tomsmith");
//        driver.findElement(By.cssSelector("[name=username]")).sendKeys("tomsmith");
//        driver.findElement(By.cssSelector("input[name=username]")).sendKeys("tomsmith");
//        driver.findElement(By.xpath("//*[@name='username']")).sendKeys("tomsmith");
//        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
//
        driver.findElement(By.id("username")).sendKeys("tomsmith");
//        driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith"); //shortcut
//        driver.findElement(By.cssSelector("input#username")).sendKeys("tomsmith"); //shortcut
//        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("tomsmith");
//        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");

        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

        driver.findElement(By.cssSelector("button[type=submit]")).click();
//        driver.findElement(By.xpath("//button[.=' Login']")).click();
//        driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/secure");
        Assert.assertTrue(driver.findElement(By.className("success")).getText().contains("You logged into a secure area!"));
        driver.quit();

    }
    // ko co username
    @Test
    void tc02() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
//        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button[type=submit]")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/login");
        Assert.assertTrue(driver.findElement(By.className("error")).getText().contains("Your username is invalid"));
        driver.quit();
    }

    //ko co password
    @Test
    void tc03() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
//        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button[type=submit]")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/login");
        Assert.assertTrue(driver.findElement(By.className("error")).getText().contains("Your password is invalid"));
        driver.quit();
    }

    //ko co username va password
    @Test
    void tc04() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
//        driver.findElement(By.id("username")).sendKeys("tomsmith");
//        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button[type=submit]")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/login");
        Assert.assertTrue(driver.findElement(By.className("error")).getText().contains("Your username is invalid"));
        driver.quit();
    }
    //sai username
    @Test
    void tc05() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith1");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button[type=submit]")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/login");
        Assert.assertTrue(driver.findElement(By.className("error")).getText().contains("Your username is invalid"));
        driver.quit();
    }

    //sai password
    @Test
    void tc06() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!1");
        driver.findElement(By.cssSelector("button[type=submit]")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/login");
        Assert.assertTrue(driver.findElement(By.className("error")).getText().contains("Your password is invalid"));
        driver.quit();
    }

    @AfterTest
    void after(){
        driver.quit();
    }
}


