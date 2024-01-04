package br.com.erickfreire.aritmeticamaiormenor;

import java.util.Scanner;

public class AritmeticaMaiorMenor {

	public static void main(String[] args) {
		int numero1;
		int numero2;
		int numero3;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que calcula a aritmética, verifica o maior e o menor valor digitado: ");
		System.out.print("Digite o primeiro valor: ");
		numero1 = entrada.nextInt();
		System.out.print("Digite o segundo valor: ");
		numero2 = entrada.nextInt();
		System.out.print("Digite o terceiro valor: ");
		numero3 = entrada.nextInt();
		
		System.out.printf("%n%nSoma: %d", numero1 + numero2 + numero3);
		System.out.printf("%nMédia: %d", ((numero1 + numero2 + numero3)/3));
		System.out.printf("%nProduto: %d", numero1 * numero2 * numero3);
		
		if(numero1 > numero2)
			if(numero1 > numero3)
				System.out.printf("%nO Primeiro valor é o maior: %d", numero1);
		
		if(numero2 > numero1)
			if(numero2 > numero3)
				System.out.printf("%nO Segundo valor é o maior: %d", numero2);
		
		if(numero3 > numero1)
			if(numero3 > numero2)
				System.out.printf("%nO Terceiro valor é o maior: %d", numero3);
		
		if(numero1 < numero2)
			if(numero1 < numero3)
				System.out.printf("%nO Primeiro valor é o menor: %d", numero1);
		
		if(numero2 < numero1)
			if(numero2 < numero3)
				System.out.printf("%nO Segundo valor é o menor: %d", numero2);
		
		if(numero3 < numero1)
			if(numero3 < numero2)
				System.out.printf("%nO Terceiro valor é o menor: %d", numero3);

	}

}
