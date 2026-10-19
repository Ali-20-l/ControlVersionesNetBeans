/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlversionesjava;

import java.util.Scanner;

/**
 *
 * @author USER11
 */
public class ControlVersionesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenidos a nuestra calculadora en Java");
        mostrarBienvenida();
        ControlVersionesJava c = new ControlVersionesJava();
        c.restar();
        c.sumar();
        c.multiplicar();
        
        
        
        System.out.println("hola");
        
        System.out.println("Como estas");
        
        
        
        
        
        
        
        
        
    }

    // Metodo de la administradora
    public static void mostrarBienvenida() {
        System.out.println("Bienvenidos al proyecto colaborativo");
    }

    public void restar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double num2 = sc.nextDouble();

        double resultado = num1 - num2;

        System.out.println("El resultado de la resta es: " + resultado);
        
    }
    
    public void multiplicar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        double resultado = num1 * num2;

        System.out.println("El resultado de la resta es: " + resultado);
        
    }
    
    public void sumar() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Ingrese el primer numero: ");
            double num1 = sc.nextDouble();

            System.out.print("Ingrese el segundo numero: ");
            double num2 = sc.nextDouble();

            double resultado = num1 + num2;

            System.out.println("El resultado de la suma es: " + resultado);
        }
    
    //nuevamente
    public void sumarJZ () {
       
   }
    
    public void conestar(){
        
    }
    
    
    public void restarr (){
        
    }

    //hola
    //como estas
    //bien y tu
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
