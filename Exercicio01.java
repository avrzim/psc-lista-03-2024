import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n1, n2, n3;

        System.out.println("Digite o primeiro número: ");
        n1 = input.nextDouble();

        System.out.println("Digite o segundo número: ");
        n2 = input.nextDouble();
        
        System.out.println("Digite o terceiro número: ");
        n3 = input.nextDouble();

        double maiorNum;
        maiorNum = Math.max(n1, Math.max(n2, n3));

        double menorNum;
        menorNum = Math.min(n1, Math.min(n2, n3));

        double media;
        media = (n1 + n2 + n3) / 3;

        System.out.println("O maior número entre os três é: " + maiorNum);
        System.out.println("O menor número entre os três é: " + menorNum);
        System.out.println("A média desse três números é: " + media);

        input.close();       
    }
}