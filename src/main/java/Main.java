import Controlleur.GetEmployeControlleur;
import Entity.Employe;import UseCases.GetEmploye;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Employe> employes = new ArrayList<>();

    static {
        employes.add(new Employe(1,"Cianciolo", "Hugo", "hugo220798@gmail.com", "Patron", 70000 ));
        employes.add(new Employe(2,"Abach", "Yousouph", "ezfz@gsd.be", "Employe", 1600 ));
        employes.add(new Employe(3,"Van De Velde", "Louis", "ergre@fdsf.be", "Ingenieur", 4000 ));
    }
    public static void main(String [ ] args)
    {
        GetEmployeControlleur getEmploye = new GetEmployeControlleur();
        Employe employe = getEmploye.getEmploye(3,employes);
        System.out.println(employe.toString());
    }
}
