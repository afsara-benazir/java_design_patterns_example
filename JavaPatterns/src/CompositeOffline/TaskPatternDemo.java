package CompositeOffline;


//Task.java is the interface component
//LeafTask is the leaf class
//CompositeTask is the composite class
//TaskPatternDemo is the client class

public class TaskPatternDemo {
    public static void main(String[] args) {

        LeafTask leaf1 = new LeafTask ( "Study","Study about composite pattern",20 );
        LeafTask leaf2 = new LeafTask ( "Implement Project","Complete the subtasks for implementing the whole project",20 );
        LeafTask leaf3 = new LeafTask ( "Write scenario","try to be creative",20 );
        LeafTask leaf4 = new LeafTask ( "Draw UML","use draw.io",20 );
        LeafTask leaf5 = new LeafTask ( "Code Implementation","remember to do version control",20 );

        CompositeTask task1 = new CompositeTask ();

    }
}
