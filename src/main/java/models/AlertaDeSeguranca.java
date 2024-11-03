package models;

public class AlertaDeSeguranca {
    private int id;
    private String descricao;
    private boolean resolvido;

    // Construtores, Getters e Setters
    public AlertaDeSeguranca(int id, String descricao, boolean resolvido) {
        this.id = id;
        this.descricao = descricao;
        this.resolvido = resolvido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isResolvido() {
        return resolvido;
    }

    public void setResolvido(boolean resolvido) {
        this.resolvido = resolvido;
    }
}
