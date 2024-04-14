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
package ex03.entities;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 09/04/2024
 * @brief Class Alturas
 */
public class Alturas {
    private String name;
    private Integer idade;
    private Double altura;
    private static Double somaAlturas = 0.0;
    private static Integer menor16 = 0;

    public Alturas() {
    }

    public Alturas(String name, Integer idade, Double altura) {
        this.name = name;
        this.idade = idade;
        this.altura = altura;
        addAltura(altura);
        verificaMenor16(idade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
        verificaMenor16(idade);
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
        addAltura(altura);
    }

    private static void addAltura(Double altura) {
        somaAlturas += altura;
    }

    private void verificaMenor16(Integer idade) {
        if (idade < 16) {
            menor16++;
        }
    }

    public static Double getSomaAlturas() {
        return somaAlturas;
    }

    public static Integer getMenor16() {
        return menor16;
    }

    public void NomesMenor16() {
        if (idade < 16) {
            System.out.println(this.name);
        }
    }
}
