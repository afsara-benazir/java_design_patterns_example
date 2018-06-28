package compositePatternGFG;

public class Developer implements Employee {

    //attributes
    private String name;
    private int id;
    private String positionName;

    //constructor
    public Developer(int id, String name, String positionName)
    {
        this.id = id;
        this.name =  name;
        this.positionName = positionName;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println (id + " : " +name + " , " +positionName);

    }
}
