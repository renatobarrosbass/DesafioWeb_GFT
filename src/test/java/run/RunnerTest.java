package run;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import util.Navegador;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps", // Defina o pacote onde estão os step definitions
        tags = "@PreencherDadosCatApi",
        monochrome = true
        //strict = false
)
public class RunnerTest {
    private static Navegador nav;

    @BeforeClass
    public static void setUp() {
        nav = new Navegador();
        nav.abrirBrowser();
    }

    @AfterClass
    public static void tearDown() {
        if (nav != null) {
            nav.fecharBrowser();
        }
    }
}