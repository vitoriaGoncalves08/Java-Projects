import java.util.*;
public class um {
	public static void main(String[]args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite o tamanho: ");
		int n =ler.nextInt();
		
		int V [] [] = new int [n][n];

		int i=0, j;
		for (i=0; i<n; i++) {
			for (j=0; j<n; j++) {
				System.out.println("Digite um número: ");
				V [i][j] = ler.nextInt();
				
			}
		}
		for (i=0; i<n; i++) {
			for (j=0; j<n; j++) {
				System.out.print(V[i][j]+" ");
			}
			System.out.print("\n");
			
		
	}
		System.out.println("Main diagonal:");
		System.out.print(V[0][0]+", ");
		System.out.print(V[1][1]+", ");
		System.out.print(V[2][2]);
		 
		
}
} 