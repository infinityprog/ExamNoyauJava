
import Repository.GetEmployeeDb;
import UseCases.FindEmployee;

public class Main {


    public static void main(String [ ] args)
    {
        FindEmployee findEmployee = new FindEmployee();

        System.out.println(findEmployee.getById(2).toString());
    }
}
