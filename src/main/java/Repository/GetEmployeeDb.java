package Repository;

import Entity.Employee;
import Gateway.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class GetEmployeeDb implements EmployeeRepository {

    public static List<Employee> employes = new ArrayList<>();

    static {
        employes.add(new Employee(1,"Cianciolo", "Hugo", "hugo220798@gmail.com", "Patron", 70000 ));
        employes.add(new Employee(2,"Abach", "Yousouph", "ezfz@gsd.be", "Employe", 1600 ));
        employes.add(new Employee(3,"Van De Velde", "Louis", "ergre@fdsf.be", "Ingenieur", 4000 ));
    }


    @Override
    public Employee findById(int id_search) {
        for (Employee employe: employes) {
            if(employe.getId() == id_search)
            {
                return employe;
            }
        }
        return null;
    }
}
