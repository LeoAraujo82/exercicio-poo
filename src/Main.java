public class Main {
  public static void main(String[] args) {
    System.out.println("Bem vindo a sua conta bancária ");

    ContaBancaria conta = new ContaBancaria();
    conta.saldo = 100.00;
    conta.mostrarSaldo();
    conta.depositar(500.00);
    conta.mostrarSaldo();
    conta.sacar(300.00);
    conta.mostrarSaldo();
    conta.sacar(1000.00);
    conta.mostrarSaldo();
  }
}