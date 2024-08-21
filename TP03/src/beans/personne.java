package beans;

public class personne {
    public String nom;
    public String prenom;
    public String rebom;
    public String adresse;
    public String ville;
    
    // Default constructor
    public personne() {
    }

    public personne(String nom, String prenom, String rebom, String adresse, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.rebom = rebom;
        this.adresse = adresse;
        this.ville = ville;
    }
    // Getters and setters for the fields
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getRebom() {
        return rebom;
    }

    public void setRebom(String rebom) {
        this.rebom = rebom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

}
