package n1exercici2SamayoaS;

import java.util.ArrayList;

public class N1exercici2SamayoaS {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		ArrayList<Traballador> listaTrabajadores = new ArrayList<Traballador>();
		
		TraballadorOnline P1 = new TraballadorOnline("Maria", "Perez", 25.75);
		TraballadorOnline P2 = new TraballadorOnline("Pedro", "Hidalgo", 15.85);
		TraballadorPresencial P3 = new TraballadorPresencial("Ana", "Lopez", 27.80, 100);
		TraballadorPresencial P4 = new TraballadorPresencial("Jose", "Ribera", 27.80, 75);
		
		listaTrabajadores.add(P1);
		listaTrabajadores.add(P2);
		listaTrabajadores.add(P3);
		listaTrabajadores.add(P4);
		
		System.out.println(P1.calcularSou(40));
		System.out.println(P2.calcularSou(38));
		System.out.println(P3.calcularSou(30));
		System.out.println(P4.calcularSou(40));
		
		System.out.println(P4.valorBenzina());

	}

}
