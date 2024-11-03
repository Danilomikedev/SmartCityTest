package models;

public class DadosDeTrafego {
    private int id;
    private String localizacao;
    private int fluxoVeicular;

    // Construtores, Getters e Setters
    public DadosDeTrafego(int id, String localizacao, int fluxoVeicular) {
        this.id = id;
        this.localizacao = localizacao;
        this.fluxoVeicular = fluxoVeicular;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getFluxoVeicular() {
        return fluxoVeicular;
    }

    public void setFluxoVeicular(int fluxoVeicular) {
        this.fluxoVeicular = fluxoVeicular;
    }
}
