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
package ex05.entities;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 13/04/2024
 * @brief Class MaiorPosicao
 */

public class MaiorPosicao {

    private int maior;
    int posmaior = 0;

    public MaiorPosicao() {
    }

    public void encontrarMaior(int[] vetor) { // Método criado para verificar o maior valor.
        int tamanho = vetor.length;
        maior = vetor[0]; // Assume que o primeiro elemento é o maior inicialmente

        for (int i = 1; i < tamanho; i++) {
            if (vetor[i] > maior) { // Compara cada número do vetor com o atributo maior iniciado com zero.
                maior = vetor[i]; // Caso seja verdadeiro o atributo maior recebe o valor do vetor.
                posmaior = i; // Posição do maior.
            }
        }

        System.out.printf("MAIOR VALOR = %d\n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);
    }
}

