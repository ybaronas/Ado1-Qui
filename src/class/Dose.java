public class Dose {

    //Atributos
    private Long id;
    private Medicamento[] medicamento;
    private Usuario usuario;
    private Date horarioPrevisto;
    private boolean status;

    //Constructor
    public Dose(Long id, Medicamento[] medicamento, Usuario usuario, Date horarioPrevisto, boolean status) {
        this.id = id;
        this.medicamento = medicamento;
        this.usuario = usuario;
        this.horarioPrevisto = horarioPrevisto;
        this.status = status;
    }

    // Getters
    public Long getId() {
        return id;
    }
    public Long getIdMedicamento() {
        return medicamento[0].getId();
    }
    public Long getIdUsuario() {
        return usuario.getId();
    }
    public Date getHorarioPrevisto() {
        return horarioPrevisto;
    }
    public boolean isStatus(){
        return status;
    }
    
    //Setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setMedicamento(Medicamento[] medicamento) {
        this.medicamento = medicamento;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public void setHorarioPrevisto(Date horarioPrevisto) {
        this.horarioPrevisto = horarioPrevisto;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}
