package ParOuImpar;

import java.util.Scanner;

public class VerificadorParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Loop principal para permitir várias perguntas
        while (true) {
            System.out.println("Para sair do programa digite o numero 0");
            System.out.print("Digite um numero inteiro: ");

            int numero = scanner.nextInt();

            //Verifica se o usuário deseja sair
            if (numero == 0) {
                System.out.println("Saindo do programa. Ate mais!");
                break; // Sai do loop
            }
            // Verifica se o numero é par ou impar
            if (numero % 2 == 0) {
                System.out.println(numero + " e um numero par.");
            } else {
                System.out.println(numero + " e um numero impar.");
            }
        }
    }
}
