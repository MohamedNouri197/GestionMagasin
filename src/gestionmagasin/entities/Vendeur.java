package gestionmagasin.entities;

public class Vendeur extends Employee{
    public int tauxDeVente;

    public Vendeur(int identifiant, String nom, String adresse, int numNbr, int tauxDeVente) {
        super(identifiant, nom, adresse, numNbr);
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public String toString() {
        return "Vendeur{" +
                "tauxDeVente=" + tauxDeVente +
                ", identifiant=" + identifiant +
                ", nom='" + nom + '\'' +
                ", Adresse='" + Adresse + '\'' +
                ", numNbr=" + numNbr +
                '}';
    }
    @Override
    public float CalculSalaire(){
        return   super.CalculSalaire()+this.tauxDeVente;

    }

}
