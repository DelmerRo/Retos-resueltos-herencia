package ort.edu.ar.eje3;

public class Televisor extends Electrodomestico {
	private int pulgadas;
	private boolean esSmart;

	public Televisor(String marca, String modelo, String nroSerie, boolean esSmart, int voltaje, boolean encendido,
			double precio, int pulgadas) {
		super(marca, modelo, nroSerie, voltaje, encendido, precio);
		this.pulgadas = pulgadas;
		this.esSmart = esSmart;
	}

	@Override
	public String mostrarResumen() {
		return super.getClass().getSimpleName()+" "+  this.esSmart() +" "+ super.getMarca() + ", modelo " + super.getModelo() + ", "
				+ this.pulgadas + " pulgadas: $" + super.getPrecio();
	}

	private String esSmart() {
		return this.esSmart?"Smart":" ";
	}

	@Override
	public String detalleCompleto() {
		return this.getClass().getSimpleName()+" "+  this.esSmart()  + " marca " + super.getMarca() + " " + this.pulgadas + "' pulgadas "
				+ " modelo=" + super.getModelo() + ", nroSerie=" + super.getNroSerie() + ", voltaje= "
				+ super.getVoltaje() + ", encendido=" + super.isEncendido() + ", precio=" + super.getPrecio();
	}

	@Override
	public String imprimir() {
		return super.getClass().getSimpleName()+" "+  this.esSmart()  + " " + super.getMarca() + ", modelo " + super.getModelo() + ", "
				+ this.pulgadas + " pulgadas: $" + super.getPrecio();

	}
}
