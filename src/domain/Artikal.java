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
		if(kolicina>=0)
			this.kolicina = kolicina;
	}
	public void setNaziv(String naziv) {
		if(naziv!=null && !naziv.equals(""))
			this.naziv = naziv;
	}
	public void setOpis(String opis) {
		if(opis!=null && !opis.equals(""))
			this.opis = opis;
	}
	public void setSifra(int sifra) {
		if(sifra>=0)
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
