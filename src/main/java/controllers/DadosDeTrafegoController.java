package controllers;

import models.DadosDeTrafego;
import java.util.ArrayList;
import java.util.List;

public class DadosDeTrafegoController {
    private List<DadosDeTrafego> dadosDeTrafego = new ArrayList<>();

    public void adicionarDados(DadosDeTrafego dados) {
        dadosDeTrafego.add(dados);
    }

    public void removerDados(int id) {
        dadosDeTrafego.removeIf(dado -> dado.getId() == id);
    }

    public List<DadosDeTrafego> listarDados() {
        return dadosDeTrafego;
    }
}
