package exercíciosSequenciais;

import java.util.Scanner;

			//"Programa" no Portugol
				
				public class ExercíciosSequencíais03 {
	
			//Seria o Início
				
				public static void main (String[]args) {
		
				Scanner leia = new Scanner (System.in);
				
				
				int horas, minutos, segundos;
				
				System.out.println("Informe segundos do evento: ");
				segundos = leia.nextInt();
				
				horas = segundos/3600;
				minutos = segundos%3600/60;
				segundos = minutos % 60;
				
				
				
				System.out.println("Seu evento tem: " + horas + " horas: " + minutos + " minutos: " + segundos + " segundos ");
				
						
				leia.close();
				
				
				
				
		
	}
}