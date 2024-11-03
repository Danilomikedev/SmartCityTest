package tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class DadosDeTrafegoSteps {

    private String dadosDeTrafego;

    @Given("que os dados de tráfego estão preparados")
    public void que_os_dados_de_trafego_estao_preparados() {
        dadosDeTrafego = "Dados de Tráfego: Velocidade 60km/h";

    }

    @When("eu solicito a adição dos dados de tráfego")
    public void eu_solicito_a_adicao_dos_dados_de_trafego() {

        System.out.println("Adicionando: " + dadosDeTrafego);
    }

    @Then("os dados de tráfego devem ser adicionados com sucesso")
    public void os_dados_de_trafego_devem_ser_adicionados_com_sucesso() {

        System.out.println("Dados de tráfego adicionados com sucesso: " + dadosDeTrafego);
    }
}
