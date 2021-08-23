import java.util.Scanner;
public class primos {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);


		int [] numeros = new int [10];
		int [] contador = new int [10];
		
		        

		        for(int i=1; i<10; i++){
		        	System.out.println("numero: ");
			        numeros[i]= sc.nextInt ();
			        
			        
			        for(int j=0; j<1; j++) {
			        	
		            if(numeros[i]%i==0){
		                contador[j]++;
		                System.out.println("É PRIMO");
		            
		                if (contador[j]==2){
		            System.out.println("É PRIMO");
		        }
		        } else{
		            System.out.println("NÃO É PRIMO");
		        }
			        }
	    }
	}
}