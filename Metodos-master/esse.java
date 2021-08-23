import java.util.*;
public class esse {
	public static void main (String []args){
		Scanner ler = new Scanner (System.in);
		int resposta=1;
		while(resposta ==1) {
		switch (resposta) {
		
		case 2:
			break;
		case 1:
		System.out.println("Digite 1 para Fatorial, 2 para Tabuada, 3 para Aposentadoria, 4 Potência: ");
		int nemero = ler.nextInt();
		
		switch (nemero) {
			case 1:
				System.out.println("Digite um numero para obter seu fatorial: ");
				int n = ler.nextInt();
				System.out.println("O resultado é: "+(fato(n)));
				break;
				
			case 2:
				System.out.println("Digite um numero para obter a sua tabuada: ");
				  n = ler.nextInt();
				   ;
			tabu(n);
				break;
				
			case 3:
				String sexo,feminino = null,masculino = null;
				int t, id,r = 0;
				
				System.out.println("Digite seu sexo para obter a sua aposentadoria: ");
				 sexo=ler.next();
				System.out.println("Digite idade para obter a sua aposentadoria: ");
				 id=ler.nextInt();
				 Aposen( id, sexo,feminino, masculino, r);
				
				break;
				
			case 4:
				System.out.println("Digite a base para obter sua potência: ");
				int base=ler.nextInt();
				System.out.println("Digite o expoente para obter sua potência: ");
				int expoente=ler.nextInt();
				Potência(base,expoente, expoente);
		}
		
		System.out.println("Deseja continuar? Digite 1-SIM,2-NÃO!");
		resposta=ler.nextInt();
		}
		}
	}
	public static int fato(int num) {
		int j=1, fatori=1;
		while (j<=num) {
			fatori=fatori*j;
			j++;
		}
		return fatori;
	
	}
	public static int  tabu (int num) {
		int i=1;
		while (i<=10){
			
			int t=num*i;
			System.out.println(num+"x"+i+"="+t);
			i++;
			
		}	return num ;
		
	}
	public static int Aposen(int id,String sexo,String feminino,String masculino,int r) {
	     switch(sexo) {
	    case "feminino" :
	    r = (55-id);
	    System.out.println( "Faltam " +r+  " anos para se aposentar!");
	        break;  
	    }
	  switch(sexo) {
   	case "masculino" :
   	r = (60-id);
   	System.out.println("Faltam " +r+  " anos para se aposentar!");
		    break;
 
	    		}
	  return r;
	    }
			
		
	
	 public static void Potência(int base, int expoente, int pote) {
		  if (expoente>0){
          pote =1;
          
     for(int i = 0;i<expoente;i++){
         pote= pote*base;
     }
     System.out.println("O resultado da Potência é de: " +pote);
         
     }
 
 }
	
}
