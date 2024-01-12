package Servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OperativaImplementacion implements OperativaInterfaz {

	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public void pideYAlmacena(List<Integer> listaEnteros) {
		
		
		System.out.println("Introduzca una cantidad de numeros enteros");
		int numEntero = sc.nextInt();
		
		listaEnteros.add(numEntero);
		
	}

	@Override
	public void mostrarLista1(List<Integer> listaEnteros ) {
		
		for(Integer cadena : listaEnteros) {
			
			System.out.println(cadena);
		}
		
	}

	@Override
	public void intercambiarPosicion(List<Integer> listaEnteros) {
		
		//Al hacer la auxiliar guardo el valor inicial de la posicion 2
		int aux = listaEnteros.get(2);
		
		//Si no uso la auxiliar el valor 2 no se intercambia con la 4,
		//ya que se pisaria.
		
		listaEnteros.set(2, listaEnteros.get(4));
		listaEnteros.set(4, aux);
		
		int posicion = listaEnteros.get(4);
		
		listaEnteros.set(4, listaEnteros.get(2));
		listaEnteros.set(2, posicion);
	}

	@Override
	public void mostrarLista2(List<Integer> listaEnteros) {
		
		for(int i = 0; i < listaEnteros.size(); i++) {
			
			System.out.println(listaEnteros.get(i));
		}
		
	}

}
