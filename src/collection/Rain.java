package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Rain {

	String month;
	int median;
	
	
	public Rain(String string, int i) {
		this.month = string;
		this.median = i;
	}

	public static void main(String[] args) {
		
		
		ArrayList<Rain> rain = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Mês:");
			String month = scan.nextLine();
			System.out.println("Média:");
			int median = scan.nextInt();
			rain.add(new Rain(month,median));
		}
		
		Collections.sort(rain, new Comparator<Rain>() {
			public int compare(Rain r1, Rain r2) {
				return Integer.valueOf(r1.median).compareTo(r2.median);
			}
		});
		
		System.out.println("Média de Chuvas: (ordem crescente)");
		for (int i = 0; i < rain.size(); i++) {
			System.out.println(i + " - " + rain.get(i).month);
			
		}		
	}

}
