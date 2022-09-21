package EstanisADD;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String directorio = args[0];
		File fichero = new File(args[1]);
		Scanner entrada = new Scanner(System.in);
		System.out.println("Nombre del nuevo fichero: ");
		File newfile = new File(entrada.toString());

		File fiche;

		try {
			fichero.createNewFile();
			fichero.renameTo(newfile);
			fiche = new File(newfile.toString());
			System.out.println("Nombre: " + fichero.getName());
			fichero.delete();
			System.out.println("Nombre: " + fichero.exists());

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}