/*
- Faça um programa que peça N números inteiros.
- Mostre a quantidade de números pares.
- Mostre a quantidade de números ímpares.
 */

import java.util.Scanner;

public class Ex04_ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeDeNumeros;
        System.out.println("Digite a quantidade de números desejada: ");
        quantidadeDeNumeros = scan.nextInt();

        int numero;
        int quantidadeDePares = 0;
        int quantidadeDeImpares = 0;
        int contador = 0;


        do {
            System.out.println("Digite um número inteiro: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantidadeDePares++;
            else quantidadeDeImpares++;

            contador++;
        } while (contador < quantidadeDeNumeros);

        System.out.println("A quantidade de números pares digitados é de: " + quantidadeDePares);
        System.out.println("A quantidade de números ímpares digitados é de: " + quantidadeDeImpares);
        System.out.println("Total de números digitados: " + contador);

    }
}
