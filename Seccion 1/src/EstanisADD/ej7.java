package EstanisADD;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String directorio = args[0];
		String extension;

		if (args.length <= 1) {
			extension = null;
		} else {
			extension = args[1];
		}

		//Este es el directorio que recorremos, le pasamos la ruta a dir
		//luegos hacemos un string de listaarchivos que es un string de todo lo que tenemos en nuestra ruta
		//lo recorremos con un for y nos visualiza todo lo que tenemos
		File dir = new File(directorio);
		String[] listaArchivos = dir.list();

		
		for (int i = 0; i < listaArchivos.length; i++) {

			if (extension == null) {
				System.out.println(listaArchivos[i]);
				
			} else {
				//Comprobacion de listaarchivos que son todos los ficheros de nuestro directorio, usamos .endsWidth 
				//Si tiene extension nos pondra todos los ficheros con dicha extension
				if (listaArchivos[i].endsWith(args[i])) {
					System.out.println(listaArchivos[i]);
				}
			}

		}
		
		
		

	}

}