import java.util.Scanner;
public class oito {
	public static void main (String []args) {
		Scanner ler = new Scanner (System .in);
		
		int [] A = new int [10];
		int [] B = new int [10];
		for (int i=0; i<10; i++) {
			System.out.println("Digite um número: ");
			A [i]= ler.nextInt ();
			A[i]=(A[i]*(A[i] + 1))/2;
			
			for (int j=0; j<1;j++) {
				B[j]=A[i];
			
					System.out.println("A somátoria de é igual a: " + B[j]);
				
			System.out.println("   ");
			}
		}
	}
}
