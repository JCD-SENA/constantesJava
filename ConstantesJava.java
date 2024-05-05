package juanca.constantesjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ejercicio 1 
Convertir unidades del sistema imperial a metrico
*/

public class ConstantesJava {
    final static float POUND_KG = 0.453592f, INCH_CM = 2.54f, GALLON_LITER = 3.78541f;
    public static void main(String[] args) throws IOException {
        float pounds, inches, gallons;
        float kg, cm, l;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese una cantidad de libras: ");
        pounds = Float.parseFloat(input.readLine());
        System.out.print("Ingrese una cantidad de pulgadas: ");
        inches = Float.parseFloat(input.readLine());
        System.out.print("Ingrese una cantidad de galones: ");
        gallons = Float.parseFloat(input.readLine());
        kg = pounds * POUND_KG;
        cm = inches * INCH_CM;
        l = gallons * GALLON_LITER;
        System.out.println("\n"+pounds+" libras son "+kg+" gramos");
        System.out.println("\n"+inches+" pulgadas son "+cm+" centimetros");
        System.out.println("\n"+gallons+" galones son "+l+" litros");
    }
}
