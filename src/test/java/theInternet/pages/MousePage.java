package theInternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Support.Browser.*;

public class MousePage {

    private By column1 = By.id("column-a");
    private By column2 = By.id("column-b");
    private By headerColumn1 = By.xpath("//div[@id='column-a']/header");
    private By headerColumn2 = By.xpath("//div[@id='column-b']/header");

    private By valuePointer = By.xpath("//div[@class='sliderContainer']/input");
    private By range = By.id("range");
    private By textAround = By.className("example");

    private By clickRight = By.id("hot-spot");

    private By image1 = By.xpath("//div[@class='example']/div[1]/img");
    private By imageProfile1 = By.xpath("//div[@class='example']/div[1]/div/h5");

    private By result = By.id("result");

    //Action DragDrop
    public void dragDropElements() {
        WebElement source = findElement(column1);
        WebElement target = findElement(column2);
        actionDragAndDrop(source, target);
    }

    public String headerColumn1() {
        return getText(headerColumn1);
    }

    public String headerColumn2() {
        return getText(headerColumn2);
    }

    //Action Horizontal Slide
    public void clickAndHoldOnPointer() {

        WebElement pointer = findElement(valuePointer);
        int width = pointer.getSize().getWidth();
        actionClickAndHold(pointer, width, 0);
    }
    public void clickOut() {
        click(textAround);
    }
    public String range() {
        return getText(range);
    }

    //Action ClickRight
    public  void setClickRight() {
        WebElement right = findElement(clickRight);
        actionClickRight(right);
    }

    //Action Hover
    public void hoverImage() {
        WebElement image = findElement(image1);
        actionHover(image);
    }

    public String imageProfile() {
        return getText(imageProfile1);
    }
    //Action KeyPress
    public String resultKeyPress() {
        return getText(result);
    }
}

