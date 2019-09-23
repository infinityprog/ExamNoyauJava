package Controlleur;

import Entity.Employe;
import UseCases.GetEmploye;

import java.util.List;

public class GetEmployeControlleur {

    public Employe getEmploye(int id_search,  List<Employe> employes){
        GetEmploye getEmploye = new GetEmploye();
        return   getEmploye.getById(id_search, employes);
    }
}
