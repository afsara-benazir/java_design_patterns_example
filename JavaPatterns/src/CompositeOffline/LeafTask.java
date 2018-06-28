package CompositeOffline;

public class LeafTask implements Task{

    //attribute fields
    public String title;
    public String description;
    private int time;
    private String status;

    //constructor
    public LeafTask(String title, String description,int time,String status) {
        this.title = title;
        this.description = description;
        this.time = time;
        this.status = status;
    }

    @Override
    public void showTask() {

        System.out.println ("Task Title : " +title);
        System.out.println ("Task Description : " +description);
        System.out.println ("Time required : " +time);
        System.out.println ("Status : " +status);
        System.out.println ();


    }

    //getter
    public int getTime()
    {
        return time;
    }

    //setter
    public void setStatus(String status) {
        this.status = status;
        System.out.println ("Status of " +title+" changed to " +status);
        if(status == "done") time = 0;
    }


}