public class Emprestimo {
    private double valorEmprestimo;
    private double taxaJurosMensal;
    private int numeroParcelas;

    public Emprestimo(double valorEmprestimo, double taxaJurosMensal, int numeroParcelas) {
        this.valorEmprestimo = valorEmprestimo;
        this.taxaJurosMensal = taxaJurosMensal;
        this.numeroParcelas = numeroParcelas;
    }

    public double calcularValorParcela() {
        double taxa = taxaJurosMensal / 100.0;
        if (taxa == 0) {
            return valorEmprestimo / numeroParcelas;
        }
        double fator = Math.pow(1 + taxa, numeroParcelas);
        return valorEmprestimo * taxa * fator / (fator - 1);
    }

    public double calcularValorTotalAPagar() {
        return calcularValorParcela() * numeroParcelas;
    }

    // Getters e Setters
    public double getValorEmprestimo() {
        return valorEmprestimo;
    }

    public void setValorEmprestimo(double valorEmprestimo) {
        this.valorEmprestimo = valorEmprestimo;
    }

    public double getTaxaJurosMensal() {
        return taxaJurosMensal;
    }

    public void setTaxaJurosMensal(double taxaJurosMensal) {
        this.taxaJurosMensal = taxaJurosMensal;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public void emprestimoInfo() {
        System.out.println("=== Detalhes do Empréstimo ===");
        System.out.println("Valor do Empréstimo: R$ " + String.format("%.2f", valorEmprestimo));
        System.out.println("Taxa de Juros Mensal: " + taxaJurosMensal + "%");
        System.out.println("Número de Parcelas: " + numeroParcelas);
        System.out.println("Valor da Parcela: R$ " + String.format("%.2f", calcularValorParcela()));
    }

    public void calcularParcelas() {
        System.out.println("=== Calculando parcelas do empréstimo ===");
        System.out.println("Valor da Parcela: R$ " + String.format("%.2f", calcularValorParcela()));
        System.out.println("Número de Parcelas: " + numeroParcelas);
        System.out.println("Valor Total a Pagar: R$ " + String.format("%.2f", calcularValorTotalAPagar()));
    }
}