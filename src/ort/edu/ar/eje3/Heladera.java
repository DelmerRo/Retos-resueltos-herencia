package ort.edu.ar.eje3;

public class Heladera extends Electrodomestico {
	private int capacidad;
	private boolean esNofrost;
	public Heladera(String marca, String modelo, String nroSerie, boolean esNofrost, int voltaje, boolean encendido, double precio,
			int capacidad) {
		super(marca, modelo, nroSerie, voltaje, encendido, precio);
		this.capacidad = capacidad;
		this.esNofrost=esNofrost;
	}
	private String esNoFrost() {
		return this.esNofrost?"NoFrost":" ";
	}
	@Override
	public String mostrarResumen() {
		return super.getClass().getSimpleName() +" " +esNoFrost()+" " + super.getMarca() + ", modelo " + super.getModelo() + ", "
				+ this.capacidad + " de capacidad: $" + super.getPrecio();
	}

	@Override
	public String detalleCompleto() {
		return this.getClass().getSimpleName() +" " +esNoFrost()+ " marca " + super.getMarca() + " " + this.capacidad + " litros "
				+ " modelo=" + super.getModelo() + ", nroSerie=" + super.getNroSerie() + ", voltaje= "
				+ super.getVoltaje() + ", encendido=" + super.isEncendido() + ", precio=" + super.getPrecio();
	}

	@Override
	public String imprimir() {
		return super.getClass().getSimpleName() +" " +esNoFrost()+ " " + super.getMarca() + ", modelo " + super.getModelo() + ", "
				+ this.capacidad + " de capacidad: $" + super.getPrecio();

	}
}
