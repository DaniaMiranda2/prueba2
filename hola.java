package holamundo3;
//esto lo hizo dania
//comentario 2
import java.util.Scanner;

public class hola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		System.out.println("Cómo te llamas?");
		Scanner entrada = new Scanner(System.in);
		String nombre=entrada.next();
		byte edad = entrada.nextByte();
		System.out.println("Hola "+nombre+" Bienvenida a la programación");
        System.out.printf("%s%s%s","Hola ",nombre," Bienvenida a la programación");
	}

}
