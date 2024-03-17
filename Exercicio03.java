import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double A, B, C, delta;

        System.out.println("Digite a variável A: ");
        A = input.nextDouble();

        System.out.println("Digite a variável B: ");
        B = input.nextDouble();

        System.out.println("Digite a variável C: ");  
        C = input.nextDouble();
        
        delta = (B * B) - 4 * A * C;

        if (A == 0 && B == 0 && C != 0) {
            System.out.println("Coeficientes informados incorretamente!");
        } else if (A == 0 && B != 0) {
            System.out.println("Essa é uma equação de primeiro grau!");

            double raiz;
            raiz = -C / B;
            System.out.println("O valor da equação de primeiro grau é: " + raiz);
        } else if (delta < 0) {
            System.out.println("Esta equação não possui raízes reais!");
        } else if ( delta == 0) {
            System.out.println("Esta equação possui duas raízes reais iguais.");

            double raiz1, raiz2;
            raiz1 = (-B + Math.sqrt(delta)) / 2 * A;
            raiz2 = (-B - Math.sqrt(delta)) / 2 * A;
            System.out.println("O valor da primeira raiz é: " + raiz1);
            System.out.println("O valor da segunda raiz é: " + raiz2);
        } else {
            System.out.println("Esta equação possui duas raízes reais diferentes.");
            
            double raiz1, raiz2;
            raiz1 = (-B + Math.sqrt(delta)) / 2 * A;
            raiz2 = (-B - Math.sqrt(delta)) / 2 * A;
            System.out.println("O valor da primeira raiz é: " + raiz1);
            System.out.println("O valor da segunda raiz é: " + raiz2);
        }
        input.close();
    }    
}