
public class TestLivre1 {

    public static void main(String[] args)
    {
        //Création des objets
        Livre1 l1=new Livre1(120,"poo java","claude delonay",150);
        Livre1 l2=new Livre1(140,"comptabilité","céline delonay",90);
        Livre1 l3=new Livre1(156,"math","claude delonay",90);


        l3.modifierPrix();
        l3.afficher();






    }

}
