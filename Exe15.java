package Exeve;
import java.util.Sacnner;
public class Exe15 {
	public static void main(String[] args) {
	    Scanner imput = new Scanner(System.in);

	    final int TAM = 3;

	    float[] altura = new float[TAM];
	    int[] idade    = new int[TAM];
	    float media    = 0;
	    int cont       = 0;

	    System.out.println("\nAltura média");
	    for (int i = 0; i < TAM; i++) {
	      System.out.print("Informe idade: ");
	      idade[i] = (int)imput.nextDouble();
	      System.out.print("Informe altura: ");
	      altura[i] = (float)imput.nextDouble();
	      media += altura[i];
	    }
	    media /= TAM;

	    for (int i = 0; i < TAM; i++)
	      if (idade[i] >= 13 && altura[i] <= media)
	        cont++;

	    System.out.println("\nResultado");
	    System.out.printf("Alunos com 13 anos abaixo da média de altura da turma %d", cont);

	  }
}

	