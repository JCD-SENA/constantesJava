package juanca.constantesjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ejercicio 2
Una compañia necesita determinar cuales son sus ganancias dentro de n meses, pero cada mes tienen que invertir el 10% en el personal.
*/

public class Ejercicio2 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        final int cost = 10;
        int n;
        float profit;
        System.out.print("Ingrese las ganancias mensuales: ");
        profit = Float.parseFloat(input.readLine());
        System.out.print("Ingrese la cantidad de meses: ");
        n = Integer.parseInt(input.readLine());
        float monthlyExpenses = (profit / 100) * cost;
        System.out.println((profit - monthlyExpenses) * n);
    }
}
