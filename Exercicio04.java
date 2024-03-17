import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pi, raio;
        int op;

        System.out.println("Digite o valor do raio em centímetros: ");
        raio = input.nextDouble();

        System.out.println("Digite 1 para calcular o perímetro, 2 para calcular a área do circulo, 3 para calcular o volume da esfera");
        op = input.nextInt();

        pi = 3.141592;

        if (op == 1) {
            double valor;
            valor = 2 * pi * raio;
            System.out.println("O valor do perímetro do circulo é: " + valor + " cm");
        } else if (op == 2) {
            double valor;
            valor = pi * (raio * raio);
            System.out.println("O valor da área do círculo é: " + valor + "cm²");
        } else if (op == 3) {
            double valor;
            valor = pi * (raio * raio * raio) * 4/3;
            System.out.println("O valor do volume do círculo é: " + valor + "cm³");
        } else {
            System.out.println("O código da operação é inválido!");
        }
        input.close();
    }
}