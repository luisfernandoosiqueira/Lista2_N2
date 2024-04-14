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
package ex03.application;

import ex03.entities.Alturas;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 09/04/2024
 * @brief Class Program
 */
public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine(); // Consumir a linha restante
            System.out.printf("Dados da %da pessoa:\n", i + 1);

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            new Alturas(nome, idade, altura); // Criar uma nova instância de Alturas para cada pessoa
        }

        double alturaMedia = Alturas.getSomaAlturas() / n;
        double percentualMenores = (double) Alturas.getMenor16() / n * 100;

        System.out.printf("Altura média: %.2f\n", alturaMedia);
        System.out.printf("Percentual de pessoas com menos de 16 anos: %.2f%%\n", percentualMenores);

        sc.close();
    }
}
