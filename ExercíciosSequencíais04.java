package exerc�ciosSequenciais;

import java.util.Scanner;

			//"Programa" no Portugol
				
				public class Exerc�ciosSequenc�ais04 {
	
			//Seria o In�cio
				
				public static void main (String[]args) {
		
				Scanner leia = new Scanner (System.in);
				
				
				int nota1, nota2, nota3, totalNotas, media;
				
				System.out.println("Informe sua 1� nota: ");
				nota1 = leia.nextInt();
				
				System.out.println("Informe sua 2� nota: ");
				nota2 = leia.nextInt();
				
				System.out.println("Informe sua 3� nota: ");
				nota3 = leia.nextInt();
				
				nota1 = nota1 * 2;
				nota2 = nota2 * 3;
				nota3 = nota3 * 5;
				
				totalNotas = nota1 + nota2 + nota3;
				
				media = totalNotas/10;
				
				System.out.println("Sua m�dia � de: " + media);
				
						
				leia.close();
				
				
				
				
		
	}
}