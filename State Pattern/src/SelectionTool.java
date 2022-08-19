/*
*   to use as selection tool
* */
public class SelectionTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Selection icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Making selection");
    }
}
