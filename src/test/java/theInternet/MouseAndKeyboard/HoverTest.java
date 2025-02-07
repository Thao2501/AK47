package theInternet.MouseAndKeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverTest {
    @Test
    void hoverToImage(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/hovers");

        Actions actions = new Actions(driver);
        WebElement image1 = driver.findElement(By.xpath("//div[@class='example']/div[1]/img"));
        actions.moveToElement(image1).perform();

        String image1Profile = driver.findElement(By.xpath("//div[@class='example']/div[1]/div/h5")).getText();
        Assert.assertEquals(image1Profile,"name: user1");


    }
}
