package exerc�ciosSequenciais;

import java.util.Scanner;

			//"Programa" no Portugol
				public class Exerc�ciosSequenc�ais02 {
	
			//Seria o In�cio
				public static void main (String[]args) {
		
				Scanner leia = new Scanner (System.in);
				
				
				int anos, meses, dias, dia;
				
				System.out.println("informe sua idade em dias: ");
				dia = leia.nextInt();
				
				anos = dia/365;
				meses = dia%365/30;
				dias = meses%30;
				
				
				
				System.out.println("Sua idade em anos: " 
				+ anos + " meses: " + meses + " dias: " + dias);
				
						
				leia.close();
				
				
				
				
		
	}
}