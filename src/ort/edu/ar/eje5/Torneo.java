package ort.edu.ar.eje5;

import java.util.ArrayList;

public class Torneo {
	private ArrayList<Jornada> jornadas;
	TablaDePosiciones tabPos;

	public Torneo() {
		super();
		this.jornadas = new ArrayList<>();
		tabPos = new TablaDePosiciones();
	}

	public void agregarJornada(Jornada jornada) {
		this.jornadas.add(jornada);

	}

	public void agregarPartidoAJornada(Jornada jor, Partido p) {
		jor.agregarPartido(p);
	}

	public void mostrarPartidosAgregados() {
		for (int i = 0; i < this.jornadas.size(); i++) {
			System.out.println("\n////////////Jornada Nro: " + (i + 1) + "////////////////////");
			this.jornadas.get(i).mostrar();
		}
	}

	@Override
	public String toString() {
		return "Torneo [jornadas=" + jornadas + "]";
	}

	public TablaDePosiciones actualizarPuntos(Jornada jor) {
		tabPos.actualizarTablaDePosicion(jor.actualizarPuntos());
		return tabPos;

	}

}
