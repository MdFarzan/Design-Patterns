
/*
*   to use as brush tool
* */
public class BrushTool implements Tool {

    @Override
    public void mouseUp() {
        System.out.println("Brush icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Drawing with brush");
    }
}
