/*
* concept:
* Think about an text editor. It allows us to undo things
* */
public class Main {
    /* Main Driver class */

    public static void main(String args[]){
//      instantiating
        Editor editor1 = new Editor();
        History history = new History();

//      setting & saving state
        editor1.setContent("State A");
        history.push(editor1.saveState());

//      setting & saving state again
        editor1.setContent("State B");
        history.push(editor1.saveState());

//      setting but not saving state to restore
        editor1.setContent("State C");

        try{
            // restoring state
            editor1.restoreState(history); // restored state will be B
            editor1.restoreState(history); // restored state will be A
//            editor1.restoreState(history); // state will be empty

            // displaying current state
            System.out.println(editor1.getContent());
        }

        /* handling out of index error */
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Nothing to restore");
        }

    }

}
