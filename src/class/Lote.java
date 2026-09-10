
package class;

import java.util.Date;

public class Lote {

    private Long id;
    private Usuario usuario;
    private Medicamento medicamento;
    private int quantidadeInicial;
    private int quantidadeAtual;
    private Date dataEntrada;
    private Date dataValidade;


    public Lote(Long id, Usuario usuario, Medicamento medicamento, int quantidadeInicial, int quantidadeAtual, Date dataEntrada, Date dataValidade) {
        this.id = id;
        this.usuario = usuario;
        this.medicamento = medicamento;
        this.quantidadeInicial = quantidadeInicial;
        this.quantidadeAtual = quantidadeAtual;
        this.dataEntrada = dataEntrada;
        this.dataValidade = dataValidade;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public int getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public void setQuantidadeAtual(int quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }

    public int getQuantidadeInicial() {
        return quantidadeInicial;
    }

    public void setQuantidadeInicial(int quantidadeInicial) {
        this.quantidadeInicial = quantidadeInicial;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
