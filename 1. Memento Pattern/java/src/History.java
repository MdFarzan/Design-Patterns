import java.util.ArrayList;
import java.util.List;

public class History {

    /* Class to store states (multiple states) */
    private List<State> history = new ArrayList<>();
    public State pop() {
        int lastIndex = this.history.size() - 1;
        State state = this.history.get(lastIndex);
        this.history.remove(lastIndex);
        return state;

    }

    public void push(State state) {
        this.history.add(state);
    }
    /* To store all states */
}
