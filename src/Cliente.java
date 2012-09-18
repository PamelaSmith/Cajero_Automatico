import java.util.Scanner;

public class Cliente {


	public static void main (String[] args) {
		String TarjCredito; 
		String Clave;
		System.out.print("Digite su numero de cuenta: ");

		Scanner scan = new Scanner (System.in);

		//ArrayList lista = new ArrayList();


		TarjCredito = scan.next();
		//System.out.println(TarjCredito);
		System.out.print("Digite su clave: ");
		Clave = scan.next(); 		
		//System.out.println(Clave);


	}
}