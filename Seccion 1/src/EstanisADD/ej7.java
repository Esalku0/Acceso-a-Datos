package EstanisADD;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;

public class ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String directorio = args[0];
		File dir = new File(directorio);
		// Definimos el numero de extensiones que tiene, le quitamos 1 ya que el primero
		// no lo contamos, es la ruta
		int extensiones = args.length - 1;

		for (int i = 0; i <= extensiones; i++) {
			// Usamos la clase FilterExtension la cual le pasamos el argumento que queramos
			FilterExtension filtro = new FilterExtension(args[i]);
			// Con este string hacemos un array de string de archivos que contegan esta
			// extension
			String[] listaArchivos = dir.list(filtro);

			for (int j = 0; j < listaArchivos.length; j++) {
				System.out.println(listaArchivos[i]);
			}
		}

	}

}