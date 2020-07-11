import java.util.ArrayList;

public class BaseDeDonee {
	
	// on crée la liste de tous les sommets pour les parcourir lorsqu'on demande à l'utilisateur de choisir
	private static ArrayList<Sommet> ListSom = new ArrayList<Sommet>();

    //  on fait un sommet NULL et une liste de piste vide pour les pistes sans sommet ou les sommets sans piste

    public ArrayList<PisteRemonte> Null = new ArrayList<PisteRemonte>();
    public Sommet NULL = new Sommet("NULL",Null);







    // on écrit d'abord tous les sommets et une liste de pistes leur correspondant :
    // Col du prorel

    private ArrayList<PisteRemonte> Cdp = new ArrayList<PisteRemonte>(); // ici pour  les pistes de Col du prorel
    private Sommet CDP = new Sommet("COL DU PROREL",Cdp);
    
    
    
    //Prorel
    private ArrayList<PisteRemonte> Pro = new ArrayList<PisteRemonte>();
    private Sommet PRO = new Sommet("PROREL",Pro);

    //S0
    private ArrayList<PisteRemonte> S0 = new ArrayList<PisteRemonte>();
    private Sommet s0 = new Sommet("S0",S0);

    //S1
    private ArrayList<PisteRemonte> S1 = new ArrayList<PisteRemonte>();
    private Sommet s1 = new Sommet("S1",S1);

    //S2
    private ArrayList<PisteRemonte> S2 = new ArrayList<PisteRemonte>();
    private Sommet s2 = new Sommet("S2",S2);

    //S3
    private ArrayList<PisteRemonte> S3 = new ArrayList<PisteRemonte>();
    private Sommet s3 = new Sommet("S3",S3);

    //S4
    private ArrayList<PisteRemonte> S4 = new ArrayList<PisteRemonte>();
    private Sommet s4 = new Sommet("S4",S4);

    //S5
    private ArrayList<PisteRemonte> S5 = new ArrayList<PisteRemonte>();
    private Sommet s5 = new Sommet("S5",S5);

    //S6
    private ArrayList<PisteRemonte> S6 = new ArrayList<PisteRemonte>();
    private Sommet s6 = new Sommet("S6",S6);

    //S7
    private ArrayList<PisteRemonte> S7 = new ArrayList<PisteRemonte>();
    private Sommet s7 = new Sommet("S7",S7);

    //Pra Long
    private ArrayList<PisteRemonte> PL = new ArrayList<PisteRemonte>();
    private Sommet Pl = new Sommet("PRA LONG",PL);
    
    
    //S8
    private ArrayList<PisteRemonte> S8 = new ArrayList<PisteRemonte>();
    private Sommet s8 = new Sommet("S8",S8);

    //S9
    private ArrayList<PisteRemonte> S9 = new ArrayList<PisteRemonte>();
    private Sommet s9 = new Sommet("S9",S9);

    //S10
    private ArrayList<PisteRemonte> S10 = new ArrayList<PisteRemonte>();
    private Sommet s10 = new Sommet("S10",S10);

    //S11
    private ArrayList<PisteRemonte> S11 = new ArrayList<PisteRemonte>();
    private Sommet s11 = new Sommet("S11",S11);

    //COL DE LA RICELLE
    private ArrayList<PisteRemonte> Cdr = new ArrayList<PisteRemonte>();
    private Sommet CDR = new Sommet("COL DE LA RICELLE",Cdr);

    //12
    private ArrayList<PisteRemonte> S12 = new ArrayList<PisteRemonte>();
    private Sommet s12 = new Sommet("S12",S12);

    //S13
    private ArrayList<PisteRemonte> S13 = new ArrayList<PisteRemonte>();
    private Sommet s13 = new Sommet("S13",S13);
    ////////////////////////
    //S14
    private ArrayList<PisteRemonte> S14 = new ArrayList<PisteRemonte>();
    private Sommet s14 = new Sommet("S14",S14);

    //GRANDE ALPE
    private ArrayList<PisteRemonte> GA = new ArrayList<PisteRemonte>();
    private Sommet Ga = new Sommet("GRANDE ALPE",GA);

