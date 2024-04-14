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
package ex01.application;

import ex01.entities.Negativos;
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

        int n;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        Negativos[] vetor = new Negativos[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            Integer numero = sc.nextInt();

            vetor[i] = new Negativos(numero);

        }

        System.out.println();
        System.out.println("NUMEROS NEGATIVOS:");

        for (int i = 0; i < vetor.length; i++) {

            vetor[i].numerosNegativos();

        }

        sc.close();

    }

}
