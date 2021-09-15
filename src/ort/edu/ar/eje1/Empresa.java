package ort.edu.ar.eje1;

import java.util.ArrayList;

public class Empresa {
private ArrayList<Empleado>lista;

public Empresa() {
	super();
	this.lista = new ArrayList<>();
}

public void calcularPago() {
	for(Empleado e:this.lista) {
		System.out.println(e.getClass().getSimpleName()+" "+e.mostrar());
	}
}

public void agregarEmpleado(Empleado e) {
	this.lista.add(e);
}
}
