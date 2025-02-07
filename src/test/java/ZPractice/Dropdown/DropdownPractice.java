package ZPractice.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownPractice {

    @Test
    void dropdownTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        driver.findElement(By.xpath("//select[@id='dropdown']/option[2]")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//select[@id='dropdown']/option[2]")).isSelected());

        driver.findElement(By.xpath("//select[@id='dropdown']/option[3]")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//select[@id='dropdown']/option[3]")).isSelected());

    }
    @Test
    void dropdownSelect(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByValue("1");
        Assert.assertTrue(driver.findElement(By.xpath("//select[@id='dropdown']/option[2]")).isSelected());

        select.selectByVisibleText("Option 2");
        Assert.assertTrue(driver.findElement(By.cssSelector("option[value='2']")).isSelected());

    }
}
