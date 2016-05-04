/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexamen2;

/**
 *
 * @author alumnado
 */
import java.util.*;
public class Pruebaexamen2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //variables
        int num1;
        int num2;
        
        Scanner leer = new Scanner(System.in);
        
        //datos de entrada
        System.out.print("Escribe la coordenada X: ");
        num1 = leer.nextInt();
        System.out.print("Escribe la coordenada Y: ");
        num2 = leer.nextInt();
        
        //datos de salida
        System.out.println("El punto esta en el "+Cuadrante(num1,num2));
    }
    static String Cuadrante(int num1, int num2){
        String resultado;
        
        if(num1>0 && num2>0){
            resultado="Primer cuadrante";
        }else if(num1<0 && num2>0){
            resultado="Segundo cuadrante";
        }else if(num1<0 && num2<0){
            resultado="Tercer cuadrante";
        }else if(num1>0 && num2<0){
            resultado="Cuarto cuadrante";
        }else if(num1==0 && num2!=0){
            resultado="Eje Y";
        }else if(num1!=0 && num2==0){
            resultado="Eje X";
        }else {
            resultado="Origen de coordenadas";
        }
        return resultado; 
    }
}