    //S15
    private ArrayList<PisteRemonte> S15 = new ArrayList<PisteRemonte>();
    private Sommet s15 = new Sommet("S15",S15);

    //S16
    private ArrayList<PisteRemonte> S16 = new ArrayList<PisteRemonte>();
    private Sommet s16 = new Sommet("S16",S16);

    //SERRE CHEVALIER
    private ArrayList<PisteRemonte> SC = new ArrayList<PisteRemonte>();
    private Sommet Sc = new Sommet("SERRE CHEVALIER",SC);

    //S17
    private ArrayList<PisteRemonte> S17 = new ArrayList<PisteRemonte>();
    private Sommet s17 = new Sommet("S17",S17);

    //S18
    private ArrayList<PisteRemonte> S18 = new ArrayList<PisteRemonte>();
    private Sommet s18 = new Sommet("S18",S18);

    //S19
    private ArrayList<PisteRemonte> S19 = new ArrayList<PisteRemonte>();
    private Sommet s19 = new Sommet("S19",S19);

  //S20
    private ArrayList<PisteRemonte> S20 = new ArrayList<PisteRemonte>();
    private Sommet s20 = new Sommet("S20",S20);
       
    //S21
    private ArrayList<PisteRemonte> S21 = new ArrayList<PisteRemonte>();
    private Sommet s21 = new Sommet("S21",S21);
    
    //S22
    private ArrayList<PisteRemonte> S22 = new ArrayList<PisteRemonte>();
    private Sommet s22 = new Sommet("S22",S22);
    
    //CHANTEMERLE1
    private ArrayList<PisteRemonte> CM1 = new ArrayList<PisteRemonte>();
    private Sommet Cm1 = new Sommet("CHANTEMERLE",CM1);
    
    
  //S23
    private ArrayList<PisteRemonte> S23 = new ArrayList<PisteRemonte>();
    private Sommet s23 = new Sommet("S23",S23);
    
    //S24
    private ArrayList<PisteRemonte> S24 = new ArrayList<PisteRemonte>();
    private Sommet s24 = new Sommet("S24",S24);
    
  //CHANTEMERLE2
    private ArrayList<PisteRemonte> CM2 = new ArrayList<PisteRemonte>();
    private Sommet Cm2 = new Sommet("CHANTEMERLE",CM2);
    
  //S25
    private ArrayList<PisteRemonte> S25 = new ArrayList<PisteRemonte>();
    private Sommet s25 = new Sommet("S25",S25);
    
  //S26
    private ArrayList<PisteRemonte> S26 = new ArrayList<PisteRemonte>();
    private Sommet s26 = new Sommet("S26",S26);
    
  //S27
    private ArrayList<PisteRemonte> S27 = new ArrayList<PisteRemonte>();
    private Sommet s27 = new Sommet("S27",S27);
    
    
  //S28
    private ArrayList<PisteRemonte> S28 = new ArrayList<PisteRemonte>();
    private Sommet s28= new Sommet("S28",S28);
    
    //S29
    private ArrayList<PisteRemonte> S29 = new ArrayList<PisteRemonte>();
    private Sommet s29= new Sommet("S29",S29);
    
  //S30
    private ArrayList<PisteRemonte> S30 = new ArrayList<PisteRemonte>();
    private Sommet s30= new Sommet("S30",S30);
    
    
  //ARAVET
    private ArrayList<PisteRemonte> SAR = new ArrayList<PisteRemonte>();
    private Sommet sAR= new Sommet("ARAVET",SAR);
    
    
  //S31
    private ArrayList<PisteRemonte> S31 = new ArrayList<PisteRemonte>();
    private Sommet s31= new Sommet("S31",S31);
    
  //S32
    private ArrayList<PisteRemonte> S32 = new ArrayList<PisteRemonte>();
    private Sommet s32= new Sommet("S32",S32);
    
    

    
    

    // Eychauda

    private ArrayList<PisteRemonte> Eyc = new ArrayList<PisteRemonte>();
    private Sommet EYC = new Sommet("EYCHAUDA",Eyc);

