package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		//Recuperer les données de notre fichier test.txt
	    int nbrX;
	    int nbrY;
	    int posX = 0;
	    int posY = 0;
	    String orientation = null;
	    String commande = null;
		try
		{
		    File f = new File ("test.txt");
		    Scanner scanner = new Scanner (f);
		    int i=0;
		    System.out.println("Notre Grille :");
		 
		    while (true)
		    {
		    	if(i==0) {
			        try
			        {
			        	nbrX = scanner.nextInt();
			        	nbrY = scanner.nextInt();
			        	System.out.println(nbrX +" "+nbrY);
			        }
			        catch (NoSuchElementException exception)
			        {
			            break;
			        }
		    	}
		    	if(i==1) {
			        try
			        {
			        	posX = scanner.nextInt();
			        	posY = scanner.nextInt();
			        	orientation = scanner.next();
			        	System.out.println(posX +" "+posY+" "+orientation);
			        }
			        catch (NoSuchElementException exception)
			        {
			            break;
			        }
		    	}
		    	if(i==2) {
			        try
			        {
			        	commande = scanner.next();
			        	System.out.println(commande);
			        }
			        catch (NoSuchElementException exception)
			        {
			            break;
			        }
		    	}		    	
		    	i++;
		    }		 
		    scanner.close();
		}
		catch (FileNotFoundException exception)
		{
		    System.out.println ("Le fichier n'a pas été trouvé");
		}
		

		Aspirateur aspirateur=new Aspirateur(posX,posY,orientation);
		for(int i=0;i<commande.length();i++) {
			
			if(commande.charAt(i)=='D'){
				aspirateur.commandeD();
			}
			if(commande.charAt(i)=='G'){
				aspirateur.commandeG();
			}
			if(commande.charAt(i)=='A'){
				aspirateur.commandeA();
			}
		}
		System.out.println("Le résultat est :"+aspirateur.toString());

	}

}
