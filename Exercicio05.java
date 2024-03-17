import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1,num2;
        char op;

        System.out.println("Digite o primeiro número: ");
        num1 = input.nextDouble();

        System.out.println("Digite o segundo número:");
        num2 = input.nextDouble();

        System.out.println("Digite + para soma, - para subtração, * para multiplicação, / ou ^ para divisão");
        op = input.next().charAt(0);

        if (op == '+') {
            double valor;
            valor = num1 + num2;
            System.out.println("O valor da soma é: " + valor);
        } else if (op == '-') {
            double valor;
            valor = num1 - num2;
            System.out.println("O valor da subtração é: " + valor);
        } else if (op == '*') {
            double valor;
            valor = num1 * num2;
            System.out.println("O valor da multiplicação é: " + valor);
        } else if (op == '/') {
            if (num2 != 0) {
                double valor;
                valor = num1 / num2;
                System.out.println("O valor da divisão é: " + valor);
            } else {
                System.out.println("Não é possível dividir por zero!");
            }
        } else if (op == '^') {
            double valor;
                valor = Math.pow(num1, num2);
                System.out.println("O valor da potênciação é: " + valor);
        } else {
            System.out.println("O símbolo da operação é inválido! use +, -, *, / ou ^ para funcionar!");
        }
        input.close();
    }
}