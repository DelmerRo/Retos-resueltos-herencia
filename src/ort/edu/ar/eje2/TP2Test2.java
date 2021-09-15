package ort.edu.ar.eje2;

import ort.edu.ar.eje1.Empresa;

public class TP2Test2 {
	public static void main(String[] args) {
		Empresa e=new Empresa();
		Vendedor vendedor=new Vendedor("Pedro", 25, 100, 200, 5);
		Vendedor vendedor1=new Vendedor("Maria", 30, 100, 200, 10);
		
		e.agregarEmpleado(vendedor);
		e.agregarEmpleado(vendedor1);
		
		e.calcularPago();
	}
}
