// Fa�a um programa que leia um n�mero. Se positivo armazene-o em A, se for negativo, em B. No final mostrar o resultado.
import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		Scanner novo = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		double num = novo.nextDouble();
		if (num >= 0) {
			System.out.println("N�mero Positivo !\nArmazenando na vari�vel 'A'.");
			double A = num;
			System.out.println("N�mero: " + A);
		}
		else {
			System.out.println("N�mero Negativo !\nArmazenando na vari�vel 'B'.");
			double B = num;
			System.out.println("N�mero: " + B);
		}
		novo.close();
	}
}
