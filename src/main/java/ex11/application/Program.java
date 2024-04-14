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
package ex11.application;

import ex11.entities.DadosPessoas;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 14/04/2024
 * @brief Class Program
 */
public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        Double[] vetorAltura = new Double[n];
        Character[] vetorGenero = new Character[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            vetorAltura[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i + 1);
            vetorGenero[i] = sc.next().charAt(0);
        }

        DadosPessoas pessoas = new DadosPessoas();
        pessoas.mostrarDados(vetorAltura, vetorGenero);

    }
}
