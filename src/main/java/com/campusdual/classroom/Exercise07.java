package com.campusdual.classroom;
import java.util.List;
import java.util.ArrayList;


public class Exercise07 {

    public static void main(String[] args) {

    }

    //TODO ↓
    // ESTE MÉTODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {
    List<Integer> numbers = new ArrayList<>();

    for(int i=0; i<=10;i++){
        numbers.add(i);
    }
    int position=0;
    boolean found = false;

    for (int number : numbers){
        if( number == num){
            System.out.println( num + " se encuentra en la posición: " + position);
            found=true;
            break;
        }
        position++;
        }

        if(!found){
            System.out.println(num + " no se encuentra en la lista.");
        }
    }

    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
        int sum=0;
        for(int i=0; i<=num; i++){
            sum+=i;
        }
        System.out.println(sum);
    }

    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        for(int i=0; i<=num; i++){
            System.out.println(i);
        }
    }

}
