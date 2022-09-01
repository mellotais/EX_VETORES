package Exeve;
import java.util.Scanner;
public class Exe4 {

	public static void main(String[] args) {
	    Scanner imput = new Scanner(System.in);

	    final int TAM = 4;

	    float[] nota = new float[TAM];
	    float media  = 0;

	    System.out.println("\nMédia de notas");
	    for (int i = 0; i < TAM; i++) {
	      System.out.printf("Informe nota %d: ", (i + 1));
	      nota[i] = imput.nextFloat();
	      media += nota[i];
	    }

	    media /= TAM;

	    System.out.println("\nResultado");
	    System.out.print("Notas: \n");
	    for (float n : nota)
	      System.out.printf("%.1f  ", n);
	    System.out.printf("\nMédia: %.1f", media);
	  }
}
