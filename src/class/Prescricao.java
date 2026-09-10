import java.sql.Date;

public class Prescricao {
    private Long id;
    private Usuario usuario;
    private Medicamento[] medicamento;
    private Dose dose;
    private int quantidadePorDose;
    private int frequencia;
    private Date dataInicio;
    private Date dataFim;
    private boolean status;

    //Constructor
    public Prescricao(Long id, Usuario usuario, Medicamento[] medicamento, Dose dose, int quantidadePorDose, int frequencia, Date dataInicio, Date dataFim, boolean status) {
        this.id = id;
        this.usuario = usuario;
        this.medicamento = medicamento;
        this.dose = dose;
        this.quantidadePorDose = quantidadePorDose;
        this.frequencia = frequencia;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.status = status;
    }

    // Getters
    public Long getId() {
        return id;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public Medicamento[] getMedicamento() {
        return medicamento;
    }
    public Dose getDose() {
        return dose;
    }
    public int getQuantidadePorDose() {
        return quantidadePorDose;
    }
    public int getFrequencia() {
        return frequencia;
    }
    public Date getDataInicio() {
        return dataInicio;
    }
    public Date getDataFim() {
        return dataFim;
    }
    public boolean isStatus() {
        return status;
    }

    //Setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public void setMedicamento(Medicamento[] medicamento) {
        this.medicamento = medicamento;
    }
    public void setDose(Dose dose) {
        this.dose = dose;
    }
    public void setQuantidadePorDose(int quantidadePorDose) {
        this.quantidadePorDose = quantidadePorDose;
    }
    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }
    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}
