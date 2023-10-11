package gestionmagasin.entities;

public class Responsable extends  Employee{
    public int prime;

    public Responsable(int identifiant, String nom, String adresse, int numNbr, int prime) {
        super(identifiant, nom, adresse, numNbr);
        this.prime = prime;
    }

    @Override
    public String toString() {
        return "Responsable{" +
                "prime=" + prime +
                ", identifiant=" + identifiant +
                ", nom='" + nom + '\'' +
                ", Adresse='" + Adresse + '\'' +
                ", numNbr=" + numNbr +
                '}';
    }
    @Override
  public float CalculSalaire(){
      return   super.CalculSalaire()+this.prime;

  }
}
