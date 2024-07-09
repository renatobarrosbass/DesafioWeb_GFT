package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.GerarEmailsValidos;

public class PreencherEmail {
        public static void preencherEmail(WebDriver driver, By by) {
        String email = GerarEmailsValidos.gerarEmailValido();
        WebElement campoEmail = driver.findElement(by);
        campoEmail.sendKeys(email);
    }
}
