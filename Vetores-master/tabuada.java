import java.util.Scanner;
public class tabuada {
	public static void main (String []args) {
		Scanner sc= new Scanner (System.in);
		
		int v[] = new int [5];
		int v2[] = new int [10];
	
		for (int i=0; i<5; i++){
			System.out.println("Digite o "+(i+1)+"° valor inteiro:");
			v[i]= sc.nextInt();
					
			for(int t=0;t<11;t++){
				v2[i]=v[i]*t;
				
				
				System.out.println(v[i]+" X "+t+ " = "+v2[i]);
				
			
			}
		}
			
	}
		
		}
		
	

