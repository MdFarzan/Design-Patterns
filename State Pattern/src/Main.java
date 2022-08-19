
/*
*   main Driver class
*   concept: Think about a text editor. When a tool is selected then it's behavior is changed on mouse clicks
* */

public class Main {
    static public void main(String args[]){

        Canvas canvas1 = new Canvas();

        canvas1.setTool(new SelectionTool());
        canvas1.mouseUp();
        canvas1.mouseDown();

        canvas1.setTool(new BrushTool());
        canvas1.mouseUp();
        canvas1.mouseDown();


    }
}
