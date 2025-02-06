package exercicioslacoderepeticao;

import java.util.Scanner;

public class forExercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leia = new Scanner(System.in);

        int pares = 0, impares = 0;
        

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + " número: ");
            int numero = leia.nextInt();
            
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Total de números pares: " + pares);
        System.out.println("Total de números ímpares: " + impares);

		}
		
		
	}


