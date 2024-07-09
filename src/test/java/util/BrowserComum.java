package util;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;

public class BrowserComum {
    private WebDriver firefoxDriver;

    public BrowserComum() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\T-Gamer\\Desafio_GFT_Web\\Desafio_GFT_Web\\geckodriver.exe");
        this.firefoxDriver = new FirefoxDriver();
        configurarJanelas();
    }

    private void configurarJanelas() {
        // Obtém a resolução da tela
        java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width / 2;
        int height = screenSize.height;

        // Configura a janela do Firefox
        firefoxDriver.manage().window().setSize(new Dimension(width, height));
        firefoxDriver.manage().window().setPosition(new Point(width, 0));
    }

    public void visitarSites() {
        firefoxDriver.get("https://thecatapi.com/signup");
    }

    public WebDriver getFirefoxDriver() {
        return firefoxDriver;
    }

    public void fecharBrowsers() {
        if (firefoxDriver != null) {
            firefoxDriver.quit();
        }
    }
}