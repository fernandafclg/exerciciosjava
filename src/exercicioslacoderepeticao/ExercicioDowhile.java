package exercicioslacoderepeticao;

import java.util.Scanner;

public class ExercicioDowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  Scanner scanner = new Scanner(System.in);

	        int numero;
	        int somapositivos = 0;

	        do {
	            System.out.println("Digite um número: ");
	            numero = scanner.nextInt();

	            if (numero > 0) {
	                somapositivos += numero;
	            }
	        } while (numero != 0);

	        System.out.println("A soma dos numeros positivos é: " + somapositivos);

	        
	}

}
