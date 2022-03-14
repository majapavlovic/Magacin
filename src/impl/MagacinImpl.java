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
		if (a != null) {
			lista.add(a);
		}

	}

	@Override
	public void izbaciArtikal(Artikal a) {
		lista.remove(a);
	}

	@Override
	public Artikal nadjiArtikal(int sifra) {
		for (Artikal a : lista) {
			if (a.getSifra() == sifra)
				return a;
		}
		return null;
	}

}
