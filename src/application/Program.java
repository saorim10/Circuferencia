package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculadora;

/*
 * Fazer um programa para ler um valor numérico qualquer, e daí mostrar
   quanto seria o valor de uma circunferência e do volume de uma esfera
   para um raio daquele valor. Informar também o valor de PI com duas
   casas decimais.

 * 
 */


public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com a medida do raio: ");
		double raio = sc.nextDouble();
		System.out.println();
		
		System.out.printf("Circuferencia: %.2f%n", Calculadora.circuferencia(raio));
		System.out.printf("Volume: %.2f%n", Calculadora.volume(raio));
		System.out.printf("Valor de PI: %.2f%n", Calculadora.PI);
		
		sc.close();
	}
}
