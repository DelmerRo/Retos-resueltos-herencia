package ort.edu.ar.eje5;

import java.util.ArrayList;

public class Jornada {
	private ArrayList<Partido> partidos;
	private String nombre;
	private ArrayList<Resultado> resultados;

	public Jornada(String nombre) {
		super();
		this.nombre = nombre;
		this.partidos = new ArrayList<>();
		this.resultados = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Jornada [partidos=" + partidos + ", nombre=" + nombre + "]";
	}

	public void agregarPartido(Partido partido) {
		this.partidos.add(partido);
	}

	public ArrayList<Resultado> actualizarPuntos() {
		int resultadoLocal;
		int resultadoVisitante;
		Equipo nomEquiLocal;
		Equipo nomEquiVisitante;
		for (Partido p : this.partidos) {
			resultadoLocal = p.obtenerResultado(p.getGolesLocal(), p.getGolesVisitante());
			resultadoVisitante = p.obtenerResultado(p.getGolesVisitante(), p.getGolesLocal());
			nomEquiLocal = p.getEquipoLocal();
			nomEquiVisitante = p.getEquipoVisitante();
			this.resultados.add(new Resultado(nomEquiLocal, resultadoLocal));
			this.resultados.add(new Resultado(nomEquiVisitante, resultadoVisitante));
			
		}
		return this.resultados;
	}

	public void mostrar() {
		for (Partido p : this.partidos) {
			System.out.println(p.getEquipoLocal() + " " + p.getEquipoVisitante() + " " + p.getGolesLocal() + " "
					+ p.getGolesVisitante() + " " + this.nombre);
		}
	}

}
