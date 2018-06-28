package CompositeOffline;


import java.util.ArrayList;
import java.util.List;

public class CompositeTask implements Task {

    //attribute
   private List<Task> tasklist = new ArrayList<Task> ();

    //class method
    public void addTask(Task task) {
        tasklist.add ( task );

    }

    //class method
    public void removeTask(Task task) {
        tasklist.remove ( task );
    }

    @Override
    public void showTask() {

        for (Task task : tasklist) {
            task.showTask ();

        }
    }

}