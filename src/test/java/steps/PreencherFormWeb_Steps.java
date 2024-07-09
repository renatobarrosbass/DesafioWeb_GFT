package steps;

import actions.ScrollPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import page.PreencherFormWeb_Page;
import util.GeradorArquivoScreenshot;
import util.Navegador;
import actions.*;
import util.Screenshot;

public class PreencherFormWeb_Steps {
    private Navegador navegador;
    private WebDriver driver;

    @Dado("que acesso o site Cat API no browser")
    public void que_acesso_o_site_cat_api_no_browser() {
        navegador = new Navegador();
        navegador.abrirBrowser();
        driver = navegador.getDriver();
    }

    @Quando("informo email, app description, combo personal project")
    public void informo_email_app_description_combo_personal_project() {
        PreencherEmail.preencherEmail(navegador, PreencherFormWeb_Page.EMAIL_VALIDO);
        PreencherDescricao.preencherDescricao(navegador, PreencherFormWeb_Page.DESCRICAO_PROJETO);
        ClicaTexto.clicarElemento(navegador, PreencherFormWeb_Page.PERSONAL_PROJECT);
        ClicaTexto.clicarElemento(navegador, PreencherFormWeb_Page.GET_FREE_ACCESS);
    }

    @Entao("verifico API Key enviada para o email informado")
    public void verifico_api_key_enviada_para_o_email_informado() {
        ValidaMensagemSucesso.validarMensagem(driver, PreencherFormWeb_Page.CONSTRUA_ALGO_MASSA, "Now go build something awesome!");
        ValidaMensagemSucesso.validarMensagem(driver, PreencherFormWeb_Page.CHECAR_EMAIL, "Check your emails for your API key and some tips to get you started.");
        ValidaMensagemSucesso.validarMensagem(driver, PreencherFormWeb_Page.SUA_CHAVE_API_CHEGOU, "Your API key has landed!");

        // Gera o nome do arquivo com datetime
        String nomeArquivo = "screenshot_" + GeradorArquivoScreenshot.dateTimeForFile() + ".png";
        // Tira a screenshot
        Screenshot.takeScreenshot(driver, nomeArquivo);

        navegador.fecharBrowser();
    }
}