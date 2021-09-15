package ort.edu.ar.eje4;

import java.util.ArrayList;
import java.util.Scanner;

import ort.edu.ar.eje3.CasaDeElectrodomesticos;
import ort.edu.ar.eje3.Electrodomestico;
import ort.edu.ar.eje3.Heladera;
import ort.edu.ar.eje3.Lavarropa;
import ort.edu.ar.eje3.Licuadora;
import ort.edu.ar.eje3.Televisor;

public class Test {
	static CasaDeElectrodomesticos casaDeElectrodomesticos = new CasaDeElectrodomesticos();
	static Cliente cliente = new Cliente("9999", "Delmer Rodriguez");
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		agregarElectrodomesticos();
		casaDeElectrodomesticos.mostrarCatalogo();
		comprar(cliente);
	}

	private static void comprar(Cliente cliente) {
		ArrayList<Electrodomestico> listaDeCompras = new ArrayList<>();
		int nroElectro;
		double total = 0;
		do {
			do {
				System.out.print("\nSeleccione número de Articulo: ");
				nroElectro = Integer.parseInt(input.nextLine());
				casaDeElectrodomesticos.mostrarDetalleCompleto(nroElectro - 1);
			} while (confirmarSeleccion());
			if (nroElectro > 0) {
				listaDeCompras = casaDeElectrodomesticos.agregarElectrodomesticosAlTicket(listaDeCompras,
						nroElectro - 1);
				total += casaDeElectrodomesticos.calcularPrecioTotal(nroElectro - 1);
			}
		} while (nroElectro != 0);
		Ticket ticket = cliente.agregarTicket(listaDeCompras, total);
		ticket.mostrarResumen();
	}

	private static boolean confirmarSeleccion() {
		System.out.print("Presione [-1] para confirmar: ");
		int nroConfirmar = Integer.parseInt(input.nextLine());
		return nroConfirmar != -1;
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

}
