package Support;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Browser {
    private static WebDriver driver;
    public static WebDriverWait wait;

    public static void openBrowser(String browser) {
        switch (browser) {
            case "chrome": {
                driver = new ChromeDriver();
                break;
            }
            case "firefox": {
                driver = new FirefoxDriver();
                break;
            }
            case "Safari": {
                driver = new SafariDriver();
                break;
            }
        }
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void visit(String url) {
        driver.get(url);
    }

    public static void quit() {
        driver.quit();
    }

    public static String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public static By click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
//        driver.findElement(locator).click();
        return locator;
    }

    public static void fill(By locator, CharSequence... withText) {
        driver.findElement(locator).sendKeys(withText);
    }

    public static String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    public static WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public static void captureScreen(String name) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File(String.format("target/screenshot-%s-%s.png", name, System.currentTimeMillis()));
        try {
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void check(By locator) {
        if (!driver.findElement(locator).isSelected()) click(locator);
    }

    public static void uncheck(By locator) {
        if (driver.findElement(locator).isSelected()) click(locator);
    }

    public static void selectDropdownByValue(String value) {
        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByValue(value);
    }

    public static void selectDropdownByVisibleText(String value) {
        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText(value);
    }

    public static void actionDragAndDrop(WebElement source, WebElement target) {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).perform();
    }

    public static void actionClickAndHold(WebElement a, int x, int y) {
        Actions actions = new Actions(driver);
        actions.clickAndHold(a).moveByOffset(x, y).perform();
    }

    public static void actionClickRight(WebElement a) {
        Actions actions = new Actions(driver);
        actions.contextClick(a).perform();
        driver.switchTo().alert().accept();
    }

    public static void actionHover(WebElement a) {
        Actions actions = new Actions(driver);
        actions.moveToElement(a).perform();
    }

    public static void actionScroll(int x, int y) {
        Actions actions = new Actions(driver);
        actions.scrollByAmount(x, y).perform();
    }
    public static void actionKeyPress(String a){
        Actions actions = new Actions(driver);
        actions.keyDown(a).perform();
    }

    public static void timeWait(int x) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(x));
    }
}
