package Exeve;
import java.util.Scanner;
public class Exe8 {

	public static void main(String[] args) {
	    Scanner imput = new Scanner(System.in);
	    final int TAM = 5;

	    List<Integer> numero = new ArrayList<>();
	    int soma = 0;
	    int mult = 1;

	    System.out.println("\nNúmeros pares e ímpares");
	    while (numero.size() < TAM) {
	      System.out.printf("forme número inteiro: ");
	      numero.add((int)imput.nextDouble());
	    }

	    System.out.println("\nResutlados");
	    System.out.print("Números: ");
	    for (int n : numero) {
	      System.out.printf("%d ", n);
	      soma += n;
	      mult *= n;
	    }
	    System.out.printf("\nSoma: %d", soma);
	    System.out.printf("\nMultiplicação: %d", mult);
	  }
}
