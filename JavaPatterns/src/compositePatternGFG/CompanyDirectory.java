package compositePatternGFG;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee {

    //attribute
    private List<Employee> empList = new ArrayList<Employee> (  );

    @Override
    public void showEmployeeDetails() {
        for(Employee emp : empList)
        {
            emp.showEmployeeDetails ();
        }
    }

    //method
    public void addEmployee(Employee employee)
    {
        empList.add ( employee );
    }

    //method
    public void removeEmployee(Employee employee)
    {
        empList.remove ( employee );
    }
}
