/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem3;

import java.util.Scanner;

/**
 *
 * @author Lopez Avila
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se declara la variable para almacenar la cadena de entrada
        String numbers;
        //Importamos y realizamos el llamado a la clase Scanner para capturar los valores de entrada
        Scanner sc = new Scanner(System.in);
        
        //Imprimimos un mensaje para capturar la linea de entrada
        System.out.println("Ingrese los números separados por espacio");
        //Guardamos los datos de entrada
        numbers = sc.nextLine();
        
        //Validamos que el tamaño de la linea sea igual a 3, por que si es menor o mayor no se puede sumar 
        if(numbers.length() == 3){
            //Realizamos una separación del string por espacios para obtener los dos números
            String[] number = numbers.split(" ");
            //Creamos un objeto de la misma clase para hacer uso del método suma
            Problem3 p3 = new Problem3();
            /*
            *   Imprimimos el resultado
            *   Para utilizar la función suma, es necesario pasar dos parametros de tipo entero
            *   pero al realizar el split retorna dos string, por eso es necesario realizar un cast
            */
            System.out.println(p3.suma(Integer.parseInt(number[0]), Integer.parseInt(number[1])));
        }else{
            //En caso de que el tamaño del string no sea a 3 retornamos el siguiente mensaje
            System.out.println("Error, no se puede sumar");
        }
    }
    
    public int suma(int x, int y){
        return x + y;
    }
}
