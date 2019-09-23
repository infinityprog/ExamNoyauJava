import Entity.Employe;

public class Main {

    public static void main(String [ ] args)
    {
        Employe employe = new Employe(1, "Cianciolo", "Hugo", "hugo220798@gmail.com", "Patron" , 700000 );
        System.out.println(employe.toString());
    }
}
