package ort.edu.ar.eje5;

public class Futbol8 extends Partido {

	public Futbol8(Equipo equipoLocal, Equipo equipoVisitante, int golesLocal, int golesVisitante) {
		super(equipoLocal, equipoVisitante, golesLocal, golesVisitante);
	}

	@Override
	protected int obtenerResultado(int golesLocal, int golesVisitante) {
		int resul = 0;
		if ((golesLocal == golesVisitante) || (golesLocal < golesVisitante) || (golesVisitante == 0)
				|| (golesLocal > 3 && golesVisitante > 3 && golesLocal == golesVisitante)) {
			resul = 1;
		} else if (golesLocal > golesVisitante) {
			resul = 3;
		}
		return resul;
	}

}
