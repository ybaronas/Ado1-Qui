
package class;

public class Medicamento {

    private Long id;
    private String nome;
    private String principioAtivo;
    private String telefone;
    private String fabricante;
    private Tipo[] tipo;
    private Lote lote;

    public Medicamento(Long id, String nome, String principioAtivo, String telefone, String fabricante, Tipo[] tipo, Lote lote) {
        this.id = id;
        this.nome = nome;
        this.principioAtivo = principioAtivo;
        this.telefone = telefone;
        this.fabricante = fabricante;
        this.tipo = tipo;
        this.lote = lote;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPrincipioAtivo() {
        return principioAtivo;
    }

    public void setPrincipioAtivo(String principioAtivo) {
        this.principioAtivo = principioAtivo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Tipo[] getTipo() {
        return tipo;
    }

    public void setTipo(Tipo[] tipo) {
        this.tipo = tipo;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }
}
