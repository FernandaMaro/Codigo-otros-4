package com.generation;

import java.util.Scanner;//Importe el scanner

public class Codigo4 {
	public static void main(String[] args) {//Agregue el entry point 
         Scanner s = new Scanner(System.in);//Agregue el System.in para inicializar el scanner 
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");//Cambie a jugador 2 porque se repetia jugador 1 
    // Scanner s2 = new Scanner(); No se necesita 
     String j2 = s.nextLine();
    
    if (j1.equals(j2)){// equals () compra strings 
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2.equals("tijeras")) {//Cambie a equals()
            g = 1;
          }

        case "papel":
          if (j2.equals("piedra")){
            g = 1;
          }//Cerre la condición "}"
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + g);
    }
  
	 }
}






