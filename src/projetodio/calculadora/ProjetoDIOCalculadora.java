package projetodio.calculadora;
import java.util.Scanner;

public class ProjetoDIOCalculadora {

    public static void main(String[] args) {
        Scanner receba = new Scanner(System.in);
        
        int a, b;
        System.out.println("Informe o primeiro valor: ");
        a = receba.nextInt();
        System.out.println("Informe o segundo valor: ");
        b = receba.nextInt();
        
        int soma = soma(a,b);
        int subtracao = subtracao(a,b);
        int multipicacao = multipicacao(a,b);
        float divisao = divisao(a,b);
        
        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A subtração dos valores é: " + subtracao);
        System.out.println("A multiplicação dos valores é: " + multipicacao);
        System.out.println("A divisão dos valores é: " + divisao);
          
    }
    public static int soma(int a, int b) {
        return a + b;
    }
    public static int subtracao(int a, int b) {
        return a - b;
    }
    public static int multipicacao(int a, int b) {
        return a * b;
    }
    public static float divisao(int a, int b) {
        return a / b;
    }
    
}