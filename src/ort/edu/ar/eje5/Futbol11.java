package ort.edu.ar.eje5;

public class Futbol11 extends Partido {
	public Futbol11(Equipo boca, Equipo river, int golesLocal, int golesVisitante) {
		super(boca, river, golesLocal, golesVisitante);
	}

	@Override
	protected int obtenerResultado(int golesLocal, int golesVisitante) {
		int resul = 1;
		if (golesLocal < golesVisitante || (golesLocal - golesVisitante) > 4 || golesLocal == 0
				|| ((golesLocal == golesVisitante) && (golesLocal > 3 && golesVisitante > 3))) {
			resul = 0;
		} else if (golesLocal > golesVisitante) {
			resul = 3;
		}
		return resul;
	}

}
