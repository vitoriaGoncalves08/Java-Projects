import java.util.Scanner ;
public class pares {
	public static void main (String[]args) {
		Scanner ler = new Scanner (System.in);
	
		int [] A = new int [10];
		for (int i=0; i<10; i++) {
			System.out.println("Digite um n�mero: ");
			A [i]= ler.nextInt ();
			
			System.out.println("Os n�meros pares at� o n�mero "+ A[i]+" s�o:");
			
			for (int d=1; d<=A[i];d++) {
				if (d%2==0) {
					System.out.println(d);
				}
			}System.out.println("   ");
		}
	}
}
