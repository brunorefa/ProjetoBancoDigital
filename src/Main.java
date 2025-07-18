public class Main {
    public static void main(String[] args) {
    Cliente bruno = new Cliente("Bruno");
    bruno.setNome("Bruno");

    Conta conta1 = new ContaCorrente(bruno);

    Emprestimo emprestimo = new Emprestimo(10000, 1.5, 24);
    
    System.out.println();
    conta1.imprimirExtrato();
    System.out.println();
    emprestimo.emprestimoInfo();
    System.out.println();
    emprestimo.calcularParcelas();
}
}
