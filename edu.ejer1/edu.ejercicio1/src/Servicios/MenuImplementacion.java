package Servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {

	@Override
	public int mostrarMenuYSeleccion() {
		int opcionIntroducida;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("###############################");
		System.out.println("0. Cerrar menu");
		System.out.println("1. funcionalidad 1");
		System.out.println("2. funcionalidad 2");
		System.out.println("3. funcionalidad 3");
		System.out.println("4. funcionalidad 4");
		System.out.println("###############################");

		opcionIntroducida = sc.nextInt();
		
		return opcionIntroducida;
	}

}
