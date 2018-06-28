package CompositeOffline;


import java.util.ArrayList;
import java.util.List;

public class CompositeTask implements Task {

   private List<Task> tasklist = new ArrayList<> ();

    public void addTask(Task task) {
        tasklist.add ( task );

    }

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