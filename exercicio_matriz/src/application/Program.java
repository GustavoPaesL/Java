package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int line;
		int column;
		
		System.out.println("insita o numero de linhas");
		line = sc.nextInt();
		System.out.println("insita o numero de colunas");
		column = sc.nextInt();
		
		int[][] matriz = new int[line][column];
		
		for(int i = 0; i < matriz.length; i++) {
			
			for(int j = 0; j < matriz[i].length; j++) {
				
				matriz[i][j] = sc.nextInt();
				
			}
			
		}
		
		System.out.println("insira X");
		int X = sc.nextInt();
		
		
		for(int i = 0; i < matriz.length; i++) {
			
			for(int j = 0; j < matriz[i].length; j++) {
				
				if(matriz[i][j] == X) {
					
					if(j-1 >= 0) {
						System.out.printf("left: %d%n", matriz[i][j-1]);
					}
					if(i-1 >= 0) {
						System.out.printf("top: %d%n", matriz[i-1][j]);
					}
					if(j+1 < matriz[i].length) {
						System.out.printf("right: %d%n", matriz[i][j+1]);
					}
					if(i+1 < matriz.length) {
						System.out.printf("down: %d%n", matriz[i+1][j]);
					}
					System.out.println("////////////////////////");
					
				}
				
			}
			
		}
		
		
			
		sc.close();
	}

}
