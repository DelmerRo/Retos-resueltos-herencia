package ort.edu.ar.eje4;

import java.util.ArrayList;

import ort.edu.ar.eje3.Electrodomestico;

public class Ticket {
	private double total;
	private ArrayList<Electrodomestico> lista;

	public Ticket(ArrayList<Electrodomestico> ticket, double total) {
		super();
		this.total = total;
		this.lista = ticket;
	}

	@Override
	public String toString() {
		return "Ticket [total=" + total + ", lista=" + lista + "]";
	}

	public void mostrarResumen() {
		System.out.println("///////////////////////////////////////////////////\nTicket de Venta");
		System.out.println("ARTICULOS");
		for (Imprimible i : lista) {
			System.out.println(i.imprimir());
		}
		System.out.println("Total: $" + total + "\n///////////////////////////////////////////////");
	}
}
