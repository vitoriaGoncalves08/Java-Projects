import java.util.Scanner;
public class EcerD{
	public static void main (String[]args){
	Scanner ler = new Scanner (System.in);
	int v[][] = new int [4][4];
		int i,j,s,n=1,d=0,b=0;
		int Random = 1;
		for (i=0;i<4;i++){
		   for (j=0;j<4;j++){
		v[i][j] = (int) (Math.Random()*20);
		  }
		}
		while (b<16){
		System.out.println ("Dgite um número: ");
		s=ler.nextInt();
		d++;
		n=0;
		
		  for (i=0;i<4;i++){
  			for (j=0;j<4;j++){
				if (s==v[i][j]{
				b=b+1;
		System.out.println ("O número está certo!!" );

			}
		}
	}
	if (b==16){
		System.out.println ("Bingo, você demorou "+d+" rodadas para acertar !");
	}	
	}
}