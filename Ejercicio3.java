package juanca.constantesjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ejercicio 3
Un programa que convierta años luz en metros
*/

public class Ejercicio3 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        final float lightSpeed = 299792458;
        int lightYears;
        System.out.print("Ingrese los años luz: ");
        lightYears = Integer.parseInt(input.readLine());
        System.out.println(lightSpeed * lightYears);
    }
}
