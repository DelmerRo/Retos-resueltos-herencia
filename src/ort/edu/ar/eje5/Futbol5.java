package ort.edu.ar.eje5;

public class Futbol5 extends Partido {
	public Futbol5(Equipo equipoLocal, Equipo equipoVisitante, int golesLocal, int golesVisitante) {
		super(equipoLocal, equipoVisitante, golesLocal, golesVisitante);
	}

	@Override
	protected int obtenerResultado(int golesLocal, int golesVisitante) {
		int resul = 0;
		if (golesLocal > golesVisitante || ((golesLocal == golesVisitante) && (golesLocal > 3 && golesVisitante > 3))) {
			resul = 2;
		} else if (golesLocal - golesVisitante > 4 || golesLocal == golesVisitante) {
			resul = 1;
		} else if (golesLocal < golesVisitante
				|| (golesLocal > 3 && golesVisitante > 3 && golesLocal == golesVisitante)) {
			resul = 0;
		}
		return resul;
	}

}
