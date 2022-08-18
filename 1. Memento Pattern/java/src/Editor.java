public class Editor {
    /* Editor class or general interface */

    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public State saveState(){
        return new State(this.content);
    }

    public void restoreState(History history){
        State state = history.pop();
        this.content = state.getContent();
    }

}
