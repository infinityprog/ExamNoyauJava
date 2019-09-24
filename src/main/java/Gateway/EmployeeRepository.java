package Gateway;

import Entity.Employee;

public interface EmployeeRepository {

    public Employee findById(int id_search);
}
