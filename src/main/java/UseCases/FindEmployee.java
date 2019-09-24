package UseCases;

import Entity.Employee;
import Gateway.EmployeeRepository;
import Repository.GetEmployeeDb;

public class FindEmployee {

    private EmployeeRepository gateway = new GetEmployeeDb();

    public Employee getById(int id_search){

        return this.gateway.findById(id_search);
    }
}
