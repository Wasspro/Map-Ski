import java.util.ArrayList;



public class Fonctions {





    public static int Min(int x, int y){
        if (x>y){

            return y;

        }

        return x;

    }
    




    public static int Dijk(Sommet deb, Sommet som1, Sommet som2, int temps, int tempsmin,  ArrayList<String> Chemin,ArrayList<String> CheminTest, ArrayList<PisteRemonte> save) { // la fonction de base
    	
        Sommet next;
        
        save.addAll(som1.getPisteRemonte()); // permet de sauvegarder les sommets qu'on supprime
            
        if (CheminTest.isEmpty()) { // si la liste est vide on dit le sommet de départ
        	
            CheminTest.add("- Vous êtes à "+ deb.getNom());
  	
        }
        

        int time =temps;

        //som1.check();

            while (!som1.getPisteRemonte().isEmpty()){

                time = time + som1.getPisteRemonte().get(0).getTemps();
                
                CheminTest.add("- Prenez "+ som1.getPisteRemonte().get(0).getType()+ " "+ som1.getPisteRemonte().get(0).getNom()+ " ("+ som1.getPisteRemonte().get(0).getTemps()+" minutes)");

                if (som1.getPisteRemonte().get(0).getSommet()==som2){ // si on atteint le sommet 2
                	
                    if(tempsmin!=-1){
          	
                    	if (tempsmin > time){
                    		Chemin.clear();
                    		Chemin.addAll(CheminTest);
                        		
                    	}
                    	                       	
                    	if (CheminTest.size()>1) {	
                        	
                        	CheminTest.remove(CheminTest.size()-1);

                        }         
                        tempsmin = Min(tempsmin,time);

                        time=temps;


                    }
                    
                    
                    else{
                    	
                    	//CheminTest.add("- Prenez "+ som1.getPisteRemonte().get(0).getType()+ " "+ som1.getPisteRemonte().get(0).getNom()+  " ("+ som1.getPisteRemonte().get(0).getTemps()+" minutes)");
                    	Chemin.addAll(CheminTest);
  	
                    	if (CheminTest.size()>1) {	
                        	
                        	CheminTest.remove(CheminTest.size()-1);
                        	
                  	
                        }

                        tempsmin=time;


                        time=temps;
                    }

                   
                    som1.getPisteRemonte().remove(0);
                   // som1.uncheck();

                }
                else if (som1.getPisteRemonte().get(0).getSommet().getPisteRemonte().size()==0 || som1.getPisteRemonte().get(0).getSommet() == deb || (time>tempsmin && tempsmin !=-1)) {
                    
                	//CheminTest.add("- Prenez "+ som1.getPisteRemonte().get(0).getType()+ " "+ som1.getPisteRemonte().get(0).getNom()+  " ("+ som1.getPisteRemonte().get(0).getTemps()+" minutes)");
                	
                	//som1.getPisteRemonte().get(0).getSommet().uncheck();
                	
                	som1.getPisteRemonte().remove(0); // on est tombé sur une piste qui ne mene nul part ou qui fait une boucle donc on revient
   
                    if (CheminTest.size()>1) {	
                    	
                    	CheminTest.remove(CheminTest.size()-1);
                    	
              	
                    }
                    
                    
                    
                    time = temps;
                    
                  // som1.uncheck();
 

                }

                else{

                	
                	
                	//CheminTest.add("- Prenez "+ som1.getPisteRemonte().get(0).getType()+ " "+ som1.getPisteRemonte().get(0).getNom()+  " ("+ som1.getPisteRemonte().get(0).getTemps()+" minutes)");

                    next=som1.getPisteRemonte().get(0).getSommet(); // on passe au suivant
                    som1.getPisteRemonte().remove(0); //  on suprime la piste d'avant puisqu'on l'a passé
  
                    tempsmin = Dijk(deb,next,som2,time,tempsmin,Chemin,CheminTest,new ArrayList<PisteRemonte>()); // on continue jusq'a atteindre le sommet 2
                    
                  //  check.remove(check.size()-1);
 
                    if (CheminTest.size()>1) {	
                    	
                    	CheminTest.remove(CheminTest.size()-1);
                    	
              	
                    }
                    
                    time = temps;
                   // som1.uncheck();
                }
            }
            som1.getPisteRemonte().addAll(save);
            
            if (som1==deb) { // ça signifie qu'on est revenu dans la première boucle donc on peut afficher le chemin
            	
                afficheChemin(Chemin);

            	          	
            }
  
        return tempsmin;


    }
    
    
    
    public static void afficheChemin(ArrayList<String> Chemin) {
    	
    	
    	for(int i = 0; i<Chemin.size();i++){
    		
    		System.out.println(Chemin.get(i));
    		
    		
    		
    	}
    	
    }
    





    public static void Pluscourt(Sommet s1, Sommet s2) {     // la fonction simplifiée utilisant l'autre

    	ArrayList<String> Chemin = new ArrayList<String>();
    	ArrayList<String> CheminTest = new ArrayList<String>();


        
        
        System.out.println("- Le trajet prendra environ " + Fonctions.Dijk(s1,s1,s2,0,-1, Chemin,CheminTest,new ArrayList<PisteRemonte>()) + " minutes pour arriver à "+s2.getNom());


    }

    
    public static Sommet FindSom(String nom) {
    	
    	for(int i=0;i<BaseDeDonee.getList().size();i++) {
    		
    		if (BaseDeDonee.getList().get(i).getNom().equals(nom)) {
    			return BaseDeDonee.getList().get(i);
    		}
    		
    	}
    	System.out.println("Sommet introuvable, vérifiez que tout est en majuscule et sans fautes");
    		
    		
    	return BaseDeDonee.getList().get(0);
    }
    
    public void doAll() {
    	
    	
    	
    }





}
