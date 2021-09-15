package ort.edu.ar.eje1;

public class EmpleadoAsalariado extends Empleado {
private float sueldo;

public EmpleadoAsalariado(String nombre,int edad,float sueldo) {
	super(nombre, edad);
	this.sueldo = sueldo;
}

@Override
public String toString() {
	return super.toString()+"EmpleadoAsalariado [sueldo=" + sueldo + "]";
}

@Override
public float calcularPago() {
	return this.sueldo;
}
@Override
public String mostrar() {
	return super.getNombre()+" con "+super.getEdad()+" años de edad gana: $"+this.calcularPago()+" pesos";
	
}
}
