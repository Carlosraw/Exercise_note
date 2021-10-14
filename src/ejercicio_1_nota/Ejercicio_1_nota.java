/* Ejercicio 1: Hacer un programa que calcule e imprima la suma de tres 
calificaciones. */

package ejercicio_1_nota;

import javax.swing.JOptionPane;


public class Ejercicio_1_nota {

    public static void main(String[] args) {
        //Creamos las variables donde guardamos las notas y el resultado final
        double nota1, nota2 , nota3, nota_final;
        
        //Pedimos las notas al usuario a través de una ventana
        nota1=Double.parseDouble(JOptionPane.showInputDialog("Inserte la primera nota: "));
        nota2=Double.parseDouble(JOptionPane.showInputDialog("Inserte la segunda nota: "));
        nota3=Double.parseDouble(JOptionPane.showInputDialog("Inserte la tercera nota: "));
        
        nota_final = (nota1+nota2+nota3)/3;
        
        JOptionPane.showMessageDialog(null,"El promedio es de: "+nota_final);
        
    }
    
}
