package Exeve;
import java.util.Scanner;
public class Exe12 {

	public static void main(String[] args) {
	    Scanner imput = new Scanner(System.in);

	    String[] palavra;
	    String text = "";

	    System.out.println("\nSeparando palavras por ;");
	    System.out.print("Informe texto: ");
	    text = imput.nextLine();

	    palavra = text.split(";");

	    System.out.println("\nResultado");
	    System.out.printf("Palavras: \n");
	    for (String s : palavra)
	      System.out.printf("\n%s ", s);
	  }
}
