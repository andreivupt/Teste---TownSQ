import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Testando {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> p1 = new ArrayList<Integer>(); 
		ArrayList<Integer> p2 = new ArrayList<Integer>();
		ArrayList<Integer> array = new ArrayList<Integer>();		
		
		System.out.println("Informe o tamanho do array: ");
		int valor = in.nextInt();
		
		if(valor >= 4 && valor <= 100) {
			
			//CRIA E EXIBE O ARRAY
			Random rand = new Random();
			for (int i = 0; i < valor; i++) {
				array.add(rand.nextInt(10));				
			}	
			Iterator<Integer> it = array.iterator();
			while(it.hasNext()) {
				System.out.print(it.next()+" ");
			}
			
			System.out.print("\n");
			
			//MONTANDO P1 E P2
			for(int i=0; i<array.size(); i++) {
				//int j=0;
				while(i < 2) {					
					p1.add(i,array.get(i));
					p2.add(i,array.get(i+2));
					i++;
				}
				int k=0;
				if(p1.get(k)+p2.get(k) == p1.get(k+1)+p1.get(k+1)) {
					int maior=0;
					it = p1.iterator();
					it = p2.iterator();
					while(it.hasNext()) {
						if(it.next() > maior) {
							maior = it.next();
							System.out.println("Maior"+maior);
						}
					}
					System.out.println("Array BOM");
				}
				
				System.out.print("\n");
				
				it = p1.iterator();
				while(it.hasNext()) {
					System.out.print(it.next());			
				}
				System.out.print("\n");
				it = p2.iterator();
				while(it.hasNext()) {
					System.out.print(it.next());
				}
			} //for(int i=0; i<array.size(); i++) {
		} else {
			System.out.println("Valor invalido!");
		}
		
		
		
		
		
		
		
		//EXIBIR VARIAVEIS
		/*System.out.print("P1: ");
		for(int num : p1) {
			System.out.print(num+" ");
		}
		System.out.print("\n");
		System.out.print("P2: ");
		for(int num : p2) {
			System.out.print(num+" ");
		}*/
		
		System.out.print("\n\n");
		
		/*
		int soma1 = p1[0] + p2[0];
		int soma2 = p1[1] + p2[1];
		if(soma1 == soma2) {
			System.out.println("Array é 'bom'");
		} else {
			System.out.println("Array não é bom");
		}
		System.out.print("\n");
		System.out.print(p1[0]+" + "+p2[0]+" = "+soma1);
		System.out.print("\n");
		System.out.print(p1[1]+" + "+p2[1]+" = "+soma2);
		*/
		
		in.close();
	}

}
