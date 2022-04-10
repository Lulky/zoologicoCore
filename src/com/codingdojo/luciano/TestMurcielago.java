package com.codingdojo.luciano;

public class TestMurcielago {

	public static void main(String[] args) {
		
		Murcielago murcielago1= new Murcielago();
		murcielago1.atacarPueblo();
		murcielago1.atacarPueblo();
		murcielago1.atacarPueblo();
		
		murcielago1.comerHumanos();
		murcielago1.comerHumanos();
		
		murcielago1.volar();
		murcielago1.volar();
		
		int energia = murcielago1.mostrarEnergía();
		System.out.println(energia);
		
	}
}
