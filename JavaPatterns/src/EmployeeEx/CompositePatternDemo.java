package EmployeeEx;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee.composite ceo = new Employee.composite("CEO","N/A",100);
        Employee.composite headMarketing = new Employee.composite("Head of Marketing","Marketing",50);
        Employee.composite headSales = new Employee.composite("Head of Sales","Sales",40);

        Employee manager1 = new Employee.Leaf("Manager1","Marketing",30);
        Employee manager2 = new Employee.Leaf("Manager2","Marketing",30);
        Employee manager3 = new Employee.Leaf("Manager3","Marketing",30);

        Employee clerk1 = new Employee.Leaf("Clerk1","Sales",30);
        Employee clerk2 = new Employee.Leaf("Clerk2","Sales",30);

        headMarketing.addEmployee(manager1);
        headMarketing.addEmployee(manager2);

        headSales.addEmployee(clerk1);
        headSales.addEmployee(clerk2);

        ceo.addEmployee(headMarketing);
        ceo.addEmployee(headSales);

       // headMarketing.getSubordinates();
        ceo.getSubordinates();
        headMarketing.addEmployee(manager3);


    }
}
