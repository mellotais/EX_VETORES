package Exeve;
import java.util.Scanner;
public class Exe7 {

	public static void main(String[] args) {
	    Scanner imput = new Scanner(System.in);

	    final int TAM  = 2;
	    final int NOTA = 4;

	    float[] media = new float[TAM];
	    int cont      = 0;

	    System.out.println("\nMédia dos alunos");
	    for (int i = 0; i < TAM; i++) {
	      System.out.printf("\nAluno %d\n", (i + 1));
	      for (int j = 0; j < NOTA; j++) {
	        System.out.printf("Informe nota %d: ", (j + 1));
	        media[i] += imput.nextFloat();
	      }
	      media[i] /= NOTA;
	    }

	    System.out.println("\nResultado");
	    System.out.print("Médias: ");
	    for (float m : media) {
	      System.out.printf("%.1f ", m);
	      if (m >= 7)
	        cont++;
	    }
	    System.out.printf("\nAlunos acima da média; %d", cont);
	  }
}