    // so1

    private ArrayList<PisteRemonte> So1 = new ArrayList<PisteRemonte>();
    private Sommet SO1 = new Sommet("SO1",So1);

 // so2

    private ArrayList<PisteRemonte> So2 = new ArrayList<PisteRemonte>();
    private Sommet SO2 = new Sommet("SO2",So2);
    
 // so2B

    private ArrayList<PisteRemonte> So2B = new ArrayList<PisteRemonte>();
    private Sommet SO2B = new Sommet("SO2B",So2B);

    // so3

    private ArrayList<PisteRemonte> So3 = new ArrayList<PisteRemonte>();
    private Sommet SO3 = new Sommet("SO3",So3);
    
    
   // so4

    private ArrayList<PisteRemonte> So4 = new ArrayList<PisteRemonte>();
    private Sommet SO4 = new Sommet("SO4",So4);
    
    
 // so5

    private ArrayList<PisteRemonte> So5 = new ArrayList<PisteRemonte>();
    private Sommet SO5 = new Sommet("SO5",So5);
    
    
    // so6

    private ArrayList<PisteRemonte> So6 = new ArrayList<PisteRemonte>();
    private Sommet SO6 = new Sommet("SO6",So6);
    
 // so7

    private ArrayList<PisteRemonte> So7 = new ArrayList<PisteRemonte>();
    private Sommet SO7 = new Sommet("SO7",So7);
    
    // so8

    private ArrayList<PisteRemonte> So8 = new ArrayList<PisteRemonte>();
    private Sommet SO8 = new Sommet("SO8",So8);
    
    // so9

    private ArrayList<PisteRemonte> So9 = new ArrayList<PisteRemonte>();
    private Sommet SO9 = new Sommet("SO9",So9);

    
    
 // so10

    private ArrayList<PisteRemonte> So10 = new ArrayList<PisteRemonte>();
    private Sommet SO10 = new Sommet("SO10",So10);
    
    
 // so11

    private ArrayList<PisteRemonte> So11 = new ArrayList<PisteRemonte>();
    private Sommet SO11 = new Sommet("SO11",So11);
    
    // Col de la cucumelle

    private ArrayList<PisteRemonte> cdcm = new ArrayList<PisteRemonte>();
    private Sommet CDCM = new Sommet("COL DE LA CUCUMELLE",cdcm);
    
    // BEZ

    private ArrayList<PisteRemonte> bez = new ArrayList<PisteRemonte>();
    private Sommet BEZ = new Sommet("LE BEZ",bez);
    
    
    // so12

    private ArrayList<PisteRemonte> So12 = new ArrayList<PisteRemonte>();
    private Sommet SO12 = new Sommet("SO12",So12);
    
    // so13

    private ArrayList<PisteRemonte> So13 = new ArrayList<PisteRemonte>();
    private Sommet SO13 = new Sommet("SO13",So13);


    // pour cacucler le temps
    
   
    
    // TRANSPORTS
    private int tt=5; // le temps de base d'un transport
    private int tm = 2;  // temps moyen d'attente pour les transports
    // télécabine = tt + tm
    // oeuf = 2tt + tm
    // télésiège = 3tt + tm
    
    
    // PISTES en fonction du nivau
    private int tv=10; // le temps de base d'un skieur fonceur sur piste verte
    private int tb=13; // le temps de base d'un skieur fonceur sur piste bleue
    private int tr=18; // le temps de base d'un skieur fonceur sur piste rouge
    private int tn=21; // le temps de base d'un skieur fonceur sur piste noire
    
    
    // si fonceur on garde tv, tb etc...
    // si débutant :
    // tv= tv
    // tb= 2*tb
    // tr = 3*tr
    // tn = 4*tn


    public BaseDeDonee(int t){
    	
    	init(t);
    }
    
