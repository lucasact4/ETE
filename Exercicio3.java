// Ler uma temperatura em graus Celsius e apresent�-Ia convertida em graus Fahrenheit. A f�rmula de convers�o de
// temperatura a ser utilizada � F = (9 * C + 160) / 5, em que a vari�vel F representa � a temperatura
// em graus Fahrenheit e a vari�vel C representa � a temperatura em graus Celsius.
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		System.out.println("Eae, vamos converter Graus Celcius para Graus Fahrenheit ?");
		Scanner novo = new Scanner(System.in);
		System.out.print("Digite a temperatura em Graus Celcius: C�");
		double celcius = novo.nextDouble();
		System.out.print("A temeratura C�" + celcius + "em Graus Farenheit �: F�" + (9 * celcius + 160) / 5);
		novo.close();
	}
}
