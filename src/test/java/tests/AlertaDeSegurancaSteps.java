package tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class AlertaDeSegurancaSteps {

    private String alerta;

    @Given("que um alerta de segurança está preparado")
    public void que_um_alerta_de_seguranca_estah_preparado() {
        alerta = "Alerta de Segurança";
        // Aqui você pode preparar o alerta de forma mais complexa, se necessário.
    }

    @When("eu solicito a adição do alerta")
    public void eu_solicito_a_adicao_do_alerta() {
        // Lógica para adicionar o alerta
        // Por exemplo, você pode simular a adição a um banco de dados ou lista
        System.out.println("Adicionando: " + alerta);
    }

    @Then("o alerta deve ser adicionado com sucesso")
    public void o_alerta_deve_ser_adicionado_com_sucesso() {
        // Aqui você pode verificar se o alerta foi realmente adicionado.
        // Por exemplo, você pode usar uma asserção para validar.
        System.out.println("Alerta adicionado com sucesso: " + alerta);
    }
}
