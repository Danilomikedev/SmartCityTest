package models;

public class Sensor {
    private int id;
    private String tipo;
    private String localizacao;

    // Construtores
    public Sensor(int id, String tipo, String localizacao) {
        this.id = id;
        this.tipo = tipo;
        this.localizacao = localizacao;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
