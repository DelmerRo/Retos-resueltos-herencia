package ort.edu.ar.eje1;

public abstract class Empleado {
private String nombre;
private int	 edad;

@Override
public String toString() {
	return "Empleado [nombre=" + nombre + ", edad=" + edad + "]";
}

public Empleado(String nombre, int edad) {
	super();
	this.nombre = nombre;
	this.edad = edad;
}
public String getNombre() {
	return nombre;
}

public int getEdad() {
	return edad;
}

public abstract float calcularPago();
public abstract String mostrar();
}
