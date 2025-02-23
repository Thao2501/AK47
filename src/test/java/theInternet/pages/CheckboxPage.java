package theInternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Support.Browser.*;

public class CheckboxPage {
    private By Checkbox1 = By.xpath("//form[@id='checkboxes']/input[1]");
    private By Checkbox2 = By.xpath("//form[@id='checkboxes']/input[2]");

    public void checkAll() {
        check(click(Checkbox1));
        check(click(Checkbox2));
    }

    public void uncheckAll() {
        uncheck(click(Checkbox1));
        uncheck(click(Checkbox2));
    }

    public WebElement checkbox1() {
        return findElement(Checkbox1);
    }

    public WebElement checkbox2() {
        return findElement(Checkbox2);
    }
}

