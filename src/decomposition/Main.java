package decomposition;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	List<Double> nota = new ArrayList<>();
	List<Double> moeda = new ArrayList<>();
	
	
// ler um valor monetario x e calcular o menor  numero de notas e moedas possiveis no qual o valor pode ser decomposto.

	nota.add(100.00);
	nota.add(50.00);
	nota.add(20.00);
	nota.add(10.00);
	nota.add(5.00);
	nota.add(2.00);

	moeda.add(1.00);
	moeda.add(0.50);
	moeda.add(0.25);
	moeda.add(0.10);
	moeda.add(0.05);
	moeda.add(0.01);

	System.out.print("Entre com um valor :");
	 double v = sc.nextDouble();
	 
System.out.println("----------------------------------");
	 System.out.println("NOTAS:");

	for ( Double i : nota ){
	double qntd = (int)v/i ;
	int r = (int) qntd ;
	System.out.println(r+" nota(s) de R$ "+String.format("%.2f",i));
	 v-= r*i;
	}
	System.out.println();
	System.out.println("MOEDAS:");

	for (Double i : moeda ){
	double qntd =  Math.round((int)(v/i)) ;
	int r = (int) qntd ;
	System.out.println(r+ " moeda(s) de R$ "+ i);
	 v-= qntd*i;
	}
	System.out.println("----------------------------------");


sc.close();
	}

}
