import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class Main {
	public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub
		System.out.println("Escoga un archivo para traducir: \n\n");
		String txt="1";
		Scanner teclado = new Scanner(System.in);
		Texto miTexto = new Texto();
		String lecTrad= trad.lectura();
		boolean cierto = true;

		while(bandera){
			System.out.println("Seleccione el arbon que quiera usar:\n1.2-3 \n2.Splay Tree");
			txt= teclado.nextLine();

			if (txt.equals("1") || txt.equals("2")){
				cierto=false;

			}else{
				System.out.println("\nLa opcion que ha ingresado es invalida: ");
			}
		}
		trad.setTree(txt);
		trad.s();
		System.out.println(miTexto.traduccion(lecTrad));
	}
}