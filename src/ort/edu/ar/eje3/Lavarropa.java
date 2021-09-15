package ort.edu.ar.eje3;

public class Lavarropa extends Electrodomestico {
	private double carga;
private boolean esAutomatica;
	public Lavarropa(String marca, String modelo, String nroSerie, boolean esAutomatico, int voltaje, boolean encendido,
			double precio, double carga) {
		super(marca, modelo, nroSerie, voltaje, encendido, precio);
		this.carga = carga;
		this.esAutomatica=esAutomatico;
	}

	@Override
	public String mostrarResumen() {
		return this.getClass().getSimpleName() +" " +  this.esAutomatic() +" " + super.getMarca() + ", modelo " + super.getModelo() + " "
				+ this.carga + " kilos de carga: $" + super.getPrecio();
	}

	private String esAutomatic() {
		return this.esAutomatica?"Automatico":" ";
	}

	@Override
	public String detalleCompleto() {
		return this.getClass().getSimpleName() +" " +this.esAutomatic()+ " marca " + super.getMarca() + " " + this.carga + " kilos "
				+ " modelo=" + super.getModelo() + ", nroSerie=" + super.getNroSerie() + ", voltaje= "
				+ super.getVoltaje() + ", encendido=" + super.isEncendido() + ", precio=" + super.getPrecio();
	}

	@Override
	public String imprimir() {
		return super.getClass().getSimpleName() +" "+ this.esAutomatic()+ " " + super.getMarca() + ", modelo " + super.getModelo() + " "
				+ this.carga + " kilos de carga: $" + super.getPrecio();
	}
}
