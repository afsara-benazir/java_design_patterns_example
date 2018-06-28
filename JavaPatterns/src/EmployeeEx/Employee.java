package EmployeeEx;

import java.util.ArrayList;
import java.util.List;

public interface Employee {

    void getSubordinates();

    public class Leaf implements Employee {

        String name;
        String dept;
        int salary;

        public Leaf(String name, String dept, int salary) {
            this.name = name;
            this.dept = dept;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Leaf{" +
                    "name='" + name + '\'' +
                    ", dept='" + dept + '\'' +
                    ", salary=" + salary +
                    '}';
        }

        public void getSubordinates() {
            System.out.println(toString());
        }

    }

    public class composite implements Employee{

        String name;
        String dept;
        int salary;
        List<Employee> empList = new ArrayList<>();

        public composite(String name, String dept, int salary) {
            this.name = name;
            this.dept = dept;
            this.salary = salary;
        }


        public void addEmployee(Employee employee) {

            empList.add(employee);

        }

        public void removeEmployee(Employee employee) {

            empList.remove(employee);
        }


        public void getSubordinates(){

            System.out.println(name);
            //System.out.println(toString());
            for(Employee e : empList)
            {
                e.getSubordinates();
            }

        }

    }


}
