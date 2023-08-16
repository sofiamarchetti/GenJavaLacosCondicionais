package LacosDeDecisoes;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		boolean apte = false;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome da pessoa que vai realizar a doação: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a idade da pessoa que vai realizar a doação: ");
		idade = leia.nextInt();
		
		System.out.println("É sua primeira doação de sangue na vida? ");
		apte = leia.nextBoolean();
		
		if (idade >= 18 && idade <= 69)
			if (idade >= 60 && idade <= 69 && apte == true) {
                System.out.println(nome+" **não está** apte para doar sangue!");
            } else {
                System.out.println(nome+" **está** apte para doar sangue!");
            }
        else {
            System.out.println(nome+" **não está** apte para doar sangue!");
        }
	}
}