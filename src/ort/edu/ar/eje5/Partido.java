package ort.edu.ar.eje5;

public abstract class Partido {
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private int golesLocal;
	private int golesVisitante;

	public Partido(Equipo boca, Equipo river, int golesLocal, int golesVisitante) {
		super();
		this.equipoLocal = boca;
		this.equipoVisitante = river;
		this.golesLocal = golesLocal;
		this.golesVisitante = golesVisitante;
	}

	public Equipo getEquipoLocal() {
		return equipoLocal;
	}

	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}

	public int getGolesLocal() {
		return golesLocal;
	}

	public int getGolesVisitante() {
		return golesVisitante;
	}

	@Override
	public String toString() {
		return "Partido [equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante + ", golesLocal="
				+ golesLocal + ", golesVisitante=" + golesVisitante;
	}

	protected abstract int obtenerResultado(int golesLocal2, int golesVisitante2);

}
