package Exeve;
import java.util.Scanner;
public class Exe5 {

	public static void main(String[] args) {
	    Scanner imput = new Scanner(System.in);

	    final int TAM      = 10;
	    final char[] VOGAL = {'a', 'e', 'i', 'o', 'u'};

	    char[] letra  = new char[TAM];
	    boolean vogal = false;
	    int cont      = 0;

	    System.out.println("\nConsoantes");
	    for (int i = 0; i < TAM; i++) {
	      System.out.print("Informe letra: ");
	      letra[i] = imput.next().toLowerCase().charAt(0);
	    }

	    System.out.println("\nResultado");
	    for (char a : letra) {
	      for (char b : VOGAL)
	        if (a == b) {
	          vogal = !vogal;
	          break;
	        }
	      if (!vogal) {
	        System.out.printf("%s ", a);
	        cont++;
	      } else
	        vogal = false;
	    }
	    System.out.printf("\nConsoantes: %d", cont);
	  }
}
