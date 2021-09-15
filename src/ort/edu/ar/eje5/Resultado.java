package ort.edu.ar.eje5;

public class Resultado {
	Equipo nomEquipo;
	int resultado;

	public Resultado(Equipo nomEquipo, int res) {
		this.nomEquipo = nomEquipo;
		this.resultado = res;
	}

	@Override
	public String toString() {
		return "\n" + nomEquipo + ": " + resultado + " puntos";
	}

	public Equipo getNomEquipo() {
		return nomEquipo;
	}

	public int getResultado() {
		return resultado;
	}

	public void actualizar(int resultadoLocal) {
		this.resultado += resultadoLocal;

	}

}
