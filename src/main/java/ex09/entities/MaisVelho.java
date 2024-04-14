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

package ex09.entities;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 14/04/2024
 * @brief Class MaisVelho
 */
public class MaisVelho {

    private int maior = 0;
    int posmaior = 0;

            public MaisVelho() {
    }

    public void encontrarMaisVelho(String[] vetorNome, int[] vetorIdade) { // Método criado para encontrar pessoa mais velho .
        int tamanho = vetorIdade.length;
                
        maior = vetorIdade[0]; // Assume que o primeiro elemento é o maior inicialmente
        
        for (int i=1; i<tamanho; i++) {
	        if (vetorIdade[i] > maior) {
	            maior = vetorIdade[i];
	            posmaior = i;
	        }
	    }

	    System.out.printf("PESSOA MAIS VELHA: %s\n", vetorNome[posmaior]);
        
        
    
}
}