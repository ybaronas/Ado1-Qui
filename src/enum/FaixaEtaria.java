
package enum;

public enum FaixaEtaria {
    CRIANCA("crianca", "0-13"),
    ADOLESCENTE("adolescente", "13-18"),
    ADULTO("adulto", "+18");

    private String descricao;
    private String entreIdades;

    private FaixaEtaria(String descricao, String entreIdades) {
        this.descricao = descricao;
        this.entreIdades = entreIdades;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getEntreIdades() {
        return entreIdades;
    }
}
