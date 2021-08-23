import java.util.*;
public class dois {
	public static void main (String[]args) {
		Scanner ler = new Scanner (System.in);
		int m,n;
		System.out.println("Digite o dois números para o tamanho da linha: ");
		m= ler.nextInt();
		
		n= ler.nextInt();
		
		int v [] [] = new int [m][n];
		
		int M, N;
		for (M=0; M<m; M++) {
			for (N=0; N<n; N++) {
				System.out.println("Digite um número: ");
				v [M][N] = ler.nextInt();
				
			}
		}
		for (M=0; M<m;M++) {
			for (N=0; N<n; N++) {
				System.out.print(v[M][N]+" ");
			}
			System.out.print("\n");
		}
		
	}
}

