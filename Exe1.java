package Exeve;
	import java.util.Scanner;

	public class Exe1 {

		  public static void main(String[] args) {
			    Scanner imput = new Scanner(System.in);

			    final int TAM = 5;

			    int[] vet = new int[TAM];

			    System.out.println("\nVetor primário");
			    for (int i = 0; i < TAM; i++) {
			      System.out.print("Informe número inteiro: ");
			      vet[i] = (int)imput.nextDouble();
			    }

			    for (int i = 0; i < TAM; i++)
			      System.out.printf("%d ", vet[i]);
			  }
			}
