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
package ex07.entities;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 13/04/2024
 * @brief Class abaixoDaMedia
 */
public class abaixoDaMedia {

    private Double soma = 0.0;
    private Double media;

    public abaixoDaMedia() {
    }

    public void calcularMedia(Double[] vetor) { // Método criado para encontrar elementos abaixo da média.

        int tamanho = vetor.length;

        for (int i = 0; i < tamanho; i++) {
            soma += vetor[i];
        }

        media = soma / tamanho;

        System.out.printf("\nMEDIA DO VETOR = %.3f\n", media);
        System.out.println("---------------------------");
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] < media) {
                System.out.printf("%.1f\n", vetor[i]);
            }
        }

    }
}