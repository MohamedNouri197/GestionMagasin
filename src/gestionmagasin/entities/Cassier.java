package gestionmagasin.entities;

public class Cassier extends  Employee{

  public int numeroDeCaisse;

    public Cassier(int identifiant, String nom, String adresse, int numNbr, int numeroDeCaisse) {
        super(identifiant, nom, adresse, numNbr);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    @Override
    public String toString() {
        return "Caissier{" +
                "numeroDeCaisse=" + numeroDeCaisse +
                ", identifiant=" + identifiant +
                ", nom='" + nom + '\'' +
                ", Adresse='" + Adresse + '\'' +
                ", numNbr=" + numNbr +
                '}';
    }
    @Override
    public float CalculSalaire(){
        return   super.CalculSalaire()+this.numeroDeCaisse;
    }
}
