package model;

public class Kerbau extends Mamalia {
	
	public final int jumlahTanduk;
	public Kerbau(double berat, int umur) {
		super(berat, umur);
		this.jumlahTanduk = 2;

		
	}


	
	
	void memamahbiak() {
		
	}

	@Override
	public void Makan() {
	System.out.println("Kerbau itu Herbivora");
		
	}

	@Override
	public void Melahirkan() {
		// TODO Auto-generated method stub
		
	}
}
