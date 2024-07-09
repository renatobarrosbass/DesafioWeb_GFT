package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClicaTexto {

    public static void clicarElemento(WebDriver driver, By by) {
        WebElement element = driver.findElement(by);
        element.click();
    }
}