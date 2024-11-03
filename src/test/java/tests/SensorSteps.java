package tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class SensorSteps {

    private String sensor;

    @Given("que um sensor está preparado")
    public void que_um_sensor_estah_preparado() {
        sensor = "Sensor de Temperatura";

    }

    @When("eu solicito a adição do sensor")
    public void eu_solicito_a_adicao_do_sensor() {

        System.out.println("Adicionando: " + sensor);
    }

    @Then("o sensor deve ser adicionado com sucesso")
    public void o_sensor_deve_ser_adicionado_com_sucesso() {

        System.out.println("Sensor adicionado com sucesso: " + sensor);
    }
}
