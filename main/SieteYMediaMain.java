package sieteymedia.com.main;

import java.util.Scanner;

import com.model.Baraja;
import com.model.Carta;


public class SieteYMediaMain {


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        
        
        
        Baraja b1 = new Baraja();
        b1.barajar();
        
        //Baraja b2 = new Baraja();
        
        //int coincidencias=0;
        
        ///for(int i=0; i<b2.getListaDeCartas().length; i++) {
            //if (b1.getListaDeCartas()[i].equals(b2.getListaDeCartas()[i])) {
            ///    coincidencias++;
            //}
        //}
        
        menuOpciones();
    }
    




public static void menuOpciones() {
    

	Scanner sc=new Scanner(System.in);
    
    System.out.println("Hola usted va a comenzar la partida, suerte");
    System.out.println("se le va a repartir una carta.");
    
    Carta[] jugador1= new Carta [10];
    Carta[] banca = new Carta [10];
    
    
    Baraja b1 = new Baraja();
    
    b1.barajar();
    int contadorPosicion=0;
     
    jugador1[contadorPosicion]=b1.getSiguiente();
    banca[contadorPosicion+1]=b1.getSiguiente();
    
    Double puntuacion =0.0;
    Double puntuacionBanca  =0.0;
    
    if (jugador1[0].getNumero()>7) {
    	puntuacion+=0.5;
    }else if(jugador1[0].getNumero()<=7) {
    	puntuacion+=jugador1[0].getNumero();
    }else if (banca[0].getNumero()>7) {
    	puntuacionBanca+=0.5;
    }else if  (banca[0].getNumero()<=7){
    	puntuacionBanca+=banca[0].getNumero();
    }
    System.out.println(puntuacion);
    
    
        
        
    System.out.println("Elija su opcion"
            + "1-- Cojo carta "
            + "2-- Me planto\n");
    Integer Opcion =Integer.valueOf(sc.nextInt());
    
    
while (Opcion==1 && puntuacion<7.5) {
    jugador1[contadorPosicion]=b1.getSiguiente();


    if (jugador1[contadorPosicion].getNumero()>7) {
        puntuacion+=0.5;
        contadorPosicion++;
    }else if(jugador1[contadorPosicion].getNumero()<=7) {
        puntuacion+=jugador1[contadorPosicion].getNumero();
        contadorPosicion++;
}
	System.out.println(puntuacion);

    System.out.println("Elija su opcion"
    		+ "1-- Cojo carta "
    		+ "2-- Me planto\n");
    Opcion =Integer.valueOf(sc.nextInt());
    
}
if (puntuacion>7.5) {
	System.out.println("Te has pasado de 7.5");
	
}else if (puntuacion<=7.5) {
	System.out.println(puntuacion+" esta es tu puntuacion");
}
contadorPosicion=0;
while (Opcion==2 && puntuacionBanca<7.5) {
    banca[contadorPosicion]=b1.getSiguiente();

    
    if (banca[contadorPosicion].getNumero()>7) {
        puntuacionBanca+=0.5;
        contadorPosicion++;
    }else if(banca[contadorPosicion].getNumero()<=7) {
        puntuacionBanca+=banca[contadorPosicion].getNumero();
        contadorPosicion++;
    }
    System.out.println(puntuacionBanca+" Esta es la puntuacion de la banca");
    System.out.println("Elija su opcion"
    		+ "1-- Cojo carta "
    		+ "2-- Me planto\n");
    Opcion =Integer.valueOf(sc.nextInt());
}
if (puntuacionBanca>7.5) {
	System.out.println("Te has pasado de 7.5");
	
}else if (puntuacionBanca<=7.5) {
	System.out.println(puntuacion+" esta es tu puntuacion");
}


if (puntuacion>puntuacionBanca) {
	System.out.println("Ha ganado jugador");
}else if(puntuacion<puntuacionBanca) {
	System.out.println("Ha ganado la banca");
	
}



}

}
