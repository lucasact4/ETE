// Ler uma temperatura em graus Fahrenheit e apresent�-Ia convertida em graus Celsius. A f�rmula de convers�o de temperatura
// a ser utilizada � C = (F - 32) * 5 / 9, em que a vari�vel F � a temperatura em graus Fahrenheit e a vari�vel C � a
// temperatura em graus Celsius.
import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		System.out.println("Eae, vamos converter Graus Fahrenheit para Graus Celcius ?");
		Scanner novo = new Scanner(System.in);
		System.out.print("Digite a temperatura em Graus Farenheit: F�");
		double faren = novo.nextDouble();
		System.out.print("A temeratura F�" + faren + "em Graus Celcius �: C�" + (faren - 32) * 5 / 9);
		novo.close();
	}
}
