package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PreencherDescricao {

    // Método para preencher a descrição no campo indicado
    public static void preencherDescricao(WebDriver driver, By by) {
        String descricao = "Projeto de Automação de Testes Desafio GFT";
        WebElement campoDescricao = driver.findElement(by);
        campoDescricao.sendKeys(descricao);
    }
}