package ort.edu.ar.eje3;

import java.util.ArrayList;
import ort.edu.ar.eje4.Ticket;

public class CasaDeElectrodomesticos {
	private ArrayList<Electrodomestico> electrodomesticos;
	public CasaDeElectrodomesticos() {
		super();
		this.electrodomesticos = new ArrayList<>();
	}

	public void agregarElectrodomestico(Electrodomestico e) {
		this.electrodomesticos.add(e);
	}

	public void mostrarCatalogo() {
		for (int i = 0; i < this.electrodomesticos.size(); i++) {
			Electrodomestico e = this.electrodomesticos.get(i);
			System.out.println(i + 1 + ": " + e.getClass().getSimpleName() + " " + e.getMarca() + " " + e.getModelo());
		}

	}

	public ArrayList<Electrodomestico> obtenerListaDeElectrodomesticos() {
		ArrayList<Electrodomestico> lista = new ArrayList<>();
		for (Electrodomestico e : this.electrodomesticos) {
			lista.add(e);
		}
		return lista;
	}

	public void mostrarResumenDeTicket(ArrayList<Electrodomestico> ticket, int total) {
		System.out.println("///////////////////////////////////////////////////\nTicket de Venta");
		System.out.println("ARTICULOS");
		for (Electrodomestico e : ticket) {
			System.out.println(e.mostrarResumen());
		}
		System.out.println("Total: $" + total + "\n///////////////////////////////////////////////");
	}

	public void mostrarDetalleCompleto(int nroElectro) {
		if (nroElectro >= 0) {
			System.out.println(this.electrodomesticos.get(nroElectro).detalleCompleto());
		} else {
			System.out.println("Numero fuera de Rango");
		}
	}

	public ArrayList<Electrodomestico> agregarElectrodomesticosAlTicket(ArrayList<Electrodomestico> listaDeProductos, int nroElectro) {
		listaDeProductos.add(this.electrodomesticos.get(nroElectro));
		return listaDeProductos;

	}

	public double calcularPrecioTotal(int nroElectro) {
		double total = +this.electrodomesticos.get(nroElectro).getPrecio();
		return total;
	}

	public void agregarTicket(ArrayList<Electrodomestico> electros, double total) {
	 new Ticket(electros,total);
	}

	public void mostrarResumen(ArrayList<Electrodomestico> listaDeCompras) {
		int total=0;
		System.out.println("///////////////////////////////////////////////////\nTicket de Venta");
		System.out.println("ARTICULOS");
		for (Electrodomestico e : listaDeCompras) {
			System.out.println(e.mostrarResumen());
			total+=e.getPrecio();	
		}
		System.out.println("Total: $" + total + "\n///////////////////////////////////////////////");
		
	}

}
