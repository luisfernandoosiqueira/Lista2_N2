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
package ex06.entities;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 13/04/2024
 * @brief Class SomaVetores
 */
public class SomaVetores {

    private int vetorC[];

    public SomaVetores() {
    }

    public void somarVetores(int[] vetorA, int[] vetorB) { // Método criado para somar os Vetores.
        int tamanho = vetorA.length;
        vetorC = new int[tamanho]; // Inicializa vetorC com o mesmo tamanho de vetorA e vetorB.

        for (int i = 0; i < tamanho; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("VETOR RESULTANTE:");

        for (int i = 0; i < tamanho; i++) {
            System.out.printf("%d\n", vetorC[i]);
        }

    }
}
