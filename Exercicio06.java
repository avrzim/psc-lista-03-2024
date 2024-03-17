import java.util.Scanner;
import java.util.Random;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int num1, num2, menor, maior, sorteio;

        System.out.println("Digite o primeiro número inteiro:");
         num1 = input.nextInt();

        System.out.println("Digite o segundo número inteiro:");
         num2 = input.nextInt();

         menor = Math.min(num1, num2);
         maior = Math.max(num1, num2);

        sorteio = rand.nextInt((maior - menor) + 1) + menor;

        System.out.println("Número sorteado: " + sorteio);

        if (sorteio % 2 == 0) {
            System.out.println("O número sorteado é par.");
        } else {
            System.out.println("O número sorteado é ímpar.");
        }

        input.close();
    }
}
