package Exercícios;

import java.util.Scanner;

public class Exercício8 {

    public static void main(String[] args) {
        float saldo = 1000.00f; // Saldo inicial
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nBem-vinde à sua conta bancária!");
            System.out.println("\nSaldo atual: R$ " + saldo);

            System.out.println("\nDigite o número da operação desejada:");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Realizar Saque");
            System.out.println("3 - Realizar Depósito");
            System.out.println("4 - Sair");

            int operacao = scanner.nextInt();

            switch (operacao) {
                case 1:
                    // Consultar saldo
                    System.out.println("Saldo atual: R$ " + saldo);
                    break;
                case 2:
                	// Realizar saque
                    System.out.println("Digite o valor a ser sacado: ");
                    float saque = scanner.nextFloat();
                    if (saque > 0) {
                        if (saldo >= saque) {
                            saldo -= saque;
                            System.out.println("Saque realizado com sucesso!");
                        } else {
                            System.out.println("Saldo insuficiente para o saque.");
                        }
                    } else {
                        System.out.println("Valor de saque inválido!");
                    }
                    break;
                case 3:               
                	// Realizar depósito
                    System.out.println("Digite o valor a ser depositado: ");
                    float deposito = scanner.nextFloat();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Valor de depósito inválido!");
                    }
                    break;
                case 4:
                    // Sair do programa
                    continuar = false;
                    break;
                default:
                    System.out.println("Operação Inválida!");
            }

            System.out.println("\nNovo Saldo: R$ " + saldo);
        }

        System.out.println("Obrigado por usar nosso sistema!");
        scanner.close();
    }
}