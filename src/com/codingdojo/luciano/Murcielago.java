package com.codingdojo.luciano;

public class Murcielago extends Mamifero {

	

	public void volar() {
		System.out.println("pzzzz Murcielago Elevandose");
		nivelDeEnerg�a -= 50;
	}
	
	public void comerHumanos() {
		System.out.println("plashssss Comer humanos me poner energ�tico");
		nivelDeEnerg�a += 25;
	}
	
	public void atacarPueblo() {
		System.out.println("trsh trsh pueblo en llamas");
		nivelDeEnerg�a -=100;
	}
	
	
}