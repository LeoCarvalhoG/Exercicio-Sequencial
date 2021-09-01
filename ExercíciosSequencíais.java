package exercíciosSequenciais;

import java.util.Scanner;

//"Programa" no Portugol
public class ExercíciosSequencíais {
	
	//Seria o Início
	public static void main (String[]args) {
		
		
				int diasAno, diasMes = 30;
				int dias, meses, anos=0;

				Scanner leia = new Scanner (System.in);

				System.out.println("informe sua idade em anos: ");
				anos = leia.nextInt();
				
				System.out.println("meses: ");
				meses = leia.nextInt();
				
				
				System.out.println("dias: ");
				dias = leia.nextInt();;

				diasAno = (anos * 365) + (meses * diasMes) + dias;
								
				System.out.println("sua idade em dias é: " + diasAno);
				
				leia.close();
		
	}
}
