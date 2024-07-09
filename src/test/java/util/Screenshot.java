package util;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
    public static String takeScreenshot(WebDriver driver, String fileName) {
        // Define o diretório onde os screenshots serão salvos
        String directory = "Evidencias";
        // Cria o diretório se ele não existir
        File dir = new File(directory);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        // Gera o caminho completo do arquivo
        String filePath = directory + File.separator + fileName;
        // Tira o screenshot e salva no arquivo especificado
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File(filePath));
        } catch (Exception e) {
            System.out.println("Houveram problemas ao copiar o arquivo de: " + e.getMessage());
        }
        return filePath;
    }
}