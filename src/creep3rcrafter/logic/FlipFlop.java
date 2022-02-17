package creep3rcrafter.logic;

public class FlipFlop {
    private boolean before = false;
    private boolean output = false;

    public boolean flipFlop(boolean input) {
        if (input) {
            before = true;
        }
        if (!input && before) {
            output = !output;
            before = false;
        }

        return output;
    }
}
