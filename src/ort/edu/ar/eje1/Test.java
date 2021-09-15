package ort.edu.ar.eje1;

public class Test {

	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		EmpleadoAsalariado ea = new EmpleadoAsalariado("David", 18, 45000);
		EmpleadoSubContratado es = new EmpleadoSubContratado("Mayra", 20, 8, 1000);
		empresa.agregarEmpleado(ea);
		empresa.agregarEmpleado(es);
		empresa.calcularPago();
	}
}
