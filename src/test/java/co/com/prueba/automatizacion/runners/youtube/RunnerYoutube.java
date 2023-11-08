package co.com.prueba.automatizacion.runners.youtube;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/youtube/youtube.feature",
        tags = "@CASOUNO",
        glue = "co.com.prueba.automatizacion.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class RunnerYoutube {
}
