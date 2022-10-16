import java.util.Scanner;
public class Compte
{
    //déclarations des attributs
    int numCompte;
    String nomTitulaire;
    double solde;

    Scanner sc=new Scanner(System.in);
    //Les méthodes

    public double creduter()
    {
        System.out.println("Taper le montant a verser : ");
        double montantVerser=sc.nextDouble();
        solde+=montantVerser;
        return solde;
    }

    public void debuter()
    {
        System.out.println("Taper le montant a débuter : ");
        double montantDebuter=sc.nextDouble();

        if(solde>=montantDebuter)
            solde-=montantDebuter;
        else
            System.out.println("Solde insuffisant!!!");
    }

    public void afficher()
    {
        System.out.println("Num de compte : "+numCompte+" ,nom de titulaire : "+nomTitulaire+" ,solde = "+solde);
    }

    //constructeur

    public Compte1(int numCompte, String nomTitulaire, double solde)
    {
        this.numCompte=numCompte;
        this.nomTitulaire=nomTitulaire;
        this.solde=solde;
    }

}
