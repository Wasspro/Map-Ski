public class PisteRemonte {



    private String nom;
    private int temps;
    private String type;
    private Sommet sommet;

    public PisteRemonte(String nom, int temps, String type, Sommet sommet){

        this.nom = nom;
        this.temps = temps;
        this.type = type;
        this.sommet = sommet;
    }



    public String getNom(){

        return this.nom;

    }

    public int getTemps(){

        return this.temps;

    }


    public String getType(){

        return this.type;

    }


    public Sommet getSommet(){

        return this.sommet;

    }






}
