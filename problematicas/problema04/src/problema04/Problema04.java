/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author Edgar Arias
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int limite = 15;
         double suma = 0;
         int signo = 1;
         int denominador = 1;
          System.out.println("Serie generada:");
        while (denominador <= limite) {
             double termino = signo * (1.0 / denominador);
             suma += termino; 
             if (signo == 1) {
                System.out.print("+ ");
            } else {
                System.out.print("- ");
            }
            System.out.printf("1/%d ", denominador);
             denominador += 2;
             signo *= -1;
              System.out.println("\n\nResultado de la serie: " + suma);
        }
    }
    
}
