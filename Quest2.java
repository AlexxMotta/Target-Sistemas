// Achei que seria mais adequado resolver essa questão em Java já que para receber uma entrada em JS
// eu precisaria o suar o prompt, como eu não sei onde o recrutador vai executar meu codigo e melhor
// não arriscar, afinal o prompt so funciona na janela do navegar, ele não é um comando nativo do JS
// no Node.

import java.io.IOException;
import java.util.Scanner;

public class Quest2 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        System.out.printf("Insira um número: ");
        int N = leitor.nextInt();
        int proximo, anterior = 0, atual = 1;
        System.out.printf("-0-1");
        while (N > atual) {
        	proximo = anterior + atual;
        	anterior = atual; 
        	atual =  proximo;
        	System.out.printf("-"+proximo);
        	if(N==atual){
        	    System.out.println();
        	    System.out.println("O número " + N + " pertence ao sequência de Fibonacci.");
        	}
        }
        System.out.println();
        System.out.println("Valor de N: " + N);
        System.out.println("Valor atual: " + atual);
    }
	
}
