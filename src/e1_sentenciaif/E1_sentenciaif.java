/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e1_sentenciaif;
import java.util.Scanner;
/**
 *
 * @author Ehuan Cisneros Monica de los Angeles
 */
public class E1_sentenciaif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
         System.out.println(""
                 + "°°°°°°°°°°°°°°°°°°°°°°°°°°°°[Pirmer ejercicio]°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
          int va1, va2 ;
        System.out.println("ingrese el primer numero:");
         va1=entrada.nextInt();
        System.out.println("ingrese segundo numero");
        va2=entrada.nextInt();
        
        if (va1>va2){
        System.out.println("el primer número es mayor ");
                
    } 
        else{
        System.out.println("el segundo número es mayor");
    }
        
         System.out.println(""
                 + "°°°°°°°°°°°°°°°°°°°°°°°°°°°°[Segundo ejercicio]°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
    System.out.println("primer numero: " );
        int N1=entrada.nextInt();
        System.out.println("segundo numero: ");
        int N2=entrada.nextInt();
        
        int mayor=N1;
        int menor=N1;
        
        if (mayor<N2){
             mayor=N2; 
            
        }     
        else if (menor>N2){  
            menor=N2;
           
        }
          System.out.println("mayor : " +mayor );
           System.out.println("menor : " +menor );
            
             System.out.println(""
                 + "°°°°°°°°°°°°°°°°°°°°°°°°°°°°[Tercer ejercicio]°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
            System.out.println("primer numero: " );
        int n1=entrada.nextInt();
        System.out.println("segundo numero: ");
        int n2=entrada.nextInt();
        
        if (n1>n2){
        System.out.println("el primer número es mayor ");
                 
       
    } else if (n1==n2){
        System.out.println("ambos número son iguales");
        }else{
        System.out.println("el segundo número es mayor");
    }
        
        System.out.println(""
                 + "°°°°°°°°°°°°°°°°°°°°°°°°°°°°[cuarto ejercicio]°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
int añoac=2021;
        
        int r;
          System.out.println("Escriba cualquier año: " );
        int añoan=entrada.nextInt();
        r=añoac-añoan;
        
        System.out.println(" desde "+ añoan + " hasta "+ añoac + " han pasado "+r + " años ");
        
         System.out.println(""
                 + "°°°°°°°°°°°°°°°°°°°°°°°°°°°°[Quinto ejercicio]°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
         System.out.println("Introduzca un número cualquiera: ");
         int Num=entrada.nextInt();
         
         if (Num>=0) {
             System.out.println("Es positivo");
         }
         else {
         System.out.println("Es negativo");
        
        }
        System.out.println(""
                 + "°°°°°°°°°°°°°°°°°°°°°°°°°°°°[Sexto ejercicio]°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        int c;
        Scanner val=new Scanner(System.in);
         System.out.println("Introduzca un número: ");
          c=val.nextInt();
         
         if (c<10){
         System.out.println("Distinto de dos cifras");
         }
         else if (c<100){
         System.out.println("Tiene dos cifras");
         }
         else {
         System.out.println("Distinto de dos cifras");
         }
        }
    
}