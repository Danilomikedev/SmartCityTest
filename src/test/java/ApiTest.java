import io.restassured.RestAssured;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class ApiTest {

    @Test
    public void testSensorExists() {
        // Ignorar a validação de SSL
        RestAssured.useRelaxedHTTPSValidation();

        // Fazer a requisição com Rest Assured
        int statusCode = given()
                .when()
                .get("https://cidadesint-d8epcze6dqd3hvdt.brazilsouth-01.azurewebsites.net")
                .getStatusCode(); // Pega o código de status da resposta

        // Verifica se o status da resposta é 200
        assertEquals(200, statusCode);
    }
}
