package theInternet.pages;

import Support.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static Support.Browser.findElement;

public class DropdownPage {
    private Select select;

    public DropdownPage() {
        select = new Select(findElement(By.id("dropdown")));
    }

    public void select(String optionVisibleText){
        select.selectByVisibleText(optionVisibleText);
    }

    public boolean isOptionSelected(String optionVisibleText){
       return Browser.isSelected(By.xpath(String.format("//option[text()='%s']",optionVisibleText)));
    }
}

