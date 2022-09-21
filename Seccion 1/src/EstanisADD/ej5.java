package EstanisADD;

import java.io.File;
import java.io.FileFilter;

public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String  directorio = args[0];
		String extension = args[1];
		File dir = new File(directorio);
		String[] listaArchivos = dir.list();
		
		for (int i = 0; i < listaArchivos.length; i++) {
			if (listaArchivos[i].endsWith(extension)) {
				System.out.println(listaArchivos[i]);
			}
		}
		
		
	}
}
