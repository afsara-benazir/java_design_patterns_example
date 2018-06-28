package compositePatternGFG;

//Employee.java is interface or component base
// Developer.java, Manager.java are leaf class
//CompanyDirectory.java is composite class
//CompanyMain.java is client class
public class CompanyMain {

    public static void main(String[] args) {
        Developer dev1 = new Developer ( 1,"AFSARA","noob" );
        Developer dev2 = new Developer ( 2,"shouommo","pro" );

        Manager man1 = new Manager ( 101,"man1","general manager" );
        Manager man2 = new Manager ( 102,"man2","ass. manager" );

        CompanyDirectory engDirectory = new CompanyDirectory ();
        CompanyDirectory manDirectory = new CompanyDirectory ();
        CompanyDirectory directory = new CompanyDirectory ();

        engDirectory.addEmployee ( dev1 );
        engDirectory.addEmployee ( dev2 );

        manDirectory.addEmployee ( man1 );
        manDirectory.addEmployee ( man2 );

        directory.addEmployee ( engDirectory );
        directory.addEmployee ( manDirectory );
        directory.showEmployeeDetails ();

    }
}
