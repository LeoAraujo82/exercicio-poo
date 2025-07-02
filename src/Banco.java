import java.util.Scanner;

public class Banco {
  private   String titular;
  private String numeroConta;
  private double saldo;

  Banco(String titular, String numeroConta, double saldo) {
    this.titular = titular;
    this.numeroConta = numeroConta;
    this.saldo = saldo;

    do {
      System.out.println("\n--- MENU ---");
      System.out.println("1 - Criar conta");
      System.out.println("2 - Depositar");
      System.out.println("3 - Sacar");
      System.out.println("4 - Ver saldo");
      System.out.println("0 - Sair");
      System.out.print("Escolha: ");
      opcao = sc.nextInt();

      switch (opcao) {
        case 1:
          sc.nextLine(); // limpar buffer
          System.out.print("Nome do titular: ");
          String nome = sc.nextLine();
          conta = new Conta(nome);
          System.out.println("Conta criada com sucesso!");
          break;

        case 2:
          if (conta != null) {
            System.out.print("Valor para depositar: ");
            double dep = sc.nextDouble();
            conta.depositar(dep);
          } else {
            System.out.println("Crie uma conta primeiro!");
          }
          break;

        case 3:
          if (conta != null) {
            System.out.print("Valor para sacar: ");
            double saque = sc.nextDouble();
            conta.sacar(saque);
          } else {
            System.out.println("Crie uma conta primeiro!");
          }
          break;

        case 4:
          if (conta != null) {
            conta.mostrarSaldo();
          } else {
            System.out.println("Crie uma conta primeiro!");
          }
          break;

        case 0:
          System.out.println("Encerrando...");
          break;

        default:
          System.out.println("Opção inválida!");
      }
    } while (opcao != 0);

    sc.close();
  }
  public String getTitular() {
    return titular;
  }

  public String getNumeroConta() {
    return numeroConta;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }
}
