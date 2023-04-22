package LacosDeDecisoes;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String nome;
		int cargo;
		float salario;
		double NovoSalario;
		
		System.out.println("*Funções*");
		System.out.println("\nCód. 1 - Gerente - 10%");
		System.out.println("Cód. 2 - Vendedor - 7%");
		System.out.println("Cód. 3 - Supervisor - 9%");
		System.out.println("Cód. 4 - Motorista - 6%");
		System.out.println("Cód. 5 - Estoquista - 5%");
		System.out.println("Cód. 6 - Técnico de TI - 8%");
		System.out.println("\nNome do colaborador:");
		nome = ler.nextLine();
		System.out.println("\nCódigo do cargo:");
		cargo = ler.nextInt();
		System.out.println("\nSalário atual:");
		salario = ler.nextInt();
		
		switch(cargo) {
		case 1:
			NovoSalario = salario + (0.10 * salario);
			System.out.println("\nSalário reajustado: R$ "+NovoSalario);
			break;
		case 2:
			NovoSalario = salario + (0.07 * salario);
			System.out.println("\nSalário reajustado: R$ "+NovoSalario);
			break;
		case 3:
			NovoSalario = salario + (0.09 * salario);
			System.out.println("\nSalário reajustado: R$ "+NovoSalario);
			break;
		case 4:
			NovoSalario = salario + (0.06 * salario);
			System.out.println("\nSalário reajustado: R$ "+NovoSalario);
			break;
		case 5:
			NovoSalario = salario + (0.05 * salario);
			System.out.println("\nSalário reajustado: R$ "+NovoSalario);
			break;
		case 6:
			NovoSalario = salario + (0.08 * salario);
			System.out.println("\nSalário reajustado: R$ "+NovoSalario);
			break;
		default:
			System.out.println("\nCódigo inválido");
		}
	}
}