// Fa�a um programa para calcular o estoque m�dio de uma pe�a, sendo que: ESTOQUE M�DIO = (QUANTIDADE_M�NIMA + QUANTIDADE_M�XIMA) / 2.
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		System.out.println("Eae, vamos calcular o estoque m�dio de uma pe�a ?");
		Scanner novo = new Scanner(System.in);
		System.out.print("Digite a quantidade m�nima: ");
		int Qminima = novo.nextInt();
		System.out.print("Digite a quantidade m�xima: ");
		int Qmaximo = novo.nextInt();
		System.out.println("Estoque m�dio: " + (Qminima+Qmaximo)/2);
		novo.close();
	}
}
