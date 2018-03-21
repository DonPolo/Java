package defaultPackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p1706363
 */
public class DocBibliotheque {
    
    //<editor-fold defaultstate="collapsed" desc="Variables de classe">
    static int empruntes = 0;
    static int pile = 0;
    static int pileresa = 0;
    static int resa = 0;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Attributs">

    private String codeArchivage;
    private String titre;
    private String auteurPrincipal;
    private int anneePublication;
    private String statut;
    private MembreBibliotheque emprunteur = null;
    private MembreBibliotheque reserveur = null;
    
    //</editor-fold>
    
    public DocBibliotheque(String code, String titreD, String auteur, int anneeP, String statut){
        codeArchivage = code;
        titre = titreD;
        auteurPrincipal = auteur;
        anneePublication = anneeP;
        this.statut = statut;
    }
    
    //<editor-fold defaultstate="collapsed" desc="Getters">
    
    public String getCode(){
        return codeArchivage;
    }
    
    public String getTitre(){
        return titre;
    }
    
    public String getAuteur(){
        return auteurPrincipal;
    }
    
    public int getAnneePubli(){
        return anneePublication;
    }
    
    public String getStatut(){
        if(statut.equals("r")){
            return "réservé";
        }else if(statut.equals("e")){
            return "emprunté";
        }else if(statut.equals("p")){
            return "pile de retour";
        }else if(statut.equals("s")){
            return "pile spéciale de réservation";
        }else if(statut.equals("b")){
            return "en bibliothèque";
        }
        return statut;
    }
    
    public MembreBibliotheque getEmprunteur(){
        return emprunteur;
    }
    
    public MembreBibliotheque getReserveur(){
        return reserveur;
    }
    
    public static int getNbEmprunt(){
        return empruntes;
    }
    
    public static int getNbPile(){
        return pile;
    }
    
    public static int getNbPileResa(){
        return pileresa;
    }
    
    public static int getNbResa(){
        return resa;
    }
    
        //<editor-fold defaultstate="collapsed" desc="Check Status">
    
    public boolean estEmprunte(){
        if(statut.equals("e")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean estReserve(){
        if(statut.equals("r")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean estEnBibliotheque(){
        if(statut.equals("b")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean estSurPileReservation(){
        if(statut.equals("s")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean estSurPileDeRetour(){
        if(statut.equals("p")){
            return true;
        }else{
            return false;
        }
    }
    
        //</editor-fold>
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Setters">

    public void setCode(String code){
        codeArchivage = code;
    }
    
    public void setAuteur(String auteur){
        auteurPrincipal = auteur;
    }
    
    public void setAnneeParu(int annee){
        anneePublication = annee;
    }
    
    public void setTitre(String titre){
        this.titre = titre;
    }
    
    public void setStatut(String statut){
        this.statut = statut;
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Gestion">

    public void reserver(MembreBibliotheque membre){
        if(statut.equals("e")){
            statut = "r";
            resa++;
            reserveur = membre;
        }else{
            System.out.println("Réservation impossible");
        }
    }
    
    public void retourner(){
        if(statut.equals("e")){
            statut = "p";
            pile++;
            empruntes--;
            emprunteur = null;
        }else if(statut.equals("r")){
            statut = "s";
            pileresa++;
            empruntes--;
            emprunteur = null;
        }else{
            System.out.println("Impossible de retourner");
        }
    }
    
    public void emprunter(MembreBibliotheque membre){
        if(statut.equals("b")){
            statut = "e";
            emprunteur = membre;
            empruntes++;
        }else if (statut.equals("s")) {
            statut = "e";
            emprunteur = membre;
            empruntes++;
            resa--;
        } else {
            System.out.println("Impossible d'emprunter");
        }
    }
    
    public void mettreBiblio(){
        if(statut.equals("p")){
            statut = "b";
            pile--;
        }else{
            System.out.println("Impossible de mettre en bibliothèque");
        }
    }
    
    public void annulerRésa(MembreBibliotheque membre){
        if(membre.equals(reserveur)){
            if(statut.equals("r")){
                statut = "e";
                reserveur = null;
                resa--;
            }else if(statut.equals("s")){
                statut = "p";
                pile++;
                pileresa--;
                reserveur = null;
                resa--;
            }else{
                System.out.println("Impossible d'annuler");
            }
        }else{
            System.out.println("Le membre saisi n'est pas le bon");
        }
        
    }
    
    //</editor-fold>
    
    @Override
    public String toString(){
        String res = "Document " + codeArchivage + " : " + titre + " de " + auteurPrincipal + " publié en " + anneePublication + " actuellement " + getStatut();
        return res;
    }
}
