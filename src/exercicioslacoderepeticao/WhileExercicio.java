package exercicioslacoderepeticao;

import java.util.Scanner;

public class WhileExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Scanner leia= new Scanner(System.in);
	
		int maiores50=0, menores21=0;
	
		
		
		System.out.println("Digite a idade :");
		int idade = leia.nextInt();
		
		while (idade >= 0) { // O loop continua enquanto a idade for não negativa
            if (idade < 21) {
                menores21++;
            } else if (idade > 50) {
                maiores50++;
            }

            idade = leia.nextInt(); // Lê a próxima idade ao final de cada iteração
            maiores50 =leia.nextInt();
            
        }

        System.out.println("Total de pessoas menores de 21 anos: " + menores21);
        System.out.println("Total de pessoas maiores de 50 anos: " + maiores50);
        System.out.println("Digite as idades (idade negativa para finalizar):");
        leia.close();
	}

}
