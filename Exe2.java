package Exeve;
import java.util.Scanner;
public class Exe2 {
		  public static void main(String[] args) {
		    Scanner imput = new Scanner(System.in);

		    final int TAM = 10;

		    double[] vet = new double[TAM];

		    System.out.println("\nVetor de reais invertidos");
		    for (int i = 0; i < TAM; i++) {
		      System.out.print("Informe número: ");
		      vet[i] = imput.nextDouble();
		    }

		    for (int i = TAM - 1; i >= 0; i--)
		      System.out.printf("%.1f ", vet[i]);
		  }
		}
