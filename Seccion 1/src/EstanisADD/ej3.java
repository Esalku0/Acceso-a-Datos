package EstanisADD;

import java.io.File;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File fichero = new File(args[0]);
		
		if (fichero.exists()) {
			System.out.println("Nombre: " + fichero.getName());
			System.out.println("Ruta absoluta: " + fichero.getAbsolutePath());
			System.out.println("Ruta relativa: " + fichero.getPath());
			System.out.println("Tamaño: " + fichero.length());
			System.out.println("Puede ejecutarse: " + fichero.canExecute());
		} else {
			System.out.println("No va");
		}
		

	}

}
