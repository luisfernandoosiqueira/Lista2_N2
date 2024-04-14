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

package ex08.entities;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 14/04/2024
 * @brief Class MediaPares
 */
public class MediaPares {


    private Double soma = 0.0;
    private Double media;
    private Integer npares = 0;

    public MediaPares() {
    }



    public void calcularMediaPares(Double[] vetor) { // Método criado para encontrar média dos pares.

        int tamanho = vetor.length;

	    for (int i=0; i<tamanho; i++) {
	        if (vetor[i] % 2 == 0) {
	            soma += vetor[i];
	            npares++;
	        }
	    }

	    if (npares == 0) {
	    	System.out.println("NENHUM NUMERO PAR");
	    }
	    else {
	        media = (double)soma / npares;

	        System.out.printf("MEDIA DOS PARES = %.1f\n", media);
	    }

    }
}