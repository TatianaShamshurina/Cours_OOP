import java.util.Scanner;
public class Livre1
{
    //Étape 1: déclarations des attributs
    int id;//140
    String titre;//comptrabilité
    String auteur;//céline
    double prix;//90

    Scanner sc=new Scanner(System.in);

    //Étape 2: déclarations des méthodes
    public void afficher()
    {
        System.out.println("id : "+id+", titre : "+titre+" ,auteur : "+auteur+", prix : "+prix);
    }

    public void modifierPrix()
    {
        System.out.println("Taper le nouveau prix : ");
        double prix=sc.nextDouble();
        this.prix=prix;
    }

    //Étape 3: constructeur
    //(140,"comptabilité","céline delonay",90)
    public Livre1(int id, String titre, String auteur, double prix)
    {
        this.id=id;
        this.titre=titre;
        this.auteur=auteur;
        this.prix=prix;
    }



}
