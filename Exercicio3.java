package LacosDeDecisoes;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		boolean apto = false;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do doador: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("É sua primeira doação de sangue na vida? ");
		apto = leia.nextBoolean();
		
		if (idade >= 18 && idade <= 69)
			if (idade >= 60 && idade <= 69 && apto == true) {
                System.out.println(nome+" **não está** apto para doar sangue!");
            } else {
                System.out.println(nome+" **está** apto para doar sangue!");
            }
        else {
            System.out.println(nome+" **não está** apto para doar sangue!");
        }
	}
}