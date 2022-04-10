package com.codingdojo.luciano;

public class Murcielago extends Mamifero {

	

	public void volar() {
		System.out.println("pzzzz Murcielago Elevandose");
		nivelDeEnergía -= 50;
	}
	
	public void comerHumanos() {
		System.out.println("plashssss Comer humanos me poner energético");
		nivelDeEnergía += 25;
	}
	
	public void atacarPueblo() {
		System.out.println("trsh trsh pueblo en llamas");
		nivelDeEnergía -=100;
	}
	
	
}