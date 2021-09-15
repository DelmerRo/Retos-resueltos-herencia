package ort.edu.ar.eje4;

import java.util.ArrayList;
import ort.edu.ar.eje3.Electrodomestico;

public class Cliente {
	private String cuil;
	private String apeNom;
	private ArrayList<Electrodomestico> listaDeCompra;

	public Cliente(String cuil, String apeNom, ArrayList<Electrodomestico> catalogo) {
		super();
		this.cuil = cuil;
		this.apeNom = apeNom;
		this.listaDeCompra = catalogo;
	}

	public Cliente(String cuil, String nomApe) {
		super();
		this.cuil = cuil;
		this.apeNom = nomApe;
		this.listaDeCompra = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Cliente [cuil=" + cuil + ", apeNom=" + apeNom + ", listaDeCompra=" + listaDeCompra + "]";
	}

	public ArrayList<Electrodomestico> obtenerListaDeElectrodomesticos() {
		ArrayList<Electrodomestico> lista = new ArrayList<>();
		for (Electrodomestico e : this.listaDeCompra) {
			lista.add(e);
		}
		return lista;
	}

	public ArrayList<Electrodomestico> agregarElectrodomesticosAlTicket(ArrayList<Electrodomestico> listaDeCompras,
			int nroElectro) {
		listaDeCompras.add(this.listaDeCompra.get(nroElectro));
		return listaDeCompras;
	}

	public Ticket agregarTicket(ArrayList<Electrodomestico> listaDeCompras, double total) {
		return new Ticket(listaDeCompras, total);
		
	}

}
