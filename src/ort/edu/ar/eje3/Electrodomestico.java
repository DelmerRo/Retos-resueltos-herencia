package ort.edu.ar.eje3;

import ort.edu.ar.eje4.Imprimible;

public abstract class Electrodomestico implements Imprimible {
	private String marca;
	private String modelo;
	private String nroSerie;
	private int voltaje;
	private boolean encendido;
	private double precio;

	public Electrodomestico(String marca, String modelo, String nroSerie, int voltaje, boolean encendido,
			double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.nroSerie = nroSerie;
		this.voltaje = voltaje;
		this.encendido = encendido;
		this.precio = precio;
	}

	public abstract String mostrarResumen();

	public abstract String detalleCompleto();

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getNroSerie() {
		return nroSerie;
	}

	public int getVoltaje() {
		return voltaje;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public double getPrecio() {
		return precio;
	}
}
