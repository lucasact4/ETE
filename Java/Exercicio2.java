// Fa�a um programa que: Leia a cota��o do d�lar, Leia um valor em d�lares, Converta esse valor para Real, Mostre o resultado.
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		System.out.println("Eae, vamos calcular a cota��o do d�lar e converte-lo em real ?");
		Scanner novo = new Scanner(System.in);
		System.out.print("Digite a cota��o do d�lar: ");
		double cotacao = novo.nextDouble();
		System.out.print("Digite o valor em d�lar que deseja converter para real: ");
		double dolar = novo.nextDouble();
		System.out.println("Com " + dolar + " D�lares voc� consegue comprar R$" + dolar/cotacao);
		novo.close();
	}
}
