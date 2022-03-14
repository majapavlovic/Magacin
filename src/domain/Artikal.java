package domain;

public class Artikal {
	String naziv;
	int sifra;
	String opis;
	int kolicina;
	
	public int getKolicina() {
		return kolicina;
	}
	public String getNaziv() {
		return naziv;
	}
	public String getOpis() {
		return opis;
	}
	public int getSifra() {
		return sifra;
	}
	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
