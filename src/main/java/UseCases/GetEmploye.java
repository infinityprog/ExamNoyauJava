package UseCases;

import Entity.Employe;
import Gateway.getEmployeeGetway;

import java.util.List;

public class GetEmploye {

    private getEmployeeGetway gateway;

    public Employe getById(int id_search, getEmployeeGetway gateway){
       this.gateway = gateway;
        return this.gateway.getEmployeByID(id_search);
    }
}
