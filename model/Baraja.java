package sieteymedia.com.model;

import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Baraja implements Repartible {
	private Integer numCartas=48;
	private Integer siguiente;
	private final Integer CARTAS_POR_PALO=12;
	
	
	private Carta[] listaCartas; //plural importante
	


	public Baraja() {
		super();
		this.listaCartas=new Carta[numCartas];
		
		int numeroPalos=Palo.values().length;
		//Palo[] valoresDePalo=Palo.values();
		
		//int numeroCartasPorPalo=numCartas/numeroPalos;
		
		int contador=0;
		
		for(int i=0; i<numeroPalos; i++ ) {
			for(int j=0; j<CARTAS_POR_PALO; j++) {
				listaCartas[contador]=new Carta(j+1, Palo.values()[i]);
				contador++;
				//System.out.println(listaCartas);
			}
			
		}
		
		//for (int i=0; i<numCartas; i++ ) {
		//	listaCartas[i]=new Carta((i+1)%12, Palo.BASTOS );
		//}
	
	
	}
	
	public int getPosicionAleatoria() {
		return ThreadLocalRandom.current().nextInt(0,numCartas);
	}
	
	public void barajar() {
		//Carta[] barajada = new Carta[numCartas];
		//int posicion=getPosicionAleatoria();
		//Carta cartaExtraida=this.listaCartas[posicion];
		//this.listaCartas[posicion]=null;
		//this.listaCartas=barajada;
		
		for (int i=0; i<70; i++) {
			int numeroAletorio1=getPosicionAleatoria();
			int numeroAletorio2=getPosicionAleatoria();
			
			Carta c1=this.listaCartas[numeroAletorio1];
			Carta c2=this.listaCartas[numeroAletorio2];
			
			this.listaCartas[numeroAletorio1]=c2;
			this.listaCartas[numeroAletorio2]=c1;
		}
	}
	
	public Carta getSiguiente() {
		
		int contador=0;
		
		Carta siguienteCarta=this.listaCartas[contador];
		
		contador++;
		
		
		return siguienteCarta;
	}
	
	
	


	public Carta[] getListaCartas() {
		return listaCartas;
	}

	public void setListaCartas(Carta[] listaCartas) {
		this.listaCartas = listaCartas;
	}

	@Override
	public String toString() {
		return "Baraja [numCartas=" + numCartas + ", siguiente=" + siguiente + ", CARTAS_POR_PALO=" + CARTAS_POR_PALO
				+ ", listaCartas=" + Arrays.toString(listaCartas) + "]";
	}

	
	
	
	
	
	


	
	
	

}
