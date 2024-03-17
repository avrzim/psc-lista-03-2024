import java.util.Scanner;

public class Exercicio02{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valorPago, valorCompra;
        
        System.out.println("Digite o valor da sua compra: ");
        valorCompra = input.nextInt();
        System.out.println("Digite o quanto que você pagou: ");
        valorPago = input.nextInt();

        if (valorPago < valorCompra){
            System.out.println("O valor pago é insuficiente para pagar a compra!");
        } else{

            int troco;
            troco = valorPago - valorCompra;

            int notas50;
            notas50 = troco / 50;
            troco %= 50;

            int notas20;
            notas20 = troco / 20;
            troco %= 20;

            int notas10;
            notas10 = troco / 10;
            troco %= 10;

            int notas5;
            notas5 = troco / 5;
            troco %= 5;

            int notas2;
            notas2 = troco / 2;
            troco %= 2;

            int notas1;
            notas1 = troco;

            if (notas50 > 0){
                System.out.println("A quantidade de notas de 50 reais é: " + notas50);
            }
            if (notas20 > 0){
                System.out.println("A quantidade de notas de 20 reais é: " + notas20);
            }
            if (notas10 > 0){
                System.out.println("A quantidade de notas de 10 reais é: " + notas10);
            }
            if (notas5 > 0){
                System.out.println("A quantidade de notas de 5 reais é: " + notas5);
            }
            if (notas2 > 0){
                System.out.println("A quantidade de notas de 2 reais é: " + notas2);
            }
            if (notas1 > 0){
                System.out.println("A quantidade de notas de 1 reais é: " + notas1);
            }
            int trocoFinal;
            trocoFinal = valorPago - valorCompra;
            System.out.println("Troco total :" + trocoFinal);
        }
        input.close();
    }
}