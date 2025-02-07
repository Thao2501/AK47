package theInternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Support.Browser.*;

public class CheckboxPage {
    private By checkCheckbox1 = By.xpath("//form[@id='checkboxes']/input[1]");
    private By checkCheckbox2 = By.xpath("//form[@id='checkboxes']/input[2]");

    public void CheckCheckbox() {
        check(click(checkCheckbox1));
        check(click(checkCheckbox2));
    }

    public void uncheckCheckbox() {
        uncheck(click(checkCheckbox1));
        uncheck(click(checkCheckbox2));
    }

    public WebElement ClickCheckbox1() {
        return findElement(checkCheckbox1);
    }

    public WebElement ClickCheckbox2() {
        return findElement(checkCheckbox2);
    }
}

