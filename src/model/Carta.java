package sieteymedia.com.model;

import java.util.Objects;

public class Carta {
	
	private Integer numero;
	private Palo palo;
	
	
	
	public Carta(Integer numero, Palo palo) {
		super();
		this.numero = numero;
		this.palo = palo;
	}



	public Integer getNumero() {
		return numero;
	}



	public Palo getPalo() {
		return palo;
	}



	public void setNumero(Integer numero) {
		this.numero = numero;
	}



	public void setPalo(Palo palo) {
		this.palo = palo;
	}



	@Override
	public String toString() {
		return "Carta [numero=" + numero + ", palo=" + palo + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(numero, palo);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		return Objects.equals(numero, other.numero) && palo == other.palo;
	}
	
	
	
	
	
	
	
	
	

}
