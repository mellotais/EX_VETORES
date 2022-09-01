package Exeve;
import java.util.Scanner;
public class Exe11 {

	public static void main(String[] args) {
	    Scanner imput = new Scanner(System.in);

	    String[] data;
	    String text = "";

	    System.out.println("\nConvertendo DATA (dd/mm/aaaa)");
	    System.out.print("Informe data (dd/mm/aaaa): ");
	    text = imput.nextLine();

	    data = text.split("/");

	    System.out.println("\nResultado");
	    System.out.printf("Dia: %s", data[0]);
	    System.out.printf("\nMês: %s", data[1]);
	    System.out.printf("\nAno: %s", data[2]);
	  }
}
