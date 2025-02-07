package theInternet.MouseAndKeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeyPressTest {
    @Test
    void keyPress(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/key_presses");
        Actions actions = new Actions(driver);
        actions.keyDown("A").perform();
        System.out.println(driver.findElement(By.id("result")).getText());
        Assert.assertTrue(driver.findElement(By.id("result")).getText().contains("You entered: A"));

        //        actions.keyDown(Keys.COMMAND).perform();
//        System.out.println(driver.findElement(By.id("result")).getText());

//        actions.keyDown(Keys.ENTER).perform();
//        System.out.println(driver.findElement(By.id("result")).getText());

    }
}
