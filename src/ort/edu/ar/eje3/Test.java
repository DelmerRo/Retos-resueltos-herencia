package ort.edu.ar.eje3;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	private static Scanner input = new Scanner(System.in);
	static CasaDeElectrodomesticos casaDeElectrodomesticos = new CasaDeElectrodomesticos();

	public static void main(String[] args) {
		agregarElectrodomesticos();
		casaDeElectrodomesticos.mostrarCatalogo();
		comprar();
	}

	private static void agregarElectrodomesticos() {
		casaDeElectrodomesticos
				.agregarElectrodomestico(new Televisor("Samsung", "l700", "1111", false, 220, false, 50000, 43));
		casaDeElectrodomesticos
				.agregarElectrodomestico(new Televisor("Lg", "kl120", "1234", true, 220, true, 43000, 32));
		casaDeElectrodomesticos
				.agregarElectrodomestico(new Televisor("Noblex", "N147", "1254", true, 220, true, 34000, 32));

		casaDeElectrodomesticos.agregarElectrodomestico(new Lavarropa("Lg", "M12", "741", true, 220, false, 80000, 8));
		casaDeElectrodomesticos
				.agregarElectrodomestico(new Lavarropa("Drean", "M14", "852", false, 220, false, 40000, 6));

		casaDeElectrodomesticos
				.agregarElectrodomestico(new Heladera("Patrick", "P12", "1225454", false, 220, false, 80000, 258));
		casaDeElectrodomesticos
				.agregarElectrodomestico(new Heladera("Drean", "M14", "852", false, 220, false, 40000, 6));

		casaDeElectrodomesticos
				.agregarElectrodomestico(new Licuadora("Oster", "O14", "1254", 220, false, 15000, 800, 6));
		casaDeElectrodomesticos
				.agregarElectrodomestico(new Licuadora("Moulinex", "M147", "258741", 220, false, 1500, 600, 3));
		casaDeElectrodomesticos
				.agregarElectrodomestico(new Licuadora("Liliana", "L14", "125895", 220, false, 8000, 700, 5));
	}

	private static void comprar() {
		ArrayList<Electrodomestico> ticket = new ArrayList<>();
		ArrayList<Electrodomestico> listaDeElectrodomesticos = casaDeElectrodomesticos
				.obtenerListaDeElectrodomesticos();
		int nroElectro;
		int total = 0;
		int nroConfirmar;
		do {
			do {
				System.out.print("\nSeleccione número de Articulo: ");
				nroElectro = Integer.parseInt(input.nextLine());
				if (nroElectro > 0) {
					System.out.println(listaDeElectrodomesticos.get(nroElectro - 1).detalleCompleto());
				}
				System.out.print("Presione [-1] para confirmar: ");
				nroConfirmar = Integer.parseInt(input.nextLine());
			} while (nroConfirmar != -1);
			if (nroElectro > 0) {
				ticket.add(listaDeElectrodomesticos.get(nroElectro - 1));
				total += listaDeElectrodomesticos.get(nroElectro - 1).getPrecio();
			}
		} while (nroElectro != 0);
		casaDeElectrodomesticos.mostrarResumenDeTicket(ticket, total);
	}
}