package Implementacao;

import beans.Televisor;

public class ImplementarTelevisor {

	public static void main(String[] args) {
		Televisor tv = new Televisor();
		
		tv.desligar();
		tv.aumentarVolume();
		tv.mostrarStatus();
		System.out.println(tv.getVolume());
		
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		System.out.println(tv.getVolume());
		
		tv.reduzirVolume();
		System.out.println(tv.getVolume());
		
		tv.mostrarStatus();

	}

}
