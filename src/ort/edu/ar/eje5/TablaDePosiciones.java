package ort.edu.ar.eje5;

import java.util.ArrayList;

public class TablaDePosiciones {
	private ArrayList<Resultado> resultado;

	public TablaDePosiciones() {
		resultado = this.crearEquipo();
	}

	@Override
	public String toString() {
		return "\nTablaDePosiciones" + resultado + "]";
	}

	private ArrayList<Resultado> crearEquipo() {
		ArrayList<Resultado> tabla = new ArrayList<>();
		for (int i = 0; i < Equipo.values().length; i++) {
			tabla.add(new Resultado(Equipo.values()[i], 0));
		}
		return tabla;
	}

	public ArrayList<Resultado> actualizarTablaDePosicion(ArrayList<Resultado> resultadoGlobal) {
		for (Resultado r : resultadoGlobal) {
			resultado.get(r.getNomEquipo().ordinal()).actualizar(r.getResultado());
		}
		return resultado;

	}

}
