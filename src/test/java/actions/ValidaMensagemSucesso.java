package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ValidaMensagemSucesso {
    // Método para validar a mensagem na tela
    public static boolean validarMensagem(WebDriver driver, By by, String mensagemEsperada) {
        try {
            // Aguardará alguns segundos para dar tempo de carregar a página
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement elemento = driver.findElement(by);
        String mensagemAtual = elemento.getText();
        return mensagemAtual.equals(mensagemEsperada);
    }
}