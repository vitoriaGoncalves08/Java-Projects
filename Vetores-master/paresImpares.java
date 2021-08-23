import java.util.*; 
public class paresImpares {
	public static void main (String[] args) { 
		Scanner ler = new Scanner (System.in);
	int i;
	int pares[] = new int [20];
	int impares[] = new int [20];
	
	for(i=0;i<=20;i++) {
		if(i%2==0) {
			pares[19]=pares[19]+2;
		}
		
			impares[19] = pares[19]+1;
		
		System.out.println("Numeros pares: "+pares[19]);
		System.out.println("Numeros impares: "+impares[19]);
		i++;
	}

}
}
