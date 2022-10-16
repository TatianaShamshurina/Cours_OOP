
public class TestCompte1 {

    public static void main(String[] args)
    {
        //Créer des objets

        Compte1 c1=new Compte1(45,"Céline stewart",15000);
        Compte1 c2=new Compte1(12,"Jean meunier",10000);

        c1.debuter();
        c1.creduter();
        c1.afficher();

        c2.afficher();

    }

}
