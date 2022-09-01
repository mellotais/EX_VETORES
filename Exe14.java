package Exeve;
import java.util.Scanner;
public class Exe14 {

	public static void main(String[] args) {
	    Scanner imput = new Scanner(System.in);

	    final int TAM = 5;

	    double[] vet1 = new double[TAM];
	    double[] vet2 = new double[TAM];
	    double[] vet3 = new double[TAM * 2];

	    System.out.println("\nIntercalando vetores");
	    System.out.println("Vetor 01");
	    for (int i = 0; i < TAM; i++) {
	      System.out.print("Informe valores:");
	      vet1[i] = imput.nextDouble();
	    }
	    System.out.println("Vetor 02");
	    for (int i = 0; i < TAM; i++) {
	      System.out.print("Informe valores:");
	      vet2[i] = imput.nextDouble();
	    }

	    for (int i = 0; i < vet3.length; i++) {
	      if (i % 2 == 0)
	        vet3[i] = vet1[i / 2];
	      else
	        vet3[i] = vet1[i/ 3];
	    }

	    System.out.println("\nResultado");
	    System.out.print("Vetor 01: ");
	    for (double d : vet1)
	      System.out.printf("%.2f ", d);
	    System.out.print("\nVetor 02: ");
	    for (double d : vet2)
	      System.out.printf("%.2f ", d);
	    System.out.print("\nVetor intercalado: ");
	    for (double d : vet3)
	      System.out.printf("%.2f ", d);
	  }
	}
