package controllers;

import models.Sensor;
import java.util.ArrayList;
import java.util.List;

public class SensoresController {
    private List<Sensor> sensores = new ArrayList<>();

    public void adicionarSensor(Sensor sensor) {
        sensores.add(sensor);
    }

    public void removerSensor(int id) {
        sensores.removeIf(sensor -> sensor.getId() == id);
    }

    public Sensor buscarSensor(int id) {
        for (Sensor sensor : sensores) {
            if (sensor.getId() == id) {
                return sensor;
            }
        }
        return null; // ou lançar uma exceção
    }

    public List<Sensor> listarSensores() {
        return sensores;
    }
}
