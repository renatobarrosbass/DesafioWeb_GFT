package page;

import org.openqa.selenium.By;

public class PreencherFormWeb_Page {
    public static By GET_FREE_ACCESS = By.xpath("/html/body/div/main/section/div[2]/form/div[2]/div[3]/button");
    public static By EMAIL_VALIDO = By.id("email");
    public static By DESCRICAO_PROJETO = By.xpath("//*[@id=\"description\"]");
    public static By PERSONAL_PROJECT = By.xpath("/html/body/div/main/section/div[2]/form/div[2]/div[2]/div[2]/label");
    public static By CONSTRUA_ALGO_MASSA = By.xpath("//p[contains(text(),'Now go build something awesome!')]");
    public static By CHECAR_EMAIL = By.xpath("//p[contains(text(),'Check your emails for your API key and some tips t')]");
    public static By SUA_CHAVE_API_CHEGOU = By.xpath("//h2[contains(text(),'Your API key has landed!')]");

}
