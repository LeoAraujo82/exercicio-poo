import java.util.Scanner;

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


class Conta {
  String nome;
  double saldo;

  Conta(String nome) {
    this.nome = nome;
    this.saldo = 0;
  }

  void depositar(double valor) {
    saldo += valor;
  }

  void sacar(double valor) {
    if (valor <= saldo) {
      saldo -= valor;
    } else {
      System.out.println("Saldo insuficiente");
    }
  }

  void mostrarSaldo() {
    System.out.println("Saldo de " + nome + ": R$ " + saldo);
  }
}

