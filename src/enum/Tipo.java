
package enum;

public enum Tipo {
    GASTRO("gastro", "intestino"),
    CARDIOVASCULAR("cardiovascular", "coracao"),
    MENTAL("mental", "mente");

    private String descricaoTecnica;
    private String descricaoPopular;

    private Tipo(String descricaoTecnica, String descricaoPopular) {
        this.descricaoTecnica = descricaoTecnica;
        this.descricaoPopular = descricaoPopular;
    }

    public String getDescricaoTecnica() {
        return descricaoTecnica;
    }

    public String getDescricaoPopular() {
        return descricaoPopular;
    }
}
