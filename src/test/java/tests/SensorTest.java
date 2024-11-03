package tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Caminho para os arquivos .feature
        glue = "tests" // O pacote onde estão definidos os passos
)
public class SensorTest {
}
