import java.util.Scanner;
public class pagamento {
	public static void main (String []args) {
		Scanner ler = new Scanner (System.in);
		int resposta=1;
		while(resposta ==1) {
		switch (resposta) {
		

		case 1:
		System.out.println("Digite 1 para pagar a vista com 10% de desconto, 2 para pagar em duas vezes, 3 para pagar de 3 at� 10 vezes com 3% de juros ao m�s");
		int res = ler.nextInt();
		
		switch (res) {
			case 1:
				System.out.println("Digite o total gasto na compra: ");
				double n = ler.nextDouble();
				System.out.println("O resultado �: "+(op1(n)));
				break;
				
			case 2:
				System.out.println("Digite o total gasto na compra: ");
				  n = ler.nextDouble();
				  System.out.println("Voc� pagar� duas parcelas de: "+(vx2(n)));
					break;
				   

			case 3:
				
				System.out.println("Digite o total gasto na compra: ");
				  n = ler.nextDouble();
				  System.out.println("Digite o n�mero de parcelas: ");
				 int  pa = ler.nextInt();
				  System.out.println("Voc� pagar� "+pa+" parcelas de R$: "+(juros100(n,pa)));
					break;
				
		}
		
		System.out.println("Deseja continuar? Digite 1-SIM,2-N�O!");
		resposta=ler.nextInt();
		}
		}
	}
	public static double op1(double num) {
		
		return num=(double) num-((num*0.10 ));
		}
	
	public static double  vx2 (double num) {
		return num=(double) num/2;
			
		}	
	
	public static double  juros100 (double num,int pa) {
		
		
		if (num>=100) {
			num = (pa * 0.03)*100*pa +(num)/pa;
		}
		
		else {
			System.out.println("n�o � poss�vel selecionar essa op��o de pagamento!");
		}
		return num;
		

	}
}
