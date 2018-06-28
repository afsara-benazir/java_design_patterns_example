package CompositeOffline;


//Task.java is the interface component
//LeafTask is the leaf class
//CompositeTask is the composite class
//TaskPatternDemo is the client class

public class TaskPatternDemo {
    public static void main(String[] args) {

        LeafTask study = new LeafTask ( "Study","Study about composite pattern",60,"not done" );
        CompositeTask implementProject = new CompositeTask ();

        LeafTask scenario = new LeafTask ( "Write scenario","try to be creative",20, "not done" );
        LeafTask UML = new LeafTask ( "Draw UML","use draw.io",30, "not done" );
        LeafTask code = new LeafTask ( "Code Implementation","remember to do version control",30,"not done" );

        CompositeTask Project = new CompositeTask ();

        Project.addTask (study);
        Project.addTask ( implementProject );

        implementProject.addTask (scenario);
        implementProject.addTask ( UML );
        implementProject.addTask ( code );

        Project.showTask ();

        int totalTime = study.getTime () + scenario.getTime () + UML.getTime () + code.getTime ();
        System.out.println ("Total time Required is " +totalTime +" minutes \n");

        study.setStatus ( "done" );

        totalTime = study.getTime () + scenario.getTime () + UML.getTime () + code.getTime ();
        System.out.println ("Total time Required is " +totalTime +" minutes \n");




    }
}
