// Escreva um programa que leia quatro notas escolares de um aluno e apresentar uma mensagem que o
// aluno foi aprovado se o valor da m�dia escolar for maior ou igual a 7. Se o valor da m�dia for
// menor que 7, solicitar a notado recupera��o, somar com o valor da m�dia e obter a nova m�dia.
// Se a nova m�dia for maior ou igual a 7,apresentar uma mensagem informando que o aluno foi
// aprovado na recupera��o. Se o aluno n�o foi aprovado, apresentar uma mensagem informando
// esta condi��o. Apresentar junto com as mensagens o valor da m�dia do aluno.
import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		System.out.println("Eae, vamos calcular a m�dia do aluno ?");
		Scanner novo = new Scanner(System.in);
		System.out.print("Digite a 1� nota do aluno: ");
		double nota1 = novo.nextDouble();
		System.out.print("Digite a 2� nota do aluno: ");
		double nota2 = novo.nextDouble();
		System.out.print("Digite a 3� nota do aluno: ");
		double nota3 = novo.nextDouble();
		System.out.print("Digite a 4� nota do aluno: ");
		double nota4 = novo.nextDouble();
		double media1 = (nota1 + nota2 + nota3 + nota4) / 4;
		if (media1 >= 7) {
			System.out.println("Aluno Aprovado !\nSua m�dia: " + media1);
		}
		if (media1 < 7) {
			System.out.print("Voc� n�o atingiu uma nota maior ou igual a 7.0.\nPor favor, digite a sua nota de recupera��o: ");
			double rec = novo.nextDouble();
			double media2 = media1 + rec;
			if (media2 >= 7) {
				System.out.println("Aluno Aprovado !\nSua m�dia: " + media2);
			}
			else {
				System.out.println("Aluno Reprovado !\nSua m�dia: " + media2);
			}
				
		}
		novo.close();
	}
}
