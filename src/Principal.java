/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin Ortiz
 * 
 */

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iArre[][] = new int [10][10];
        for (int i = 0; i < iArre.length; i++) {
            for (int j = 0; j < iArre[i].length; j++) {
                if(i==j){//SOLO CUANDO i y j coincidan el valor en el arreglo será 1.
                    iArre[i][j] = 1;
                }else{
                    //Todos los restantes tendran valor de 0.
                     iArre[i][j] = 0;
                }
            }
        }
        //IMPRIMIR EL ARREGLO
        for (int i = 0; i < iArre.length; i++) {
            for (int j = 0; j < iArre[i].length; j++) {
                System.out.print("["  +iArre[i][j] + "]");
            }
            //SALTO DE LINEA 
            System.out.println("");
        }
  
    }
    
    
}
