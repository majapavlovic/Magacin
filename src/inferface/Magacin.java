package inferface;

import domain.Artikal;

public interface Magacin {
	public void dodajArtikal(Artikal a);
	public void izbaciArtikal(Artikal a);
	public Artikal nadjiArtikal(int sifra);
}
