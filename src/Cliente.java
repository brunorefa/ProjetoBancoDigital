public class Cliente {
    protected String nome;
    public Cliente(String nome) {
        new ContaCorrente(this);
        new ContaPoupanca(this);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}