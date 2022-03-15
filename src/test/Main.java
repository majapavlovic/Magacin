package test;

import domain.Artikal;
import domain.Knjiga;
import impl.MagacinImpl;

public class Main {

	public static void main(String[] args) {
		MagacinImpl magacin = new MagacinImpl();
		Artikal k = new Knjiga();
		k.setNaziv("Lovac na zmajeve");
		k.setOpis("Drama");
		k.setSifra(1);
		k.setKolicina(5);
		
		magacin.dodajArtikal(k);
		
		//System.out.println(magacin.nadjiArtikal(k.getSifra()));
		
		Artikal m = new Knjiga();
		m.setNaziv("Lovac na zmajeve");
		m.setOpis("Drama");
		m.setSifra(1);
		m.setKolicina(5);
		
		magacin.dodajArtikal(m);
		
		Artikal o = new Knjiga();
		o.setNaziv("Hiljadu cudesnih ruza");
		o.setOpis("Drama");
		o.setSifra(2);
		o.setKolicina(5);
		
		magacin.dodajArtikal(o);
		
		//System.out.println(magacin.nadjiArtikal(m.getSifra()));

		magacin.prikaziSve();
		
	}

}
