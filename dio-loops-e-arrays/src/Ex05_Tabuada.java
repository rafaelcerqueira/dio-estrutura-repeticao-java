/*
Desenvolva um gerador de tabuada capaz de:
Gerar a tabudada de qualquer número inteiro entre 1 e 10.
O usuário deve informar qual o número ele deseja ver a tabuada.
A saida deve ser conforme o exemplo avaixo:

Tabuada de 5:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 5-
 */

import java.util.Scanner;

public class Ex05_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }
    }
}