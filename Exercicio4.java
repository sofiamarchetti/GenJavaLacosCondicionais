package LacosDeDecisoes;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String palavra1,palavra2,palavra3;
		
		System.out.println("\nEntre com a primeira palavra: ");
		palavra1 = ler.nextLine();
		System.out.println("\nEntre com a segunda palavra: ");
		palavra2 = ler.nextLine();
		System.out.println("\nEntre com a terceira palavra: ");
		palavra3 = ler.nextLine();
		
		if(palavra1.equalsIgnoreCase("vertebrado")) {
			if(palavra2.equalsIgnoreCase("ave")) {
				if(palavra3.equalsIgnoreCase("carnivoro")) {
					System.out.println("\nÉ uma Águia");
				}else {
					System.out.println("\nÉ uma Pomba");
				}
			}else {
				if(palavra3.equalsIgnoreCase("onívoro")) {
					System.out.println("\nÉ um Ser Humano");
				}else {
					System.out.println("\nÉ uma Vaca");
				}
			}
		}else {
			if(palavra2.equalsIgnoreCase("inseto")) {
				if(palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("\nÉ uma Pulga");
				}else {
					System.out.println("\nÉ uma Lagarta");
				}
			}else {
				if(palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("\nÉ uma Sanguessuga");
				}else {
					System.out.println("\nÉ uma Minhoca");
				}
			}
		}
	}
}