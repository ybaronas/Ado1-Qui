
import enum.FaixaEtaria;

public class Usuario {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private FaixaEtaria[] faixaEtaria;

    private Usuario(Long id, String nome, String email, String telefone, FaixaEtaria[] faixaEtaria) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.faixaEtaria = faixaEtaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public FaixaEtaria[] getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(FaixaEtaria[] faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }
}
