package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollPage {
    public static void scrollDeCimaParaBaixo(WebDriver driver, By by) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll suave até o elemento
        int yOffset = element.getLocation().getY();
        int currentPosition = 0;
        while (currentPosition < yOffset) {
            js.executeScript("window.scrollBy(0, 50);");
            currentPosition += 50;
            try {
                Thread.sleep(20); // Pausa para suavizar o scroll
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Garante que o elemento esteja visível
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}