package impl;

import java.util.ArrayList;
import java.util.List;

import domain.Artikal;
import inferface.Magacin;

public class MagacinImpl implements Magacin {

	List<Artikal> lista;
	
	public MagacinImpl() {
		lista = new ArrayList<>();
	}
	@Override
	public void dodajArtikal(Artikal a) {
		if (a != null && !lista.contains(a)) {
			lista.add(a);
		}

	}

	@Override
	public void izbaciArtikal(Artikal a) {
		// TODO Auto-generated method stub

	}

	@Override
	public Artikal nadjiArtikal(int sifra) {
		// TODO Auto-generated method stub
		return null;
	}

}
