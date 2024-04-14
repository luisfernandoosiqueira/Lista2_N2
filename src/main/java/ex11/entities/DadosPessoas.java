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
package ex11.entities;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 14/04/2024
 * @brief Class DadosPessoas
 */
public class DadosPessoas {

    private Integer qtdhomens = 0, qtdmulheres = 0;
    private Double menoraltura = 0.0, maioraltura = 0.0, alturafemMedia = 0.0, alturafemtotal = 0.0;

    public DadosPessoas() {
    }

    public void mostrarDados(Double[] vetorAltura, Character[] vetorGenero) { // Método para mostrar os dados das pessoas.
        int tamanho = vetorAltura.length;

        menoraltura = vetorAltura[0];
        maioraltura = vetorAltura[0];

        for (int i = 1; i < tamanho; i++) {
            if (vetorAltura[i] > maioraltura) {
                maioraltura = vetorAltura[i];
            }
            if (vetorAltura[i] < menoraltura) {
                menoraltura = vetorAltura[i];
            }
        }

        for (int i = 0; i < tamanho; i++) {
            if (vetorGenero[i] == 'M') {
                qtdhomens++;
            } else {
                qtdmulheres++;
                alturafemtotal = alturafemtotal + vetorAltura[i];
            }
        }

        alturafemMedia = alturafemtotal / qtdmulheres;

        System.out.printf("Menor altura = %.2f\n", menoraltura);
        System.out.printf("Maior altura = %.2f\n", maioraltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n", alturafemMedia);
        System.out.printf("Numero de homens = %d\n", qtdhomens);

    }
}
