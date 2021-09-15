package ort.edu.ar.eje1;

public class EmpleadoSubContratado extends Empleado {
private float cantHoras;
private float precioHora;
public EmpleadoSubContratado(String nombre,int edad,float cantHoras, float precioHora) {
	super(nombre, edad);
	this.cantHoras = cantHoras;
	this.precioHora = precioHora;
}
@Override
public String toString() {
	return "EmpleadoSubContratado [cantHoras=" + cantHoras + ", precioHora=" + precioHora + "]";
}

public float getCantHoras() {
	return cantHoras;
}

public float getPrecioHora() {
	return precioHora;
}

@Override
public float calcularPago() {
	return this.cantHoras*this.precioHora;
}

@Override
public String mostrar() {
	return super.getNombre()+" con "+super.getEdad()+" años de edad gana: $"+this.calcularPago()+" pesos";	
}
}
