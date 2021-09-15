package ort.edu.ar.eje2;

import ort.edu.ar.eje1.EmpleadoSubContratado;

public class Vendedor extends EmpleadoSubContratado {
private float porcentaje;
	public Vendedor(String nombre, int edad, float cantHoras, float precioHora,float porcentaje) {
		super(nombre, edad, cantHoras, precioHora);
	this.porcentaje=porcentaje;
	}
	@Override
	public String toString() {
		return "Vendedor [porcentaje=" + porcentaje + "]";
	}
	@Override
	public float calcularPago() {
		return (super.getCantHoras()*super.getPrecioHora())*(1+this.porcentaje/100);
	}
}
