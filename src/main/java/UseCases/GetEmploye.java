package UseCases;

import Entity.Employe;
import jdk.jfr.internal.Repository;

import java.util.List;

public class GetEmploye {


    public Employe getById(int id_search, List<Employe> employes){
        for (Employe employe: employes ) {
            if(employe.getId() == id_search){
                return employe;
            }
        }
        return new Employe();
    }
}
