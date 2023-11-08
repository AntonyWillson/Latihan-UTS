package main;

import model.Kerbau;
import model.Paus;

public class Main {

	public Main() {
		Kerbau k = new Kerbau(20, 2);
		Paus p = new Paus(45, 4);
		
		System.out.println("Paus itu umur " +p.getUmur() +  " dan memiliki berat " + p.getBerat() + " Siripnnya ada : " + ((Paus)p).jumlahSiripn);
		p.Makan();
		System.out.println("Kerbau itu umur " +k.getUmur() +  " dan memiliki berat " + k.getBerat() + " tanduknya ada : " +((Kerbau)k).jumlahTanduk);
		k.Makan();
	}
	public static void main(String[] args) {
		new Main();

	}

}
