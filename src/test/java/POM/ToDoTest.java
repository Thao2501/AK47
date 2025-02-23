package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.security.Key;

public class ToDoTest {


    @Test
    void createNewToDo() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://todomvc.com/examples/react/dist/");
        Actions actions = new Actions(driver);
        actions.sendKeys("Task 1").perform();

        actions.keyDown(Keys.ENTER).perform();

        Assert.assertTrue(driver.findElement(By.xpath("//label[@data-testid='todo-item-label']")).getText().contains("Task 2"));
    }

    @Test
    void markCompleteToDoByClickCheckbox() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://todomvc.com/examples/react/dist/");

        Actions actions = new Actions(driver);
        actions.sendKeys("Task 1").perform();

        actions.keyDown(Keys.ENTER).perform();

        driver.findElement(By.xpath("//input[@class='toggle']")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//span[@class='todo-count']")).getText().contains("0 items left!"));
    }

    @Test
    void markCompleteToDoByClickAll() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://todomvc.com/examples/react/dist/");

        Actions actions = new Actions(driver);
        actions.sendKeys("Task 1").perform();

        actions.keyDown(Keys.ENTER).perform();

        driver.findElement(By.xpath("//input[@class='toggle-all']")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//span[@class='todo-count']")).getText().contains("0 items left!"));
    }

    @Test
    void deleteToDo() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://todomvc.com/examples/react/dist/");

        int toDoItem = driver.findElements(By.xpath("//label[@data-testid='todo-item-label']")).size();
        int countItemBeforeDelete = toDoItem;
        Actions actions = new Actions(driver);
        actions.sendKeys("Task 1").perform();

        actions.keyDown(Keys.ENTER).perform();


        WebElement areaHover = driver.findElement(By.xpath("//label[@data-testid='todo-item-label']"));
        actions.moveToElement(areaHover).perform();
        driver.findElement(By.xpath("//button[@class='destroy']")).click();

        int countItemAfterDelete = toDoItem;

        Assert.assertTrue(countItemAfterDelete == countItemBeforeDelete);

    }
}
