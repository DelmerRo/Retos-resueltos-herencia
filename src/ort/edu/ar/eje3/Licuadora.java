package ort.edu.ar.eje3;

import ort.edu.ar.eje4.Imprimible;

public class Licuadora extends Electrodomestico implements Imprimible {
	private int potencia;
	private int cantVelocidades;

	public Licuadora(String marca, String modelo, String nroSerie, int voltaje, boolean encendido, double precio,
			int potencia, int cantVelocidades) {
		super(marca, modelo, nroSerie, voltaje, encendido, precio);
		this.potencia = potencia;
		this.cantVelocidades = cantVelocidades;
	}

	@Override
	public String mostrarResumen() {
		return super.getClass().getSimpleName() + " " + super.getMarca() + ", modelo " + super.getModelo()
				+ " ,potencia de " + this.potencia + " watts, con " + this.cantVelocidades + " velocidades: $"
				+ super.getPrecio();
	}

	@Override
	public String detalleCompleto() {
		return this.getClass().getSimpleName() + " marca " + super.getMarca() + ", potencia= " + this.potencia
				+ ", cantidad de velocidades: " + this.cantVelocidades + ", modelo=" + super.getModelo() + ", nroSerie="
				+ super.getNroSerie() + ", voltaje= " + super.getVoltaje() + ", encendido=" + super.isEncendido()
				+ ", precio=" + super.getPrecio();
	}

	@Override
	public String imprimir() {
		return super.getClass().getSimpleName() + " " + super.getMarca() + ", modelo " + super.getModelo()
				+ " ,potencia de " + this.potencia + " watts, con " + this.cantVelocidades + " velocidades: $"
				+ super.getPrecio();

	}
}