    private void init(int t){
    	
    	if (t==1) { // on change la vitesse, le skieur débutant est plus lent
    		
    		tb= 2*tb;
    		tr = 3*tr;
    		tn = 4*tn;
    		
    	}


        Null.clear();
        ListSom.add(NULL);
        // ici on rempli les listes de pistes et remontees pour chaque sommet :
        // col du prorel
        ListSom.add(CDP);
        Cdp.add(new PisteRemonte ("cabane du berger", tn, "la piste noire",s8));
        Cdp.add(new PisteRemonte ("myrtille 1", tb, "la piste bleue",s8));
        Cdp.add(new PisteRemonte ("saludes 1", tr, "la piste rouge",s9));
        Cdp.add(new PisteRemonte ("bergers", tv, "la piste verte",s0));
        Cdp.add(new PisteRemonte ("chauvet", tb, "la piste bleue",s0));

        //Prorel
        ListSom.add(PRO);
        Pro.add(new PisteRemonte ("condamine", tr, "la piste rouge",s0));
        Pro.add(new PisteRemonte ("pelvoux", tv, "la piste verte",s0));
        Pro.add(new PisteRemonte ("grande gargouille 1", tr, "la piste rouge",s1));
        Pro.add(new PisteRemonte ("couloir", tn, "la piste noire",s1));

        //S0
        ListSom.add(s0);
        S0.add(new PisteRemonte ("chemin 1", tb, "la piste bleue",s6));
        S0.add(new PisteRemonte ("ROCHER BLANC", 3*tt+tm, "le telesiege",CDP));
        S0.add(new PisteRemonte ("CROIX NOIR", 3*tt+tm, "le telesiege",PRO));

        //S1
        ListSom.add(s1);
        S1.add(new PisteRemonte ("ch de ronde 1", tr, "la piste rouge",s2));
        S1.add(new PisteRemonte ("crocus", tr, "la piste rouge",s4));
        S1.add(new PisteRemonte ("grande gargouile 2 ", tr, "la piste rouge",s3));

        //S2
        ListSom.add(s2);
        S2.add(new PisteRemonte ("dame des neiges", tb, "la piste bleu",s6));
        S2.add(new PisteRemonte ("club", tr, "la piste rouge",s7));
        S2.add(new PisteRemonte ("ch de ronde 2", tr, "la piste rouge",s5));

        //S3
        ListSom.add(s3);
        S3.add(new PisteRemonte ("remparts", tr, "la piste rouge",Pl));
        S3.add(new PisteRemonte ("grande gargouille 3", tr, "la piste rouge",s4));
        S3.add(new PisteRemonte ("yéti", tb, "la piste bleue",s7));

        //S4
        ListSom.add(s4);
        S4.add(new PisteRemonte ("croix michel", tr, "la piste rouge",Pl));
        S4.add(new PisteRemonte ("grande gargouille 4", tr, "la piste rouge",Pl));

        //S5
        ListSom.add(s5);
        S5.add(new PisteRemonte ("remparts", tr, "la piste rouge",Pl));

        //S6
        ListSom.add(s6);
        S6.add(new PisteRemonte ("chemin 2", tb, "la piste bleue",s7));

        //S7
        ListSom.add(s7);
        S7.add(new PisteRemonte ("chemin 3", tb, "la piste bleue",Pl));
        S7.add(new PisteRemonte ("SERRE PELAT", 3*tt+tm, "le telesiege",s2));


        //PRA LONG
        ListSom.add(Pl);
        PL.add(new PisteRemonte ("PROREL 2", 2*tt+tm, "l'oeuf",PRO));
        PL.add(new PisteRemonte ("STADE", 2*tt+tm, "l'oeuf",s3));
        
     

        //S8
        ListSom.add(s8);
        S8.add(new PisteRemonte ("myrtille 2", tb, "la piste bleue",s12));

        //S9
        ListSom.add(s9);
        S9.add(new PisteRemonte ("éduits 2", tr, "la piste rouge",s11));
        S9.add(new PisteRemonte ("saludes 2", tr, "la piste rouge",s12));

        //S10
        ListSom.add(s10);
        S10.add(new PisteRemonte ("éduits 1", tr, "la piste rouge",s9));
        S10.add(new PisteRemonte ("aiguillette", tr, "la piste rouge",s11));

        //S11
        ListSom.add(s11);
        S11.add(new PisteRemonte ("celvan 2", tv, "la piste verte",s13));
        S11.add(new PisteRemonte ("AIGUILLETTE", 3*tt+tm, "le telesiege",s10));

        //COL DE LA RICELLE
        ListSom.add(CDR);
        Cdr.add(new PisteRemonte ("vallons 1", tb, "la piste bleue",s14));
        Cdr.add(new PisteRemonte ("petit alpe", tr, "la piste rouge",s12));
        Cdr.add(new PisteRemonte ("bois du coq", tr, "la piste rouge",s12));

        //S12
        ListSom.add(s12);    
        S12.add(new PisteRemonte ("vallons 3", tb, "la piste bleue",s18));
        S12.add(new PisteRemonte ("celvan 1", tv, "la piste verte",s11));
        S12.add(new PisteRemonte ("PROREL", 3*tt+tm, "le telesiege",CDP));
        S12.add(new PisteRemonte ("BOIS DES COQS", 3*tt+tm, "le telesiege",CDR));
        S12.add(new PisteRemonte ("vallons 5", tb, "la piste bleue",s23));

        //S14
        ListSom.add(s14);
        S14.add(new PisteRemonte ("vallons 4", tb, "la piste bleue",Ga));

        //GRANDE ALPE
        ListSom.add(Ga);
        GA.add(new PisteRemonte ("REPLAT", 3*tt+tm, "le telesiege",s15));
        GA.add(new PisteRemonte ("GRAND ALPE", 3*tt+tm, "le telesiege",s16));
        GA.add(new PisteRemonte ("vallon 5", tb, "la piste bleue",s12));
        GA.add(new PisteRemonte ("3 croix", tv, "la piste verte",s12));
        
        

        //S15
        ListSom.add(s15);
        S15.add(new PisteRemonte ("grand alpe", tv, "la piste verte",Ga));
        S15.add(new PisteRemonte ("grand serre", tv, "la piste verte",Ga));

        //S16
        ListSom.add(s16);
        S16.add(new PisteRemonte ("grand alpe", tv, "la piste verte",Ga));

        //SERRE CHEVALIER
        ListSom.add(Sc);
        SC.add(new PisteRemonte ("vallons 2", tb, "la piste bleue",s14));
        SC.add(new PisteRemonte ("mur chevalier", tn,"la piste noire",s17));
        SC.add(new PisteRemonte ("draye", tr, "la piste rouge",s21));
        SC.add(new PisteRemonte ("eftanis", tb, "la piste bleue",s22));

        //S17
        ListSom.add(s17);
        S17.add(new PisteRemonte ("combes", tb, "la piste bleue",Ga));

        //S18
        ListSom.add(s18);
        S18.add(new PisteRemonte ("Combes", 3*tt+tm, "le telesiege",s24));
        S18.add(new PisteRemonte ("briance 2", tv, "la piste verte",s19));

        //S19
        ListSom.add(s19);
        S19.add(new PisteRemonte ("briance 3", tv, "la piste verte",s20));

        //S20
        ListSom.add(s20);
        S20.add(new PisteRemonte ("briance 4", tv, "la piste verte",Cm1));
        
        //S21
        ListSom.add(s21);
        S21.add(new PisteRemonte ("3 croix", tv, "la piste verte",s12));
        S21.add(new PisteRemonte ("draye", tr, "la piste rouge",s23));
        S21.add(new PisteRemonte ("pylones", tn, "les piste noires",s23));
        S21.add(new PisteRemonte ("forêt", tb, "la piste bleue",s25));
        
        
      //S22
        ListSom.add(s22);
        S22.add(new PisteRemonte ("rocher de l'enfer", tr, "la piste rouge",SO2));
        S22.add(new PisteRemonte ("échaillon", tr, "la piste rouge",SO2));
        S22.add(new PisteRemonte ("frangeas", tb, "la piste bleue",s26));
        S22.add(new PisteRemonte ("combes", tb, "la piste bleue",s24));
        
        
      //CM1
        ListSom.add(Cm1);
        CM1.add(new PisteRemonte ("BETONET", 2*tt+tm, "l'oeuf",s23));
        
      //S23
        ListSom.add(s23);
        S23.add(new PisteRemonte ("luc alphand", tn,"la piste noire",Cm2));
        S23.add(new PisteRemonte ("SERRE CHEVALIER", tt+tm, "la télécabine",Sc));
        S23.add(new PisteRemonte ("Ratier", 3, "le tapis",s18));
        S23.add(new PisteRemonte ("chêne", tv, "la piste verte",s30));
        S23.add(new PisteRemonte ("ORES DU BOIS", 3*tt+tm, "le telesiege",s21));
        
      //S24
        ListSom.add(s24);
        S24.add(new PisteRemonte ("genépi", tb, "la piste bleue",s26));
        S24.add(new PisteRemonte ("combes", tb, "la piste bleue",Ga));
        S24.add(new PisteRemonte ("eftanis", tb, "la piste bleue",Ga));
        S24.add(new PisteRemonte ("forêt", tb, "la piste bleue",s25));
        
        
      //CM2
        ListSom.add(Cm2);
        CM2.add(new PisteRemonte ("Ratier", 2*tt+tm, "l'oeuf",s23));
        
        
      //S25
        ListSom.add(s25);
        S25.add(new PisteRemonte ("marteau", tb, "la piste bleue",s27));
        S25.add(new PisteRemonte ("Alpage", 3*tt+tm, "le telesiege",s26)); 
        S25.add(new PisteRemonte ("stade", tr, "la piste rouge",s31)); 
        
        
      //S26
        ListSom.add(s26);
        S26.add(new PisteRemonte ("frangeas 2", tb, "la piste bleue",s28));
        S26.add(new PisteRemonte ("alpage", tb, "la piste bleue",s27));
        
        
      //S27
        ListSom.add(s27);
        S27.add(new PisteRemonte ("mélézes", tb, "la piste bleue",s29));
        S27.add(new PisteRemonte ("marteau 2", tb, "la piste bleue",s31));
        
      //S28
        ListSom.add(s28);
        S28.add(new PisteRemonte ("bois", tr, "la piste rouge",s32));
        S28.add(new PisteRemonte ("casse du boeuf", tn,"la piste noire",sAR));
        S28.add(new PisteRemonte ("marteau", tb, "la piste bleue",s25));
        S28.add(new PisteRemonte ("frangeas 3", tb, "la piste bleue",SO2));
        
        
      //S29
        ListSom.add(s29);
        S29.add(new PisteRemonte ("mélézes 2 ", tb, "la piste bleue",s23));
        
        
      //S30
        ListSom.add(s30);
        S30.add(new PisteRemonte ("route aravet 2", tv, "la piste verte",sAR));
        
      //ARAVET
        ListSom.add(sAR);
        SAR.add(new PisteRemonte ("ARAVET", 2*tt+tm, "l'oeuf",s31)); 
        SAR.add(new PisteRemonte ("FREJUS", 2*tt+tm, "l'oeuf",SO6)); 
        SAR.add(new PisteRemonte ("CASSE DU BOEUF", 3*tt+tm, "le telesiege",s28)); 
        
        
      //S31
        ListSom.add(s31);
        S31.add(new PisteRemonte ("lièvre blanc ", tv, "la piste verte",s23));
        S31.add(new PisteRemonte ("route aravet ", tv, "la piste verte",s30));
        S31.add(new PisteRemonte ("marteau 3 ", tb, "la piste bleue",sAR));
        
      //S32
        ListSom.add(s32);
        S32.add(new PisteRemonte ("bois 2", tr, "la piste rouge",SO6));
        S32.add(new PisteRemonte ("lacets", tr, "la piste rouge",SO12));
        
        
      
        
        
        
        
        

        // Eychauda
        ListSom.add(EYC);
        Eyc.add(new PisteRemonte ("creux du loup", tn,"la piste noire",SO1));
        Eyc.add(new PisteRemonte ("ailefroide", tn,"la piste noire",SO1));
        Eyc.add(new PisteRemonte ("isolee", tn,"la piste noire",SO2));

        // SO1
        ListSom.add(SO1);
        So1.add(new PisteRemonte ("Eychauda", 3*tt+tm, "le telesiege",EYC));
        So1.add(new PisteRemonte ("clot gauthier", tr, "la piste rouge",SO2));

        // SO2
        ListSom.add(SO2);
        So2.add(new PisteRemonte ("traverse", tb, "la piste bleue",SO2B));
        So2.add(new PisteRemonte ("Clot gauthier", 3*tt+tm, "le telesiege",SO3));
        
     // SO2B
        ListSom.add(SO2B);
        So2B.add(new PisteRemonte ("traverse", tb, "la piste bleue",SO6));
        So2B.add(new PisteRemonte ("Cote Chevalier", 3*tt+tm, "le telesiege",s22));
        

        // SO3
        ListSom.add(SO3);
        So3.add(new PisteRemonte ("clot gauthier", tr, "la piste rouge",SO1));
        So3.add(new PisteRemonte ("selettes", tb, "la piste bleue",SO2));
        So3.add(new PisteRemonte ("goulet", tb, "la piste bleue",SO4));

        
     // SO4
        ListSom.add(SO4);
        So4.add(new PisteRemonte ("méa", 3*tt+tm, "le telesiege",SO8));
        So4.add(new PisteRemonte ("clot", 3*tt+tm, "le telesiege",SO7));
        So4.add(new PisteRemonte ("goulet", tb, "la piste bleue",SO6));
        So4.add(new PisteRemonte ("barres", tv, "la piste verte",SO9));
        
        
        
     // SO5
        ListSom.add(SO5);
        So5.add(new PisteRemonte ("cabane", tb, "la piste bleue",SO4));
        So5.add(new PisteRemonte ("selettes", tb, "la piste bleue",SO2));
        
     // SO6
        ListSom.add(SO6);
        So6.add(new PisteRemonte ("goulet", tb, "la piste bleue",SO11));


        // SO7
        ListSom.add(SO7);
        So7.add(new PisteRemonte ("chaméant", tv, "la piste verte",SO4));
        
        // SO8
        ListSom.add(SO8);
        So8.add(new PisteRemonte ("chaméant", tv, "la piste verte",SO4));  
        So8.add(new PisteRemonte ("pré jeanne", tb, "la piste bleue",SO4));
        
        
     // SO9
        ListSom.add(SO9);
        So9.add(new PisteRemonte ("Barres", 3*tt+tm, "le telesiege",SO4)); 
        
        
     // SO10
        ListSom.add(SO10);
        So10.add(new PisteRemonte ("Vallons", 3*tt+tm, "le telesiege",CDCM)); 
        So10.add(new PisteRemonte ("bez", tr, "la piste rouge",SO12)); 
        
        
     // SO11
        ListSom.add(SO11);
        So11.add(new PisteRemonte ("goulet", tb, "la piste bleue",SO10));
        So11.add(new PisteRemonte ("route fréjus", tv, "la piste verte",sAR));
        So11.add(new PisteRemonte ("prairies", tr, "la piste rouge",SO12));

              
    //  CDCM
        ListSom.add(CDCM);
        cdcm.add(new PisteRemonte ("cucumelle", tr, "la piste rouge",SO11)); 
        
    //  BEZ
        ListSom.add(BEZ);
        bez.add(new PisteRemonte ("Pontillas", tt+tm, "la télécabine",SO10)); 
        
        
     // SO12
        ListSom.add(SO12);
        So12.add(new PisteRemonte ("bez", tr, "la piste rouge",BEZ));
        So12.add(new PisteRemonte ("Fréjus", 3*tt+tm, "le telesiege",SO13));
        
        
        
     // SO13
        ListSom.add(SO13);
        So13.add(new PisteRemonte ("goulet", tb, "la piste bleue",SO6));
        So13.add(new PisteRemonte ("Crêtes", 3*tt+tm, "le telesiege",SO5));
        
        





    }
    
    public static  ArrayList<Sommet> getList(){
    	
    	
    	
    	
    	
    	return ListSom;
    	
    }












}
