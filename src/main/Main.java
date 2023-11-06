package main;

import model.Kerbau;
import model.Paus;

public class Main {

	public Main() {
		Kerbau k = new Kerbau(20, 2);
		Paus p = new Paus(45, 4);
		
		p.Makan();
		k.Makan();
	}
	public static void main(String[] args) {
		new Main();

	}

}
