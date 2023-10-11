package gestionmagasin.entities;

public class Employee {
    public int identifiant;
    public String nom;
    public String  Adresse;
    public int numNbr;

    public Employee(int identifiant, String nom, String adresse, int numNbr) {
        this.identifiant = identifiant;
        this.nom = nom;
        Adresse = adresse;
        this.numNbr = numNbr;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "identifiant=" + identifiant +
                ", nom='" + nom + '\'' +
                ", Adresse='" + Adresse + '\'' +
                ", numNbr=" + numNbr +
                '}';
    }

    public  float CalculSalaire(){
        return  numNbr*30;
    }

}
