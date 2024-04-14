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
package ex10.entities;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 14/04/2024
 * @brief Class AlunosAprovados
 */
public class AlunosAprovados {

    public AlunosAprovados() {
    }

    public void encontrarAprovados(String[] vetorNome, double[] vetorNota1, double[] vetorNota2) { // Método para encontrar alunos aprovados
        int tamanho = vetorNome.length;

        System.out.println("Alunos aprovados:");

        for (int i = 0; i < tamanho; i++) {

            double media = (vetorNota1[i] + vetorNota2[i]) / 2;

            if (media >= 60) {
                System.out.printf("%s\n", vetorNome[i]);

            }

        }

    }
}
