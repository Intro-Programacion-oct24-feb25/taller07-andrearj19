/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author Edgar Arias
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int incremento = 3;
        int contador = 0;
        int limite = 6;
        int termino = 2;
         System.out.println("Serie generada:");
          while (contador < limite) {
              System.out.println(termino);
               termino += incremento;
               incremento += 2;
               contador++;
          }
    }
    
}
