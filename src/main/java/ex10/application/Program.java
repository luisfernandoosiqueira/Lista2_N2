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
package ex10.application;

import ex10.entities.AlunosAprovados;
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
        
        System.out.print("Quantos alunos serao digitados? ");
        n = sc.nextInt();
        
        String[] vetorNomes = new String[n];
        double[] vetorNota1 = new double[n];
        double[] vetorNota2 = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
            sc.nextLine();
            vetorNomes[i] = sc.nextLine();
            vetorNota1[i] = sc.nextDouble();
            vetorNota2[i] = sc.nextDouble();
        }
        
        AlunosAprovados alunos = new AlunosAprovados();
        
        alunos.encontrarAprovados(vetorNomes, vetorNota1, vetorNota2);
        
    }
}
