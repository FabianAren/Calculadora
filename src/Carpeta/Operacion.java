/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Carpeta;

/**
 *
 * @author Fabián
 */
public class Operacion {

    /**
     * @param args the command line arguments
     */
    int suma;
    public int Sumar(int num1, int num2){
        suma = num1 +  num2;
        return suma;
}
    int resta;
        public int Restar(int num1, int num2){
resta = num1 - num2;
return resta;
}
        int multiplicacion ;
        public int Multiplicar(int num1 , int num2){
    multiplicacion = num1 * num2;
    return multiplicacion ;
}   
    int division; 
    public int Dividir(int num1, int num2){
division = num1 / num2;
return division;
}

    int cuadrado;
    public int elevarCuadrado(int num1){
        cuadrado = num1*num1;
        return cuadrado;
       
    }
    int cubo;
    public int elevarCubo(int num1){
        cubo = num1*num1*num1;
        return cubo;
    }
    int Promedio;
    public int promediar(int num1, int num2){
        Promedio = (num1+num2)/2;
        return Promedio;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
