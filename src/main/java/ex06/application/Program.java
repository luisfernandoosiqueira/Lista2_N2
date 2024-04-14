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
package ex06.application;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 13/04/2024
 * @brief Class Program
 */
import ex06.entities.SomaVetores;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantos valores vai ter cada vetor? ");
        n = sc.nextInt();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];

        System.out.println("Digite os valores do vetor A:");

        for (int i = 0; i < n; i++) {
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");

        for (int i = 0; i < n; i++) {
            vetorB[i] = sc.nextInt();
        }

        SomaVetores soma = new SomaVetores();
        soma.somarVetores(vetorA, vetorB);

    }
}
