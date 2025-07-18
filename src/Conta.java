public abstract class Conta implements IConta {
    
    private static int AGENCIA_PADRAO = 29;
    private static int SEQUENCIAL = 1;

    protected Cliente cliente;
    protected String TipoConta;
    protected String Nome;
    protected double Saldo;
    protected int Numero;
    protected int Agencia;

    public Conta(Cliente cliente) {
        this.Agencia = AGENCIA_PADRAO;
        this.Numero = SEQUENCIAL++;
        this.Saldo = 0.00;
        this.cliente = cliente;
    }
    public void Sacar(double valor) {
        Saldo -= valor;
    }
    public void Depositar(double valor) {
        Saldo += valor;
    }
    public void Transferir(double valor, Conta contaDestino) {
        this.Sacar(valor);
        contaDestino.Depositar(valor);
    }
    public int getAgencia() {
        return Agencia;
    }
    public int getNumero() {
        return Numero;
    }
    public double getSaldo() {
        return Saldo;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public String getTipoConta() {
        if (this instanceof ContaCorrente) {
            TipoConta = "Conta Corrente";
        } else if (this instanceof ContaPoupanca) {
            TipoConta = "Conta Poupança";
        } else {
            TipoConta = "Conta Desconhecida";
        }
        return TipoConta;
    }
    
    public void ExibirSaldo() {
    }
    protected void imprimirInfoConta() {
        System.out.println("=== Informações da Conta ===");
        if (cliente != null) {
            System.out.printf("Cliente: %s%n", cliente.getNome());
        } else {
            System.out.println("Cliente: Não informado");
        }
        System.out.printf("Tipo de Conta: %s%n", getTipoConta());
        System.out.printf("Agência: %d%n", Agencia);
        System.out.printf("Número: %d%n", Numero);
        System.out.printf("Saldo: %.2f%n", Saldo);
    }
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta ===");
        imprimirInfoConta();
}
}