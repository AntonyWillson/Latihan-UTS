package model;

public class Paus extends Mamalia {
	public final int jumlahSiripn;
	public Paus(double berat, int umur) {
		super(berat, umur);
		this.jumlahSiripn = 4;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void Makan() {
		System.out.println(" Paus itu Karnivora");
		
	}
	@Override
	public void Melahirkan() {
		// TODO Auto-generated method stub
		
	}

	void berenang() {
		
	}
}
