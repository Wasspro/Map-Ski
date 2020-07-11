import java.util.*;

public class Main {

	private static Scanner scan;
	private static String nom;
	static int t=0;

    public static void main(String[] args)
    {
    	
    	nom = "";
    	
    	
    	
    	scan = new Scanner(System.in);
        while(!nom.equals("1") && !nom.equals("2")) {
        		
        	System.out.println("Quel type de skieur êtes-vous ?");
            System.out.println("1 : Débutant ");
            System.out.println("2 : rapide");
            nom = scan.next();
            	
            if (!nom.equals("1") && !nom.equals("2")){
            		
            	System.out.println("vous devez entrer 1 ou 2, vous avez entré : "+ nom);
            		
            	}
        		
        	}
        	
        if (nom.equals("1")){
        		
        	System.out.println("Bon courage pour vos débuts !");
        	t=1;
        		
        	}
        else if (nom.equals("2")){
        	System.out.println("Vous êtes un rapide ça se voit tout de suite !");
        	t=2;
        		
        	}
        	
        scan.nextLine();
        	
        BaseDeDonee Bdd = new BaseDeDonee(t);
        	
        Sommet s1;
        Sommet s2;
        System.out.println("Ou vous trouvez-vous ? (ecrivez le nom de sommet tout en MAJUSCULE)");
           
        System.out.println();
            
        nom = scan.nextLine();
        s1=Fonctions.FindSom(nom);
        if (!s1.equals(Bdd.NULL)) {
            	
            System.out.println("Vous êtes à "+nom+", ou souhaitez vous aller ? (ecrivez le nom de sommet tout en MAJUSCULE)");
            nom = scan.nextLine();
            s2=Fonctions.FindSom(nom);
            if (!s2.equals(Bdd.NULL)) {
                Fonctions.Pluscourt(s1,s2);
                	
                }
                
            	
            }
            
            
            
            

    		
    	}
    		
    		
    	
   }
    	

