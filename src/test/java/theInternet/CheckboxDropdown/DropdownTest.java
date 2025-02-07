package theInternet.CheckboxDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTest {
    //    Open browser
//    Navigate to https://the-internet.herokuapp.com/dropdown
//    Select "option 1"
//    Validate "option 1" is selected
    @Test
    void tc03() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText("Option 1");
    }
    @Test
    void tc04(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByValue("1");

        Assert.assertTrue(driver.findElement(By.cssSelector("option[value='1']")).isSelected());

    }
}
