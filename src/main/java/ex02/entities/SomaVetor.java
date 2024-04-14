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
package ex02.entities;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 08/04/2024
 * @brief Class SomaVetor
 */
public class SomaVetor {

    private double[] numeros;

    public SomaVetor(int tamanho) {
        this.numeros = new double[tamanho];
    }

    public void setNumero(int indice, double valor) {
        this.numeros[indice] = valor;
    }

    public double somaVetores() {
        double soma = 0;
        for (double num : numeros) {
            soma += num;
        }
        return soma;
    }

    public double mediaVetor() {
        double soma = somaVetores();
        return numeros.length > 0 ? soma / numeros.length : 0;
    }

    public void imprimirNumeros() {
        System.out.println("Numeros:");
        for (double num : numeros) {
            System.out.printf("%.1f\n", num);
        }

    }
}
