/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author Edgar Arias
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 1;
        int contador = 0;
        int limite = 10;
        int termino = 2;
                
        System.out.println("Serie generada:");
         while (contador < limite) {
             termino = numero * (numero + 1); 
             System.out.println(termino); 
             numero++;
             contador++;
         }
    }
    
}
