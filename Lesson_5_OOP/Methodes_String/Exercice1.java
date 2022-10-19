package Methodes_String;

import java.util.Scanner;
public class Exercice1 {

	public static void main(String[] args) 
	{
       
		Scanner sc=new Scanner(System.in);
		System.out.println("Nom : ");
		String nom=sc.nextLine();
		
		System.out.println("Prénom : ");
		String prenom=sc.nextLine();
		
		//Méthode 1
		System.out.println(nom.toUpperCase()+" "+prenom.substring(0, 1).toUpperCase()+prenom.substring(1).toLowerCase());
		
		//Méthode 2
		System.out.println(nom.toUpperCase()+" "+prenom.toUpperCase().charAt(0)+prenom.substring(1).toLowerCase());

	}

}
