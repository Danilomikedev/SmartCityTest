package controllers;

import models.AlertaDeSeguranca;
import java.util.ArrayList;
import java.util.List;

public class AlertasDeSegurancaController {
    private List<AlertaDeSeguranca> alertas = new ArrayList<>();

    public void adicionarAlerta(AlertaDeSeguranca alerta) {
        alertas.add(alerta);
    }

    public void removerAlerta(int id) {
        alertas.removeIf(alerta -> alerta.getId() == id);
    }

    public List<AlertaDeSeguranca> listarAlertas() {
        return alertas;
    }
}
