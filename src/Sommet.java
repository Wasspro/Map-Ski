import java.util.ArrayList;




public class Sommet {

	private boolean check = false;


    private String nom;

    private ArrayList<PisteRemonte> Pirem = new ArrayList<PisteRemonte>(); // c'est la liste de toutes les piste/remontées qui partent du sommet

    public Sommet(String nom,ArrayList<PisteRemonte> Pirem) {

        this.nom = nom;

        this.Pirem = Pirem;
    }


    public Sommet(String nom) { // pour les sommets qui n'ont pas encore de pistes

        this.nom = nom;

    }

    public String getNom(){

        return this.nom;

    }



    public ArrayList<PisteRemonte> getPisteRemonte(){

        return this.Pirem;

    }
    
    
    
    
    public void check() {
    	
    	
    	this.check = true;
    }

    public void uncheck() {
    	
    	
    	this.check = false;
    }
    public boolean checked() {
    	
    	
    	return this.check;
    }
    
}
