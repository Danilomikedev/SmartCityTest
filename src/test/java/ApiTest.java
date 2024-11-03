import io.restassured.RestAssured;
import org.junit.Test; // Mude para importar de org.junit.Test

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals; // Para asserções

public class ApiTest {

    @Test
    public void testSensorExists() {
        // Ignorar a validação de SSL
        RestAssured.useRelaxedHTTPSValidation();

        // Fazer a requisição com Rest Assured
        int statusCode = given()
                .when()
                .get("https://localhost:7028/swagger/index.html") // Substitua pela sua URL
                .statusCode(); // Pega o código de status da resposta

        // Verifica se o status da resposta é 200
        assertEquals(200, statusCode);
    }
}
