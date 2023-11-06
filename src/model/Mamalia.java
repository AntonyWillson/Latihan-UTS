package model;

public abstract class Mamalia {
	private double berat;
	private int umur;
	
	public Mamalia(double berat, int umur) {
		super();
		this.berat = berat;
		this.umur = umur;
	}

	public double getBerat() {
		return berat;
	}

	public void setBerat(double berat) {
		this.berat = berat;
	}

	public int getUmur() {
		return umur;
	}

	public void setUmur(int umur) {
		this.umur = umur;
	}
	
	public abstract void Makan();
	public abstract void Melahirkan();
	
}
