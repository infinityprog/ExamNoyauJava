package Repository;

import Entity.Employe;
import Gateway.getEmployeeGetway;

import java.util.ArrayList;
import java.util.List;

public class GetEmployeeDb implements getEmployeeGetway {

    public static List<Employe> employes = new ArrayList<>();

    static {
        employes.add(new Employe(1,"Cianciolo", "Hugo", "hugo220798@gmail.com", "Patron", 70000 ));
        employes.add(new Employe(2,"Abach", "Yousouph", "ezfz@gsd.be", "Employe", 1600 ));
        employes.add(new Employe(3,"Van De Velde", "Louis", "ergre@fdsf.be", "Ingenieur", 4000 ));
    }

    @Override
    public Employe getEmployeByID(int id_search) {

        for (Employe employe: employes) {
            if(employe.getId() == id_search)
            {
                return employe;
            }
        }
        return null;
    }
}
