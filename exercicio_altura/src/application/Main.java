package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Person;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double soma = 0;
		
		System.out.println("insira o numero de pessoas:");
		int N = sc.nextInt();
		sc.nextLine();
		
		Person[] people = new Person[N];
		
		//coleta dos dados
		
		for(int i = 0; i < people.length; i++) {
			
			System.out.println("nome da " + (i+1) + "a pessoa:" );
			String name = sc.nextLine();
			System.out.println("idade da " + (i+1) + "a pessoa:" );
			int age = sc.nextInt();
			System.out.println("altura da " + (i+1) + "a pessoa:" );
			double height = sc.nextDouble();
			sc.nextLine();
			
			people[i] = new Person(name, age, height);	
			
		}
		
		//média de altura
		for(int i = 0; i < people.length; i++) {
			
			soma += people[i].getHeight();
			
		}
		double heightMedia = soma/people.length;
		System.out.printf("altura média: %.2f %n", heightMedia);
		
		//pessoas com menso de 16
		soma = 0;
		
		for(int i = 0; i < people.length; i++) {
			
			if(people[i].getAge() < 16) {
				
				soma += 1;
				
			}
			
		}
		double minus16 = soma/people.length * 100;
		System.out.printf("Pessoas com menos de 16 anos: %.2f%% %n", minus16);
		
		for(int i = 0; i < people.length; i++) {
			
			if(people[i].getAge() < 16) {
				
				System.out.println(people[i].getName());
				
			}	
			
		}
		
		
		sc.close();
	}

}
