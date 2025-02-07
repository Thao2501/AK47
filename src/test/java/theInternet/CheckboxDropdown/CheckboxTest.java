package theInternet.CheckboxDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class CheckboxTest {
    @Test
    void verifyAbleSelectCheckboxes() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        check(driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]")));
        Assert.assertTrue(driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]")).isSelected());

        check(driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]")));
        Assert.assertTrue(driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]")).isSelected());
    }

    @Test
    void verifyAbleUnSelectCheckboxes() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        uncheck(driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]")));
        Assert.assertFalse(driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]")).isSelected());

        uncheck(driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]")));
        Assert.assertFalse(driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]")).isSelected());
    }

    public static void check(WebElement element) {
        if (!element.isSelected()) element.click();
    }

    public static void uncheck(WebElement element) {
        if (element.isSelected()) element.click();
    }
}
