package Exeve;
import java.util.Scanner;
public class Exe10 {

	 public static void main(String[] args) {
		    Scanner imput = new Scanner(System.in);

		    char[] caracter;
		    String texto;

		    System.out.println("\nTexto convertido");
		    System.out.print("Informe texto: ");
		    texto = imput.nextLine();

		    caracter = new char[texto.length()];

		    for (int i = 0; i < caracter.length; i++)
		      caracter[i] = texto.charAt(i);

		    System.out.println("\nResultado");
		    System.out.printf("Texto : ", texto);
		    System.out.print("\n\nTexto convertido em caracteres: \n");
		    for (char a : caracter)
		      System.out.printf("%s ", a);
		  }
}
