import java.util.*;
public class juros {
	public static void main (String []args) {
		Scanner ler = new Scanner (System.in);
		double vi;
		int qm;
		
	System.out.println("Digite seu valor investido: ");
	 vi=ler.nextDouble ();
		System.out.println("Digite o número de meses que seu dinheiro ficou investido: ");
	qm=ler.nextInt ();
	
	System.out.println(juros(vi,qm));
	
	
	}
	public static double juros(double vi,int qm) {
		
		for(int i=1; i<=qm;i++ ) {
		
		vi=(vi*0.01 )+vi;
	
		}
		return vi;
		
	}
}
