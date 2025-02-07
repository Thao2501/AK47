package theInternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Support.Browser.*;

public class DropdownPage {
    private By option1 =By.cssSelector("option[value='1']");
    private By option2 =By.cssSelector("option[value='2']");

    public WebElement selectOption1() {
        return findElement(option1);
    }
    public WebElement selectOption2() {
        return findElement(option2);
    }
}

