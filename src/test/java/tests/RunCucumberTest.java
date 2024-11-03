package tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Caminho onde suas features estão localizadas
        glue = "tests" // Pacote onde estão seus step definitions
)
public class RunCucumberTest {
}
