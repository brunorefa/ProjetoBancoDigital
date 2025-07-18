import java.util.List;

public class Banco {
    private String Nome;
    private List<Conta> Contas;

    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        this.Nome = nome;
    }
    public List<Conta> getContas() {
        return Contas;
    }
    public void setContas(List<Conta> contas) {
        this.Contas = contas;
}
}