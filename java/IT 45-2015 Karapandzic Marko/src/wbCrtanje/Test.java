package wbCrtanje;

import java.util.ArrayList;
import java.util.Iterator;

import geometrija.Kvadrat;
import geometrija.Linija;
import geometrija.Tacka;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> lista = new ArrayList<>();
		Kvadrat kv = new Kvadrat(new Tacka(10, 10), 100);
		Linija l = new Linija(new Tacka(11, 11), new Tacka(20, 20));
		Linija l1 = new Linija(new Tacka(10, 10), new Tacka(20, 20));
		Linija l2 = new Linija(new Tacka(10, 10), new Tacka(20, 20));
		Linija l3 = new Linija(new Tacka(10, 10), new Tacka(20, 20));
		Linija l4 = new Linija(new Tacka(10, 10), new Tacka(20, 20));
		
		lista.add(kv);
		lista.add(l);
		lista.add(l1);
		lista.add(l2);
		lista.add(l3);
		lista.add(l4);
		
		lista.add(1, new Tacka(10, 10));
		lista.remove(2);
		lista.add(2, new Tacka(20, 20));
		for(int i = 0; i < lista.size(); i++){
			System.out.println(lista.get(i));
		}
	}

}