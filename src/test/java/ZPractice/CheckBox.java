package ZPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBox{
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }

    @Test
    public void testCheckBox() {
        // Tìm checkbox đầu tiên
        WebElement checkBox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
        WebElement checkBox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));

        // Kiểm tra trạng thái ban đầu của checkbox
        Assert.assertFalse(checkBox1.isSelected(), "Checkbox 1 should not be selected by default.");
        Assert.assertTrue(checkBox2.isSelected(), "Checkbox 2 should be selected by default.");

        // Click vào checkbox 1 để chọn
        checkBox1.click();
        Assert.assertTrue(checkBox1.isSelected(), "Checkbox 1 should be selected after clicking.");

        // Click vào checkbox 2 để bỏ chọn
        checkBox2.click();
        Assert.assertFalse(checkBox2.isSelected(), "Checkbox 2 should not be selected after clicking.");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
