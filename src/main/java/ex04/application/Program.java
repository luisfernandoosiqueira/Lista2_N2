/*
 * Copyright (C) 2024 Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ex04.application;

import ex04.entities.Pares;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 08/04/2024
 * @brief Class Program
 */


public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        Pares[] vetorPares = new Pares[n];
        int somaPares = 0; // Variável para armazenar a soma dos números pares

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            Integer numero = sc.nextInt();
            vetorPares[i] = new Pares(numero);  // Cria uma instância de Pares para cada número
            if (vetorPares[i].isPar()) {
                somaPares += numero;  // Soma os números pares
            }
        }

        System.out.println("\nNUMEROS PARES:");
        for (Pares par : vetorPares) {
            par.imprimirSePar();  // Imprime o número se for par
        }

        // Imprime a soma dos números pares
        System.out.println("Soma dos números pares: " + somaPares);

        sc.close();
    }
}
