package CompositeOffline;

public class LeafTask implements Task{
    String title;
    String description;
    int time;

    public LeafTask(String title, String description,int time) {
        this.title = title;
        this.description = description;
        this.time = time;
    }

    public void showTask() {
        System.out.println ("Task Title : " +title);
        System.out.println ("Task Description : " +description);
        System.out.println ("Time required : " +time);

    }

}