package Controladores;

import java.util.ArrayList;
import java.util.List;

import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;
import Servicios.OperativaImplementacion;
import Servicios.OperativaInterfaz;

public class inicio {

	public static void main(String[] args) {
		
		List<Integer> listaEnteros = new ArrayList<>();
		OperativaInterfaz oi = new OperativaImplementacion();
		MenuInterfaz mi = new MenuImplementacion();
		boolean cerrarMenu = false;
		int opcionIntroducida;
		while (!cerrarMenu) {
			
			opcionIntroducida = mi.mostrarMenuYSeleccion();
					switch(opcionIntroducida) {
					
						case 0:
							cerrarMenu = true;
							break;
						case 1:
							oi.pideYAlmacena(listaEnteros);
							break;
						case 2:
							oi.mostrarLista1(listaEnteros);
							break;
						case 3:
							oi.intercambiarPosicion(listaEnteros);
							break;
						case 4:
							oi.mostrarLista2(listaEnteros);
							break;
							
						default:
							System.out.println("La opcion seleccionada no existe");
							break;
							
					}
		}

	}

}
