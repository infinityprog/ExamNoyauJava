
import Entity.Employe;
import Repository.GetEmployeeDb;
import UseCases.GetEmploye;


import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String [ ] args)
    {
        GetEmployeeDb getEmployeeDb = new GetEmployeeDb();
        GetEmploye getEmploye = new GetEmploye();
        System.out.println(getEmploye.getById(3, getEmployeeDb).toString());
    }
}
