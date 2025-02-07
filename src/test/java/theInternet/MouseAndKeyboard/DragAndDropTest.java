package theInternet.MouseAndKeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDropTest {
    @Test
    void dragDropElements(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");

        Actions actions = new Actions(driver);

        WebElement source = driver.findElement(By.id("column-a"));
        WebElement target = driver.findElement(By.id("column-b"));

        Assert.assertEquals(driver.findElement(By.xpath("//div[@id='column-a']/header")).getText(),"A");
        Assert.assertEquals(driver.findElement(By.xpath("//div[@id='column-b']/header")).getText(),"B");

        actions.dragAndDrop(source,target).perform();

        Assert.assertEquals(driver.findElement(By.xpath("//div[@id='column-a']/header")).getText(),"B");
        Assert.assertEquals(driver.findElement(By.xpath("//div[@id='column-b']/header")).getText(),"A");
    }
}
