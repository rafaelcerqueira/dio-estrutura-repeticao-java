import java.util.Scanner;

/*
Faça um programa que leia 5 números.
Informe o maior número.
Informe a méida desses números.
 */

public class Ex03_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number;
        int higherNumber = 0;
        int accumulator = 0;
        int count = 0;

        do {
            System.out.println("Digite um número: ");
            number = scan.nextInt();

            accumulator = accumulator + number;

            if (number > higherNumber) {
                higherNumber = number;
            }

            count++;
        } while (count < 5);

        int average = accumulator / 5;

        System.out.println("O maior número digitado foi o: " + higherNumber);
        System.out.println("A média entre os números digitados é: " + average);
    }
}
