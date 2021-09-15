package ort.edu.ar.eje5;

public class Test {

	public static void main(String[] args) {
		Torneo torneo = new Torneo();

		Jornada jor = new Jornada("1");
		Jornada jor1 = new Jornada("2");
		Jornada jor2 = new Jornada("3");
		Jornada jor3 = new Jornada("4");
		Jornada jor4 = new Jornada("5");

		Partido partido = new Futbol8(Equipo.BOCA, Equipo.RIVER, 4, 2);
		Partido partido1 = new Futbol8(Equipo.RACING, Equipo.SAN_LORENZO, 0, 0);
		Partido partido2 = new Futbol8(Equipo.VELEZ, Equipo.INDEPENDIENTE, 1, 2);

		Partido partido3 = new Futbol8(Equipo.BOCA, Equipo.SAN_LORENZO, 2, 0);
		Partido partido4 = new Futbol8(Equipo.RACING, Equipo.VELEZ, 3, 0);
		Partido partido5 = new Futbol8(Equipo.INDEPENDIENTE, Equipo.RIVER, 0, 0);

		Partido partido6 = new Futbol8(Equipo.BOCA, Equipo.INDEPENDIENTE, 4, 0);
		Partido partido7 = new Futbol8(Equipo.RACING, Equipo.RIVER, 0, 5);
		Partido partido8 = new Futbol8(Equipo.VELEZ, Equipo.SAN_LORENZO, 1, 1);

		Partido partido9 = new Futbol8(Equipo.BOCA, Equipo.RACING, 2, 1);
		Partido partido10 = new Futbol8(Equipo.VELEZ, Equipo.RIVER, 4, 3);
		Partido partido11 = new Futbol8(Equipo.SAN_LORENZO, Equipo.INDEPENDIENTE, 1, 0);

		Partido partido12 = new Futbol8(Equipo.BOCA, Equipo.VELEZ, 4, 3);
		Partido partido13 = new Futbol8(Equipo.RACING, Equipo.INDEPENDIENTE, 2, 1);
		Partido partido14 = new Futbol8(Equipo.RIVER, Equipo.SAN_LORENZO, 2, 2);

		torneo.agregarJornada(jor);
		torneo.agregarPartidoAJornada(jor, partido);
		torneo.agregarPartidoAJornada(jor, partido1);
		torneo.agregarPartidoAJornada(jor, partido2);
		System.out.println(torneo.actualizarPuntos(jor));

		torneo.agregarJornada(jor1);
		torneo.agregarPartidoAJornada(jor1, partido3);
		torneo.agregarPartidoAJornada(jor1, partido4);
		torneo.agregarPartidoAJornada(jor1, partido5);
		System.out.println(torneo.actualizarPuntos(jor1));

		torneo.agregarJornada(jor2);
		torneo.agregarPartidoAJornada(jor2, partido6);
		torneo.agregarPartidoAJornada(jor2, partido7);
		torneo.agregarPartidoAJornada(jor2, partido8);
		System.out.println(torneo.actualizarPuntos(jor2));

		torneo.agregarJornada(jor3);
		torneo.agregarPartidoAJornada(jor3, partido9);
		torneo.agregarPartidoAJornada(jor3, partido10);
		torneo.agregarPartidoAJornada(jor3, partido11);
		System.out.println(torneo.actualizarPuntos(jor3));

		torneo.agregarJornada(jor4);
		torneo.agregarPartidoAJornada(jor4, partido12);
		torneo.agregarPartidoAJornada(jor4, partido13);
		torneo.agregarPartidoAJornada(jor4, partido14);
		System.out.println(torneo.actualizarPuntos(jor4));

		torneo.mostrarPartidosAgregados();

	}
}
