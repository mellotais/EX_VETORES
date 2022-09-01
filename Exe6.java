package Exeve;
import java.util.Scanner;
public class Exe6 {

	 public static void main(String[] args) {
		    Scanner imput = new Scanner(System.in);

		    final int TAM = 20;

		    List<Integer> numero = new ArrayList<>();
		    List<Integer> par    = new ArrayList<>();
		    List<Integer> impar  = new ArrayList<>();

		    System.out.println("\nNúmeros pares e ímpares");
		    while (numero.size() < TAM) {
		      System.out.printf("Informe número inteiro: ");
		      numero.add((int)imput.nextDouble());
		    }

		    for (int n : numero) {
		      if (n % 2 == 0)
		        par.add(n);
		      else
		        impar.add(n);
		    }

		    System.out.println("\nResutlados");
		    System.out.print("Números: ");
		    for (int n : numero)
		      System.out.printf("%d ", n);
		    System.out.print("\nPares: ");
		    for (int n : par)
		      System.out.printf("%d ", n);
		    System.out.print("\nÍmpares: ");
		    for (int n : impar)
		      System.out.printf("%d ", n);
		  }
}
